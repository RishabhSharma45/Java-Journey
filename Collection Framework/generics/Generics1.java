package generics;

import java.util.ArrayList;

class Student<T>{
	T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	
	
}

public class Generics1 {

	public static void main(String[] args) {
     Student<Integer> s = new Student();
     s.setItem(1);
     System.out.println(s.getItem());

	}

}
