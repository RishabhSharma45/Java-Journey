package Cursors3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Iterator1 {
	
	//can be used by any collection

	public static void main(String[] args) {
		// has 3 methods
		
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(5);
		a.add(3);
		a.add(2);
		a.add(4);
		System.out.println(a);
		
		Iterator i = a.iterator();
		if(i.hasNext()) {
			int k = (int) i.next();
			if(k==1) {
				i.remove();
			}
			System.out.println(i.next());
		}

	}

}
