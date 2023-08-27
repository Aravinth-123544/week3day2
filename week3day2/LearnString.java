package week3day2;


public class LearnString {

	public static void main(String[] args) {
		//litersl
		String s1= "Testleaf";
		String s2= "TestLeaf";
		//using object
		String str=new String ("Testleaf");
		//String value
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		//==compare reference memory
		System.out.println(s1==str);
		//count my string
		int len = s1.length();  //assign local var
		System.out.println(len);
		//need to check char
		System.out.println(s1.contains("F"));
		//convert string to CharArray
		char[]ch=s1.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
			
			
			
			
			
		}
		
		

	}
	
	

}

