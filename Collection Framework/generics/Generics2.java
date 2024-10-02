package generics;

import java.util.ArrayList;

class Employee{
	int id;
	String name;
	
	Employee(int id,String name){
		this.id = id;
		this.name= name;
		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class Generics2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		ArrayList<Employee> s1 = new ArrayList<>();
		s1.add(new Employee(1,"hello"));
		s1.add(new Employee(2,"hello"));
		s1.add(new Employee(3,"hello"));
		for(Employee e : s1) {
			System.out.println(e);
		}
  
   
   
	}

}
