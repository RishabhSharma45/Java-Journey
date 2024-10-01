package abstraction;

abstract class Vehicle{
	private String brand;
	
	public Vehicle(String brand) {
		this.brand = brand;
	}
	
	abstract void startEngine();
	void accelerate() {
		System.out.println(brand + "is accelerating");
	}
	
	String getBrand() {
		return brand;
	}
}

//concrete subclass
class Car extends Vehicle{
	
	public Car(String brand) {
		super(brand);
	}

	@Override
	void startEngine() {
		// TODO Auto-generated method stub
		System.out.println(getBrand()+"car engine statred");
		
	}
	
}

//concrete subclass
class MotorCycle extends Vehicle{
	
	

	public MotorCycle(String brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}

	@Override
	void startEngine() {
		// TODO Auto-generated method stub
		System.out.println(getBrand()+"motorcycle engine statred");
		
		
	}
	
}

public class Abstraction1 {
	//hiding internal features ... showing what is happenning by hiding how?
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car = new Car("toyota");
		car.startEngine();
		car.accelerate();
		
		Vehicle motorcycle = new Car("honda");
		motorcycle.startEngine();
		motorcycle.accelerate();
		
		

	}

}
