package Map;

import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap hs = new TreeMap<>();
		hs.put(1, "hello");
		hs.put(2, "hii");
		hs.put(3, null);
		//hs.put(null, null); no null acceptable
		System.out.println(hs);
		hs.put(52, "hello");
		hs.put(61, "hii");
		hs.put(98, null);
		hs.put(77, "hello");
		hs.put(81, "hii");
		hs.put(10, null);
		System.out.println(hs);
		hs.put(5, "hello");
		hs.put(6, "hii");
		hs.put(9, null);
		hs.put(7, "hello");
		hs.put(8, "hii");
		hs.put(10, null); // sorted with no duplication
		
		System.out.println(hs.get(1));
		hs.remove(2);
		System.out.println(hs);

	}

}
