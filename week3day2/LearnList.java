package week3day2;

import java.util.ArrayList;
import java.util.List;



public class LearnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> stName =new ArrayList<Integer>();
		stName.add(10);
		stName.add(30);
		stName.add(10);
		stName.add(50);
		//print list
		System.out.println(stName);
		//get particular
		System.out.println(stName.get(3));
		//remove
		System.out.println(stName.remove(3));
		//stName.clear

	}

}
