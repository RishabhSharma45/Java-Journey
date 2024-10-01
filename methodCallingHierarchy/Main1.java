package methodCallingHierarchy;

class CallingHierarchy{
	public CallingHierarchy() {
		System.out.println("Constructor");
	}
	public CallingHierarchy(String para) {
		System.out.println("Constructor with "+ para);
	}
	static {
		System.out.println("Static block");
	}
	{
		System.out.println("Non - Static block");
	}
}

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallingHierarchy ch = new CallingHierarchy("Parameter");

	}

}
