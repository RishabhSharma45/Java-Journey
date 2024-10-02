package Cursors3;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class Enumeration1 {
	//Enumeration can be used with only for legacy classes...

	public static void main(String[] args) {
		//ArrayList<Integer> a = new ArrayList<>();
		Vector<Integer> a = new Vector<>();
		a.add(1);
		a.add(5);
		a.add(3);
		a.add(2);
		a.add(4);
		System.out.println(a);
		
		Enumeration e = a.elements();
		int i=0;
		while(i<a.size()) {
		if(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		i++;
		}
		
		//enumeration has only two methods.... 
		
	}

}
