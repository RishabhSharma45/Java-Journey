package methodOverloading;

class parent{
	void m1() {
		System.out.println("parent");
	}
}
class child extends parent{
	void m1(String b) {
		System.out.println("child");
	}
}
public class Overloading {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent p1 = new parent();
		p1.m1();
		child c1 = new child();
		c1.m1();
		parent p2 =  new child();  //care by reference type not by runtime......
		p2.m1();

	}

}
