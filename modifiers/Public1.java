package modifiers;

public class Public1 {
	
    //modifiers basically tells to the jvm about the behavior of class means how weill class will behave
	//as name suggest basically tells about the access of class at different level or can say mention visibility of the class
	
	//upper classes have atmost 5 modifiers that are -
	   /*
	    * 1.public  
	    * 2.default
	    * 3.abstract
	    * 4.final
	    * 5.strictfp
	    */
	
	//where as inner classes have 8 modifiers 
	/*
	 * above 5+
	 * 6.private
	 * 7.protected
	 * 8.static
	 */
	
	//public can use anywhere
	
	//default can use within the package
	public static void main(String args[]) {
		
		//default can use within the package
		Default1 df = new Default1();
		df.hello(); // default can access within the package
		
		//protected can we use within the package + outside as well by only child classes
		Protected1 pr = new Protected1();
		pr.hello();
		
		//private 
		Private1 pri = new Private1();
		//pri.hello();  no visibility
		
		//final
		Final1 fi = new Final1();
		//fi.i=101; no allowation to change final
		fi.hello();
		
		//abstract class
		//Abstract1 ab = new Abstract1(); // no initialization of abstract possible directly first extend it
		//lets try to initialize abstarct class method using a extending class
		AbstractClassExtendingClass abs = new AbstractClassExtendingClass();
		abs.hello();
        
	}
	
	
	private class private1{
	//inner class can be private , protected and static
}
	protected class protected1{
		  //inner class can be private , protected and static
	}

	 static class static1{
		  //inner class can be private , protected and static
	}
}

/*
  private class private1{
	  //giving error as invalid modifier
  }
  

protected class protected1{
	  //giving error as invalid modifier
}

 static class static1{
	  //giving error as invalid modifier
}

*/
