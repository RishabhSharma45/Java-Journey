package inheritance;

public class TypesOfInheritance {
   // there are so many types of Inheritance...
}

//Single level
class A {
	
}
class B extends A{
	  // Single level inheritance with one parent and one child
}


//multilevel Inheritance
class A1{
	
}
class B1 extends A1{
	
}                         //multilevel b1 extends A1 and C1 extends B1
class C1 extends B1{
	
}




//multiple inheritance   *not supported by java
class C{
	void hello() {}
}
class D{
	void hello() {}
}
//WILL GAVE ERROR class E extends C ,D{ 
	//one child many parent  this will not possible 
  // because as class c have method hello , and d have also hello . than class e will confuse to extend or use which hello method
//}


//Hierarchical inheritance
class F{
	
}
class G extends F{
	  
}                           //one common parent to all child classes
class H extends F{
	
}

//Hybrid Inheritance 
//inheritance of inheritance not supported by java as java does no support multiple inheritance

//Circular Inheritance
//it is also not supported by java
/* class A2 extends B2{
	
}
class B2 extends A2{
	
} */    //will gave error........









