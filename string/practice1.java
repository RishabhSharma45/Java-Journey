package string;

import java.util.function.Predicate;

public class practice1 {
	
	// in our day to day programming the most usable thing is String
	
	
	
	
   public static void main(String args[]) {
	   
	 //String vs String buffer
	   
	   String s = new String("hello");
	   s.concat("world");
	   System.out.println(s);
	   
	   StringBuffer sb = new StringBuffer("hello");
	   sb.append(" world");
	   System.out.println(sb);
	   
	// mutability vs immutability
	   
	   //reference operator
	   String s1 = new String("hello");
	   String s2 = new String("hello");
	   if(s1==s2) {
		   System.out.println(true);   // reference operator == looking for the same address
	   }
	   else {
		   System.out.println("false");
	   }
	   
	   String s3 = "hello";
	   String s4 = "hello";
	   if(s3==s4) {
		   System.out.println(true);
	   }
	   else {
		   System.out.println("false");
	   }
	   
	   if(s3.equals(s4)) {
		   System.out.println(true);
	   }
	   else {
		   System.out.println("false");
	   }
	   
	   if(s1.equals(s2)) {
		   System.out.println(true);
	   }  // .equals mathces same content
	   else {
		   System.out.println("false");
	   }
	   
       System.out.println();
       
       
	   //String buffer with refrence operator and .equals method
       
	   StringBuffer sb1 = new StringBuffer("hello");
	   StringBuffer sb2 = new StringBuffer("hello");
	   if(sb1.equals(sb2)) {
		   System.out.println(true);
	   }  // .equals also looking for address in stringbuffer not check for content
	   else {
		   System.out.println("false");
	   }
	   if(s1==s2) {
		   System.out.println(true);
	   }    //referecne operator will gave always false for sb compare because they never shared a common memory
	   else {
		   System.out.println("false");
	   }
	   
	   System.out.println();
       
	   //heap vs scp (String constant pool) - for reusability....
	   //in scp n need of creating new object , refrencing object by content checking....
	   
	   //final keyword 
	   final StringBuffer sb3 = new StringBuffer("hello");
	   System.out.println(sb3);
	   sb3.append("dfghjkl");
	   System.out.println(sb3);
	   
	   final String s5 = "you cannot";
	   String s6 = s5 + "Change me";
	   if(s5==s6) {
		   System.out.println(true);
	   }
	   
	   //advantage of scp
	   /*
	    * if things are repeating itself than no need to make objects again and again for them instead we can refrence them thus performance increases
	    * problem if one change make to a object than change will reflect in all object
	    * hence concept of immutability introduced means for changable object new object will created
	    */
	   
	   //string constructor 
	   String a = new String(new StringBuffer("hello"));
	   String b = new String(new StringBuilder("hello"));
	   //String c = new String(char c);
	   //String d = new String(byte d);
	   
	   //Creation of our own class--- that is immutable
	   
	   //final vs immutability
	   
	     final String s8 = "hello";
	    // s8 = "world"; will gave error
	     //but still immutable as-
	     System.out.println(s8.concat("world"));
	   
	   //need of string buffer , its constructor , and its method
	     //string is immutable to introduce mutability we use string buffer...
	   //string builder , its need and its method
	     
	     /*
	      * StringBuffer is a Java class used to create mutable (modifiable) strings. It is similar to StringBuilder, but the key difference is that StringBuffer is synchronized, making it thread-safe.
	      *  This makes StringBuffer slightly slower than StringBuilder, but safer to use in multi-threaded environments.
	      */
	     
	     StringBuilder st = new StringBuilder("hello");
	     System.out.println(st);
	     st.append(" world");
	     System.out.println(st);
	     st.insert(5, " hii");
	     System.out.println(st);
	     st.reverse();
	     System.out.println(st);
	     st.delete(0, 1);
	     System.out.println(st);
	     st.reverse();
	     System.out.println(st);
	     st.append("d");
	     System.out.println(st);
	     
	   
	   //string vs stringbuilder vs stringbuffer
	   
	   //method chaining
	     //multiple method in single line
	     String s10 = "      helloWorld";
	     String result = s10.trim().toLowerCase().substring(0, 5);
	     System.out.println(result);
       
	   
       
       
	   
	   
	   /*String s = "Shrimant Peshwa Bajirao Balaji Vallad";
	   System.out.println(s.charAt(0));
	   System.out.println(s.toLowerCase());
	   System.out.println(s.toUpperCase());
	   System.out.println(s.matches("balaji"));
	   s = s.replace('s', 'S');
	   s = s.concat(" Akhand Bharat");
	   System.out.println(s);
	   System.out.println(s.length());*/
   }
}
