package ImportsInJava;

import java.util.*;  //implicit import   increases readaptibility ...

public class ImplicitImports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {8,4,6,2,1,5,3};
		Arrays.sort(a);
		for(int a1 : a) {
			System.out.println(a1);
		}

	}

}
