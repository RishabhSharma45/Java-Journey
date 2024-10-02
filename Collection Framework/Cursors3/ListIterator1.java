package Cursors3;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator1 {
	
	//only ilst can access

	public static void main(String[] args) {
		// has 9 methods

		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(5);
		a.add(3);
		a.add(2);
		a.add(4);
		System.out.println(a);
		
		ListIterator e = a.listIterator();	
		if(e.hasNext()) {
			System.out.println(e.next());
			e.add(2);
			//e.set(5);
		}
		if(e.hasPrevious()) {
			System.out.println(e.previous());
		}
		
		
	}

}
