package objectTypeCasting;

class Animal{
	
}
class Dog extends Animal{
	
}

public class TypeCasting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog = new Dog();
		Animal animal = dog; // upcasting .. child class object to parent class object
		
		Animal animal1 = new Dog();
		Dog dog1 = (Dog) animal1; // downcasting -- parent class object to child class object.....
		

	}

}
