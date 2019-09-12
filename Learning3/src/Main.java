
public class Main {

	public static void main(String[] args) {
		int number = 7;
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
	
}
