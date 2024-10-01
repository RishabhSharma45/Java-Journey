package inheritance;

class inherit {
	void hello() {
		System.out.println("hello");
	}
}

public class Inheritance1 extends inherit {
      public static void main(String args[]) {
    	 // inherit i = new inherit();
    	  Inheritance1 i = new Inheritance1();
    	  i.hello();
      }
}
