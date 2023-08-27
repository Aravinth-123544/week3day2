package week3day2;

public class FindCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "TestLeaf";
        char targetChar = 'e';
        
        int count = 0;
        char[] charArray = input.toCharArray();
        
        for (char c : charArray) {
            if (c == targetChar) {
                count++;
            }
        }
        
        System.out.println("The character " + targetChar + " appears " + count + " times in the string");
    }

	}


