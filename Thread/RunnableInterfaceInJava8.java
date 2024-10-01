package Thread;

import java.util.function.Predicate;

public class RunnableInterfaceInJava8 {
     public static void main(String args[]) {
    	 Runnable runnable = ()->{
    		 for(int i=0;i<10;i++) {
    			 Predicate<Integer> p1 = (x)->x%2==0;
    			 if(p1.test(i)) {
    				 System.out.println(i);
    			 }
    			 try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		 }
    	 };
    	 
    	 Runnable runnable2 = ()->{
    		 for(int i=10;i<20;i++) {
    			 Predicate<Integer> p1 = (x)->x%2==0;
    			 if(p1.test(i)) {
    				 System.out.println(i);
    			 }
    			 try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		 }
    	 };
    	 
    	 Runnable runnable3 = ()->{
    		 for(int i=20;i<30;i++) {
    			 Predicate<Integer> p1 = (x)->x%2==0;
    			 if(p1.test(i)) {
    				 System.out.println(i);
    			 }
    			 try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		 }
    	 };
    	 
    	 Thread th = new Thread(runnable);
    	 Thread th2 = new Thread(runnable2);
    	 Thread th3 = new Thread(runnable3);
    	 th.start();
    	 th2.start();
    	 th3.start();
    	 try {
			th2.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 th.setPriority(1);
     }
     

}
