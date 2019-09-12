
public class Main {

	public static void main(String[] args) {
		
		// Just playing around and verifying that Java uses C/C++ like syntax.
		
		char Character = 0x0031;
		System.out.println(Character);
		
		if(Character == '0') {
			System.out.println("Yup");
		} else {
			System.out.println("Nope");
		}
		
		boolean test = (testMethod() == true) ? true : false;
		
		if(test) {
			System.out.println("Yup again");
		} else {
			System.out.println("Nope Again");
		}
	}
	
	private static boolean testMethod( ) {
		
		return true;
	}

}
