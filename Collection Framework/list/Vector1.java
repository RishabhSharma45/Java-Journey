package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Vector1 {
	
	/*
	 * similar to arrayList but is is synchronised
	 * hence thread safe
	 * but slower than arraylist
	 * generally it have long method names
	 */
	
	//** arraylist vs linkedlist vs vector.......

	static Vector<Integer> v = new Vector<>();
	
	static ArrayList<Integer> a = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//synchronised arraylist
		
		//is it is possible to make arraylist synchronised
		List<Integer> l = Collections.synchronizedList(a);
		System.out.println(a);
		
		v.add(1);
		v.addElement(2);
		System.out.println(v.elementAt(1));
		System.out.println(v);
		

	}

}
