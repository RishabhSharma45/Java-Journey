package ExceptionHandling;
/*
 * what is exception and exceptional handling
 * exception is define as the unwanted or unexpected event which stop the flow of program
 * whereas the exceptional handling is define as the backup or alternate way to achieve the target...
 * or can say graceful termination of the program
 */

// what is error
/*
 * exception is something which is recoverable
 * whereas error is something beyond the hands of the programmer which is irrecoverable .
 * it is jvm level exception . such as stack overflow , jvm running out of memory...
 */
public class TryCatch {

	/*
	 * try and catch blocks are used to handle error . it is customised way to handle error.
	 * when a error come a object will created in stack and jvm is looking for function to handle exception
	 * hence it repeat rewind untill exception not handeled....  
	 */
	
	/*
	 * there is one automatic or default exception handling in java in which exception was handeled by java by default exception handling function
	 */
	
	/*
	 * similarly there is cutomised exception handling in which programmer handle exception by own
	 */
	
	// let see
	
	public static void main(String args[]) {
	
	try {
		int b = 100/0;
	}
	catch(Exception e) {
		e.printStackTrace();
		System.out.println(e.toString());
		System.out.println(e.getMessage());
		}
			

    /*
     * types of exception--
     * there is throwable class wich have 1. exception and 2. error
     * where exception is of two types - 1. user defined , 2. built in
     * and built in exception further classified as -
     * 1. checked and 2. unchecked
     * */

/*
 * methods to print exception
 * 1.printStackTrace
 * 2.getMessage
 * 3.toString
 */

       //as mentioned above

// try with multiple catch
  try {
	  int c = 500/0;
  }
  catch(Exception e1) {
	  e1.printStackTrace();
  }
  /*catch(Exception e2) {
	  e2.printStackTrace();
  }*/
	}
}








