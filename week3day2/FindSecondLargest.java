package week3day2;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3, 2, 11, 4, 6, 7};

        // Arrange the array in ascending order using bubble sort
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    // Swap data[j] and data[j+1]
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        
        // Find and print the second element from the end (second largest)
        int secondLargest = data[data.length - 2];
        System.out.println("Second largest element: " + secondLargest);
    }

	}


