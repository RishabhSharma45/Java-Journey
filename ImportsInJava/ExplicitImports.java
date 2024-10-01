package ImportsInJava;

import java.util.Arrays;   //explicit import  reduces readaptability always go for this....
// Always remember we dont have to import java.lang  -- as for string,exception and thread etc
// no need to import statements for default packages or some working directory  
// packages are used to group entities having similarity in single unit
public class ExplicitImports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,6,2,5,4,7};
		Arrays.sort(a);
		for(int a1 : a) {
			System.out.println(a1);
		}

	}

}
