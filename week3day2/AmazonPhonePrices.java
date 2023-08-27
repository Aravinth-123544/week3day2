package week3day2;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPhonePrices {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASHA\\chromeDriver\\chromedriver.exe");
		ChromeDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://amazon.in");
		driver.findElement(By.id("twotabserchtextbox")).sendKeys("Phones");
		driver.findElement(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']")).click();
		
		List<WebElement> Price = driver.findElements(By.className("a-price-whole"));
		System.out.println(Price.size());
		for (int i= 0; i < Price.size();i++) {
			System.out.println(Price.get(i).getText());
		}
		
	}
}
