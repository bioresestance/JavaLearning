package bromma.aaron;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int[] array = getIntegers(5);
		printArray(array);
		int[] sortedArray = sortIntegers(array);
		printArray(sortedArray);
	}

	public static int[] getIntegers(int numToGet) {
		
		int[] enteredValues = new int[numToGet];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter " + numToGet + " numbers \n");
		for(int i = 0; i < enteredValues.length; i++) {
			enteredValues[i] = scanner.nextInt();
		}
		scanner.close();
		return enteredValues;
	}
	
	
	public static void printArray( int[] values) {
		
		for( int i = 0; i < values.length; i++ ) {
			System.out.println("Value " + i + " is " + values[i]);
		}
	}
	
	public static int[] sortIntegers( int[] array) {
		
		// Make another array thats the same length of the passed one.
		int[] sortedArray = new int[array.length];
		int max = Integer.MAX_VALUE;
		int curr_max = 0;
		
		for( int i = 0; i < array.length; i++ ) {
			curr_max = 0;
			for( int j = 0; j < array.length; j++ ) {
				// Loop through to find the next highest number that under the last highest number.
				if( array[j] > curr_max && array[j] < max ) {
					curr_max = array[j];
				}
			}
			// Set the ceiling to be the new highest value.
			max = curr_max;
			sortedArray[i] = curr_max;
		}
		
		
		return sortedArray;
	}
	
}
