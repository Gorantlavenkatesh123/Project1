package Secondlargestnumber.com;

public class SecondLargestNumber {
	
	    public static int findSecondLargest(int[] array) {
	        if (array.length < 2) {
	            System.out.println("Array should have at least two elements");
	            return -1; // Or handle the case appropriately
	        }

	        int firstLargest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int i = 0; i < array.length; i++) {
	            if (array[i] > firstLargest) {
	                secondLargest = firstLargest;
	                firstLargest = array[i];
	            } else if (array[i] > secondLargest && array[i] != firstLargest) {
	                secondLargest = array[i];
	            }
	        }

	        if (secondLargest == Integer.MIN_VALUE) {
	            System.out.println("There is no second largest element in the array");
	            return -1; // Or handle the case appropriately
	        }

	        return secondLargest;
	    }

	    public static void main(String[] args) {
	        int[] array = {10, 5, 8, 20, 15};
	        int secondLargest = findSecondLargest(array);

	        if (secondLargest != -1) {
	            System.out.println("Second largest element in the array: " + secondLargest);
	        }
	    }
	}



