package oops;

public class LoanAgregator {

	public static void main(String[] args) {
		Bank b1 = new Sbi();
		System.out.println(b1.rateofintrest());
		Bank b2 = new Kotak();
		System.out.println(b2.rateofintrest());
		Bank b3 = new Icici();
		System.out.println(b3.rateofintrest());
		Bank b4 = new Hdfc();
		System.out.println(b4.rateofintrest());
		
	}

}
