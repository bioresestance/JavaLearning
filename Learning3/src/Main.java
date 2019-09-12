import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int number = getUserInputs();
		System.out.println("Largest prime of " + number + " is " + getLargestPrime(number));
	}
	
	public static int getLargestPrime(int number) {
		
		int i, j;
		int largestPrime = 0;
		int currPrime = 0;
		int temp;

		if (number <= 1)
			return -1;

		for (i = 0; i < number; i++) {
			for (j = 0; j <= number; j++) {
				if ((i * j) == number) {
					currPrime = Math.max(i, j);
				}
			}
		}			
		if( currPrime == number) return number;		
		// If new prime can be broken down again.
		temp = getLargestPrime(currPrime);
		if( temp >= 2 ) {
			largestPrime = temp;
		} else {
			largestPrime = currPrime;
		}		
		return largestPrime;	
	}
	
	public static int getUserInputs() {
		
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		
		System.out.println("Please Enter 10 numbers into the Console: ");
		
		while( count < 10 ) {
			
			System.out.println("Enter number #" + count);
			if( scanner.hasNextInt() ) {
				sum += scanner.nextInt();
				count++;
			} else {
				System.out.println("Invalid Number");
			}
			scanner.nextLine();
			
		}
		scanner.close();
		System.out.println( "Total Sum is " + sum );
		return sum;
	}
	
}
