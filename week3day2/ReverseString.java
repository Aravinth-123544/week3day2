package week3day2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Amazon development centre, Chennai";
        String[] words = input.toLowerCase().split(" ");
        int wordCount = words.length;
        
        for (int i = wordCount - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if (i != 0) {
                System.out.print(" ");
            }
        }
    }

	}


