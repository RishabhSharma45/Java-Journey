package Thread;

import java.util.function.Predicate;

 class Sleepmethodimpl implements Runnable {
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			//Predicate<Integer> p1 = (x)-> x%2==0 ;
			if(i%2==0) {
				System.out.println(i);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sleepmethodimpl runnable = new Sleepmethodimpl();
		Thread th = new Thread(runnable);
		th.start();
	}
 }
 
 
