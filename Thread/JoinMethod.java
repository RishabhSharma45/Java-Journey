package Thread;

class Thread3 extends Thread{
	
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("current thread" + Thread.currentThread().getName());
			System.out.println();
		}
	}
	
}


public class JoinMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread3 t1 = new Thread3();
		Thread3 t2 = new Thread3();
		Thread3 t3 = new Thread3();
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		
	}
}


