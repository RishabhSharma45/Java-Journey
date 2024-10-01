package dataHiding;

class BankAccount{
	private int accountNumber;
	private double Balance;
	
	public BankAccount(int accountNumber , double Balance) {
		this.accountNumber=accountNumber;
		this.Balance=Balance;
	}
	
	public void Deposit(Double amount) {
		Balance += amount;
	}
	
	public void withDraw(double amount) {
		if(Balance>=amount) {
			Balance-=amount;
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
	
	public double getBalance() {
		return Balance;
	}
}  

public class DataHiding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba = new BankAccount(1234,1000);
		ba.Deposit(500d);
		System.out.println("Balance :- " + ba.getBalance());
		ba.withDraw(200);
		System.out.println("Balance :- " + ba.getBalance());

	}

}
