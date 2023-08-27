package week3day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String value = "madam";
	        String rev = "";

	        for (int i = value.length() - 1; i >= 0; i--) {
	            rev += value.charAt(i);
	        }

	        if (value.equals(rev)) {
	            System.out.println("Palindrome");
	        } else {
	            System.out.println("Not a palindrome");
	        }
	    }

	}


