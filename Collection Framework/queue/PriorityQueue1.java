package queue;

import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		PriorityQueue<Integer> p = new PriorityQueue<>();
		p.add(1);
		p.add(2);
		p.add(3);  //gave exception
		System.out.println(p);
		p.offer(4);
		p.offer(5);
		p.offer(6); //return null in case of full 
		System.out.println(p);
		
		//add vs offer
		
		p.remove();
	    p.remove();
	    p.remove();
	    p.poll();
	    p.poll();
	    p.poll();
	    System.out.println(p);
	    
	    //remove vs poll
	    p.poll();  //retrun null value..
	    p.poll();
	   // p.remove(); //gave exception
	    System.out.println(p);
	    
	    p.offer(1);
	    p.offer(2);
	    p.offer(3);
	    System.out.println(p);
	    
	    System.out.println(p.peek());
	    System.out.println(p.element());
	    //peek vs element
	    p.poll();
	    p.poll();
	    p.poll();
	    System.out.println(p);
	    System.out.println(p.peek()); // return null
	    //System.out.println(p.element()); //gave exception
	    
	    
	}

}
