package Sets;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NavigableSet<Integer> n = new TreeSet<>();
		n.add(1);
		n.add(3);
		n.add(2);
		n.add(4);
		n.add(5);
	  System.out.println(n);
		
	  System.out.println(n.floor(5));
	  System.out.println(n.ceiling(5));
	  System.out.println(n.lower(5));
	  System.out.println(n.higher(2));
	  
	  System.out.println(n.pollFirst());
	  System.out.println(n.pollLast());
	  System.out.println(n);
	  
	  NavigableSet<Integer> n2 = n.descendingSet();
	  System.out.println(n2);  
	}

}
