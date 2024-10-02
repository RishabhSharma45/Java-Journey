package Sets;

import java.util.HashSet;

public class HashSet1 {
	
	/*
	 * it is also a child class od collection interface
	 * here duplicates are not allowed and no insertion preserved
	 * set -> hashset -> linkedset.....
	 * and also set -> sortedset -> navigable set...
	 */
	
	static HashSet hs = new HashSet<>();

	public static void main(String[] args) {
		hs.add(null);
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add("hello");
		System.out.println(hs);
		System.out.println(hs.contains("hello"));
		HashSet hs1 = new HashSet(hs);
		System.out.println(hs.equals(hs1)); // in hashset it checks content
		hs.remove(1);
		System.out.println(hs);
		HashSet hs2 = new HashSet();
		hs2.add(10);
		hs2.add(11);
		hs2.add(12);
		hs.addAll(hs2);  // union of two sets
		System.out.println(hs);
		HashSet hs3 = new HashSet();
		hs3.add(11);
		hs3.add(12);
		hs3.add(13);
		hs.retainAll(hs3);  //intersection
		System.out.println(hs);
		

		

	}

}
