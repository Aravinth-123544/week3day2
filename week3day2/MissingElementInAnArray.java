package week3day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {1, 2, 3, 4, 7, 6, 8};
        
        // Sort the array
        Arrays.sort(arr);
        
        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the iterator variable is not equal to the array value respectively
            if (i + 1 != arr[i]) {
                // Print the missing number
                System.out.println("Missing element: " + (i + 1));
                // Once printed, break the iteration
                break;
            }
        }
    }

	}


