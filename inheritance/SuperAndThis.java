package inheritance;

class M1{
	
	int a = 100;
	
	public M1() {
		System.out.println("I am a constructor of m1 ");
	}
	
	public M1(int a) {
		this.a=a;
		System.out.println("I am a constructor of m1 " + a);
	}
	
	
	
	void m1() {
		System.out.println("I am a method of m1 ");
	}
}

class M2 extends M1{
	
	public M2() {
		
			System.out.println("I am a constructor of m2 ");
		
	}
	
	void m1() {
		super.m1();
		System.out.println("I am a method of m2 ");
	}
}

public class SuperAndThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M1 m1 = new M1(100);
		//m1.m1();
		M2 m = new M2();
		m.m1();
	}

}
