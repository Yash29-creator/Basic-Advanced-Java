package Practicals;

interface PaymentGateway{
	void makePayment(double amount);
}

interface ProductCatalog{
	void displayProduct();
	void searchProduct(String product);
}

interface UserAccount{
	void login(String username, String password);
	void logout();
}

abstract class EcommerceApp implements PaymentGateway, ProductCatalog, UserAccount{
	void displayApp() {
		System.out.println("Ecommerce App");
	}
}

class Amazon extends EcommerceApp{
	public void makePayment(double amount) {
		System.out.println("Making payment of Rs."+amount+" via Amazon Pay");
	}
	public void displayProduct() {
		System.out.println("Displaying products");
	}
	public void searchProduct(String product) {
		System.out.println("Searching product '"+product+"' on Amazon");
	}
	public void login(String username, String password) {
		System.out.println("Logging in to Amazon account with username '"+username+"'");
	}
	public void logout() {
		System.out.println("Logging out of Amazon App");
	}	
}

public class AmazonAppDriver {
	public static void main(String[] args) {
		EcommerceApp e1 = new Amazon();
		e1.displayApp();
		e1.login("Yash", "hello123");
		e1.makePayment(1000);
		e1.displayProduct();
		e1.searchProduct("Iphone");
		e1.logout();
	}

}
