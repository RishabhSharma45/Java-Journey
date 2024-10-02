package ComprableVsComprator;

import java.util.ArrayList;
import java.util.Collections;

class Comparable1 implements Comparable<Comparable1>{
	
	int id;
	String name;
	
	Comparable1(int id , String name){
		this.id=id;
		this.name=name;
	}
	 
	@Override
	public int compareTo(Comparable1 o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.id,o.id);
	}

	@Override
	public String toString() {
		return "Comparable1 [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class practise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Comparable1> a = new ArrayList<>();
		a.add(new Comparable1(1,"hello"));
		a.add(new Comparable1(5,"hello"));
		a.add(new Comparable1(4,"hello"));
		a.add(new Comparable1(2,"hello"));
		Collections.sort(a);
		for(Comparable c : a) {
			System.out.println(c);
		}
	}

}
