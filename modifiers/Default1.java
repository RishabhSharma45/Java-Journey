package modifiers;

class Default1 {
  //a calss without a modifier is default by default in java
	//default class can be access within package only no outside
	
	public void hello() {    // it ia a public method inside a default class hence to access a method we first must care of class visibility 
		System.out.println("hello");   // means if a class is default and a method in it is public and we are trying to acces method in another package than compiler will gave error because method is public but class id default
	}
	
	public static void main(String args[]) {
		System.out.println("hello");
	}
}
