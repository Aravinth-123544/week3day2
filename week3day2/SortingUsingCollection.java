package week3day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] companies = {"HCL", "Wipro", "Aspire Systems", "CTS"};
        int length = companies.length;
        
        List<String> companyList = Arrays.asList(companies); // Convert array to List
        Collections.sort(companyList); // Sort the list
        
        for (int i = length - 1; i >= 0; i--) { // Iterate in reverse order
            System.out.print(companyList.get(i));
            if (i != 0) {
                System.out.print(", ");
            }
        }
		

	}

}
