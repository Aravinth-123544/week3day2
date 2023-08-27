package week3day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input = "babu";
	        char[] charArray = input.toCharArray();
	        
	        Set<Character> uniqueChars = new HashSet<Character>();
	        
	        for (char c : charArray) {
	            if (!uniqueChars.contains(c)) {
	                uniqueChars.add(c);
	            } else {
	                uniqueChars.remove(c);
	            }
	        }
	        
	        for (char uniqueChar : uniqueChars) {
	            System.out.print(uniqueChar + " ");
	        }

	}

}
