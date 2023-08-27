package week3day2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "PayPal India";
        char[] charArray = input.toCharArray();
        
        Set<Character> charSet = new HashSet<Character>();
        Set<Character> dupCharSet = new HashSet<Character>();
        
        for (char c : charArray) {
            if (!charSet.add(c)) {
                dupCharSet.add(c);
            }
        }
        
        charSet.removeAll(dupCharSet);
        
        for (char c : charSet) {
            if (c != ' ') {
                System.out.print(c);
            }
        }

	}

}
