package oops;

public class Account {
	
	private String acc_hldr_nm;
	private int acc_no;
	private double balance;
	
	Account(String accname, int acno, double bal){
		this.acc_hldr_nm = accname;
		this.acc_no = acno;
		this.balance = bal;
	}
	public String getName(){
		return acc_hldr_nm;
	}
	public void setName(String newName, int old_acc_no){
		if(this.acc_no==old_acc_no) {
			this.acc_hldr_nm = newName;
			System.out.println("Account Name Updated Successfully. :)");
		}else {
			System.out.println("Invalid Account Number. :(");
		}
	}
	public int getAccountNumber() {
		return acc_no;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double newbal, int old_acc_no) {
		if(this.acc_no==old_acc_no) {
			this.balance += newbal;
			System.out.println("Amount Credited Successfully. :)");
		}else {
			System.out.println("Invalid Account Number. :(");
		}
	}
	public void withdrawl(double newAmt,int old_acc_no) {
		if (this.acc_no==old_acc_no) {
			this.balance -= newAmt;
			System.out.println("Amount Debited Successfully. :)");
		} else {
			System.out.println("Invalid Account Number. :(");
		}
	}
	public void getBankDetails() {
		System.out.println("Account Holder Name: "+ acc_hldr_nm);
		System.out.println("Account Number: "+ acc_no);
		System.out.println("Account Balance: "+ balance);
	}
}
