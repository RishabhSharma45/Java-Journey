package Sets;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
	
	/*
	 * in LinkedHashSet insertion preserved
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(1);
		lhs.add(2);
		lhs.add(3);
		lhs.add(4);
		System.out.println(lhs);
		//lhs.addFirst(0);
		//lhs.addLast(5);   undefined
		System.out.println(lhs);

	}

}
