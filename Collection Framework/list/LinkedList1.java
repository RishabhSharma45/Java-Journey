package list;

import java.util.LinkedList;

public class LinkedList1 {
	
	/*
	 * same as arraylist but it does not have contigous allocation of memory
	 * adding or removing object become efficient
	 * but in case of retrieval it is burst
	 * underline data structure - doublyll
	 * it has no random access
	 * insertion order preserved 
	 * duplicates allowed
	 * null value also allowed 
	 * hetrogenous data
	 */
	
	 static LinkedList<Integer> a = new LinkedList<>();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a.add(1);
		a.add(2);
		System.out.println(a);
		a.addFirst(0);
		a.addLast(3);
		System.out.println(a);
		a.remove(3);
		System.out.println(a);

	}

}
