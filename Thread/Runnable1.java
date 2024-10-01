package Thread;

class ForThreadingClass implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
	}
	
}

public class Runnable1 extends ForThreadingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable1 r1 = new Runnable1();
		Thread th = new Thread(r1);
		th.start();

	}

}
