package Thread;

class Thread2 extends Thread{
	
	public Thread2(String name , int priority){
		super(name);
		setPriority(priority);
	}
	
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(getName()+ "is running" + i);
		}
		
	}
}

public class ThreadSchedular {

	public static void main(String[] args) {
		Thread2 t1 = new Thread2("Max_priority thread" , Thread.MAX_PRIORITY );
		Thread2 t2 = new Thread2("Norm_priority thread" , Thread.NORM_PRIORITY );
		Thread2 t3 = new Thread2("Min_priority thread" , Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		
		

	}

}
