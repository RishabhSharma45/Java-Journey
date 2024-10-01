package Thread;

class Factorial{
	synchronized public void printFactorial(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n*i);
		}
		
	}
}
class printFact1 extends Thread{
	Factorial f;
	 
	printFact1(Factorial f){
		this.f=f;
	}
	
	
	public void run() {
		f.printFactorial(4);
	}
	
}
class printFact2 extends Thread{
	Factorial f;
	 
	printFact2(Factorial f){
		this.f=f;
	}
	
	
	public void run() {
		f.printFactorial(5);
	}
	
}

public class Synchronizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial f1 = new Factorial();
		printFact1 pf1 = new printFact1(f1);
		printFact2 pf2 = new printFact2(f1);
		pf1.start();
		pf2.start();

	}

}
