package Thread;

class Bank {
    private int balance = 0;

    public synchronized void withdraw(int amount) {
        while (balance < amount) {
            System.out.println("Insufficient balance. Waiting for deposit...");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + ", Current balance: " + balance);
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", Current balance: " + balance);
        notify(); 
    }
}

class Withdraw implements Runnable {
	private Bank b;
    private int amount;

    public Withdraw(Bank b , int amount) {
    	this.b=b;
        this.amount = amount;
    }

    @Override
    public void run() {
        b.withdraw(amount);
    }
}

class Deposit implements Runnable {
    private Bank b;
    private int amount;

    public Deposit(Bank b , int amount) {
    	this.b=b;
        this.amount = amount;
    }

    @Override
    public void run() {
        b.deposit(amount);
    }
}


public class WaitAndNotify {
	
	public static void main(String args[]) {
		Bank b = new Bank();
		
		
		Thread withdrawThread = new Thread(new Withdraw(b,500));
        Thread depositThread = new Thread(new Deposit(b,1000));

		
		/*
		Thread withdrawThread = new Thread(() -> b.withdraw(500)); // Trying to withdraw 500
        Thread depositThread = new Thread(() -> b.deposit(1000));  // Depositing 1000 
        */

        withdrawThread.start();
        depositThread.start();
		
	}
}
