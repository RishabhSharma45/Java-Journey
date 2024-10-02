package Sets;

import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedSet<Integer> st = new TreeSet<>();
		st.add(1);
		st.add(5);
		st.add(2);
		st.add(4);
		st.add(3);
		System.out.println(st);  //sorted set
		
		/*first element =*/  System.out.println(st.first());
		/*Last element =*/  System.out.println(st.last());
		
		st.remove(2);
		 System.out.println(st);
		
		SortedSet<Integer> st2 = st.subSet(0, 5);  // taling values as parameter
		System.out.println(st2);
	}

}
