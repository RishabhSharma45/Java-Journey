package Sets;

import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> t = new TreeSet<>();
		t.add(1);
		t.add(5);
		t.add(7);
		t.add(6);
		t.add(3);
		  System.out.println(t);
		  System.out.println(t.first());
		  System.out.println(t.last());
		System.out.println(t);
		System.out.println(t.descendingSet());  // no object creation
		t.pollFirst();
		t.pollLast();
		System.out.println(t);

	}

}
