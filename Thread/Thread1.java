package Thread;

class myThread1 extends Thread{
	public void run() {
		System.out.println("Hello");
	}
}

public class Thread1 extends myThread1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1 = new Thread1();
		t1.start();
		
		

	}

}
