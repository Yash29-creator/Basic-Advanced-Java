package oops;

public class AccountDriver {

	public static void main(String[] args) {
		Account ac1 = new Account("Ram",100,50000.00);
		
		System.out.println(ac1.getName());
		ac1.setName("Yash", 100);
		
		System.out.println(ac1.getName());
		System.out.println(ac1.getAccountNumber());
		System.out.println(ac1.getBalance());
		
		ac1.setBalance(30000, 100);
		System.out.println(ac1.getBalance());
		
		ac1.withdrawl(10000, 100);
		System.out.println(ac1.getBalance());
		ac1.getBankDetails();
	}

}
