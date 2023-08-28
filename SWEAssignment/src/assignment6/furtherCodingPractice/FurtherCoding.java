package assignment6.furtherCodingPractice;

public class FurtherCoding {
	
	public static void printHelloWorld(int[] numbers) {
        for (int number : numbers) {
        	if (number % 5 == 0 && number % 7 == 0) {
	               System.out.println("HelloWorld");
	        } else if (number % 5 == 0) {
	        	System.out.println("Hello");
	          } else if (number % 7 == 0) {
	               System.out.println("World");
	            }
	        }
	}
	
	public static int findSecondBiggest(int[] numbers) {
        if (numbers.length < 2) {
            throw new IllegalArgumentException("Array should have at least two elements.");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("There is no second largest element.");
        }

        return secondLargest;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] numbers = {10, 14, 35, 40, 49, 70};
	     printHelloWorld(numbers);
	     int[] array1 = {1, 2, 3, 4, 5};
	        int[] array2 = {19, 9, 11, 0, 12};

	        System.out.println("Second biggest in array1: " + findSecondBiggest(array1));
	        System.out.println("Second biggest in array2: " + findSecondBiggest(array2)); 

	}

}
