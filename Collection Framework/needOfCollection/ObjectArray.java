package needOfCollection;

class Student{
	int id;
	String name;
	
	
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] st = new Student[3];
		st[0] = new Student(1,"abc");
		st[1] = new Student(2,"xyz");
		for(Student s : st) {
			System.out.println(s);
		}
		

	}

}
