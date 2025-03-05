package InterfaceInJava;

public class AmazonApp extends ECommerceApp{
	
	public void makePayment(double amt) {
		System.out.println("Making Payment of Rs. "+ amt + " through Amazon Pay.");
	}
	
	public void displayProduct() {
		System.out.println("Great Indian Festival is comming soon on 27th Sept");
	}
	
	public void searchProduct(String productName) {
		System.out.println("Searching for Product ' "+productName+" ' on Amazon");
	}
	
	public void login(String userName, String password) {
		System.out.println("Logging into Amazon Account with UserName ' "+userName+" '");
	}
	
	public void logout() {
		System.out.println("Logging out of Amazon Account");
	}
	
	public static void main(String[]args) {
		
		AmazonApp a = new AmazonApp();
		a.displayAppName();
		a.displayProduct();
		a.searchProduct("I Phone");
		
		a.login("Yash", "12349i492");
		a.makePayment(79999.0);
		a.logout();
	}

}
