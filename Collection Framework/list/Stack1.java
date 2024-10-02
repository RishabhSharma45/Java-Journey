package list;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(0);
		st.push(1);
		st.push(2);
		System.out.println(st);
		System.out.println(st.peek());
		st.pop();
		System.out.println(st);
		System.out.println(st.isEmpty());
		

	}

}
