package methodOverloading;

public class Overloading1 {
	static //method overloading means using same method names with different parameters.
	
	void m1() {
		System.out.println("Ram Ram");
	}
	static int m1(int a) {
		return a;
		
	}
	static void m1(String a) {
		System.out.println(a);
	}
	static double m1(double a) {
		return a;
		
	}
	
	static int[] m1(int... a) {
		System.out.print(a[0]);
		return a;
	}
	
	
	
	//complexity reduces.......

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
		System.out.println(m1(100));
		m1("hello");
		System.out.println(m1(100.78f)); // automatic promotion in overloading float -> double.
		//means if exactly parameter does not matches than promotion will did by compiler . but if exact match occur than higher priority will given to that one
		
		// byte->short->int->long->float->double
		//               |
		//               |
		//              char
		
		m1(101,102);
		
		 

	}

}
