package list;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayList1 {
	
	/*
	 * arraylist is growable
	 * duplicates allowed
	 * insertion preserved
	 * null value acceptable
	 */
	
	//constructors
	 static ArrayList<Integer> a = new ArrayList<>();
	 ArrayList<String> b = new ArrayList<>(/*size 10*/ 10);
	 ArrayList<String> c = new ArrayList<>(/* collection c*/ new HashSet<String>());
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(a);
      a.add(1);
      a.add(2);
      a.add(3);
      a.add(null);
      a.add(null);
      System.out.println(a.get(2));
      a.set(4, 4);
      int[] a1 = {5,6,7,8};
    a.add(0);
    System.out.println(a);
   // a.addLast(2); undefined will gave error for arraylist
    System.out.println(a);
      a.remove(4);
      System.out.println(a);
      
      //array list implement random access . that is also implemented by vector only
      //all collection frameworks implements serializable and clonable interface
      // arraylist perfomance is burst incase of retriving or manipulating objects in between....
	}

}
