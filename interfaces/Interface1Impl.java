package interfaces;

public class Interface1Impl implements Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface1 intf = new Interface1Impl();
       intf.hello();
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
	}

}
