package Practicals;

public class Practical10 {
	private String acc_Holder_Name;
	private double balance;
	public Practical10() {
		this.acc_Holder_Name = "No ONE";
		this.balance = 0.0;
	}
	public Practical10(String name) {
		this.acc_Holder_Name = name;
		this.balance = 0.0;
	}
	public Practical10(String name, double initBalance) {
		this.acc_Holder_Name = name;
		this.balance = initBalance;
	}
	public void deposit(double amount) {
		System.out.println("Depositing " + amount + " into account");
		this.balance += amount;
	}
	public void deposit(int amount) {
		System.out.println("Deposit " + amount + " into account (int)");
		this.balance += amount;
	}
	public void withdraw(double amount) {
		System.out.println("Withdraw " + amount + " from account");
		this.balance -= amount;
	}
	public void accInfo() {
		System.out.println("Account Holder Name: " + this.acc_Holder_Name);
		System.out.println("Balance: " + this.balance);
	}
	public static void main(String[] args) {
		Practical10 acc1 = new Practical10();
		Practical10 acc2 = new Practical10("Bhushan Shewale");
		Practical10 acc3 = new Practical10("Vishal Pawar", 1000.0);
		acc1.deposit(500.0);
		acc2.deposit(200);
		acc3.withdraw(300.0);
		acc1.accInfo();
		acc2.accInfo();
		acc3.accInfo();
	}
}