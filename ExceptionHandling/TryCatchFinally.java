package ExceptionHandling;

public class TryCatchFinally {
  public static void main(String[] main) {
	  try {
		  String s = null;
		  s.length();
		  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  finally {  // always execute 
		  System.out.println("finnaly block");
	  }
	  
	  try {
		  String s = "hello";
		  System.out.println(s.length());
		  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  finally {  // always execute   use to release resources and cleaned operations.....
		  System.out.println("finnaly block");
	  }
	  
	  //finalise keyword is used to collect garbage of object as passed before to release resources
  }
}
