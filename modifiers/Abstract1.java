package modifiers;

abstract class Abstract1 {
	abstract void hello();
	
	//abstract means Something partial
	//abstract method does not have body
	//abstract method closed with semicolon
	//if a class have a abstract method than it class have to declare abstract
	//abstract class - partially implemented class
	//for object class object creation not allowed
	
	public static void main(String args[]) {
		Default1 df = new Default1();
		df.hello();
		System.out.println("hello");
	}
}

   // without a abstract method as we can declare a class abstarct such like adapter classes and httpservlet class

