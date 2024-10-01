package methodOverRiding;

// same method redefining by child class of parent class
// dynamic polymorphism

class A{
	
	private void hello1(int a) {
		System.out.println(a);
	}
	
	final void hello2(int a) {
		System.out.println(a);
	}
	
	void hello() {
		System.out.println("A");
	}
	
	void hello3() {
		System.out.println("hello");
	}
	

}
class B extends A{
	
	void hello() {  // while overriding method names should same with same parameters
		System.out.println("B");
		
		//lets try to override private method
		/*private void hello1(int a) {
			** error given as private method does not override
			*similarly we cannot override final methods
		}*/
		
		//lets see for final
		/*void hello2(int a) {
			* error as you cannot override final methods
		}*/
	}
		
		final void hello3() {     // non final method as final can overrided
			System.out.println("hello");
		}
		
		//similarly abstract classes can be overrided as non abstract and non abstract classes can overrided as abstract
		//no over riding for static to non static or vice versa
		//but static to static can be possible known as method hiding.......
		
	}


public class OverRiding1 {

	public static void main(String[] args) {
		A a = new A();
		a.hello();
		B b = new B();
		b.hello();
		A a1 = new B();  //not by refrence type by runtime object........
		a1.hello();
	}

}
