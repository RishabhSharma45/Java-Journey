package ExceptionHandling;
/*
 * throw keyword is used to throw exception manually
 */

public class ThrowAndTrhows {
	
	public static void vote(int age) {
		if(age<18) {
			throw new ArithmeticException("you are underage to vote "); //manually exception thown
		}
		else {
			System.out.println("you can vote");
			}
	}
	
	public static void divide(int b) throws ArithmeticException{ // a method might have error
		int a = 100;
		if(b==0) {
			throw new ArithmeticException("no. cannot be divisible by 0");
		}
	}

	public static void main (String args[]) {
		try {
		vote(17);
		try {
		divide(0);
		}
		catch(Exception e1) {
			e1.printStackTrace();
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("rest of program");
		
	}
}
