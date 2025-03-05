package InterfaceInJava;

public abstract class ECommerceApp implements PaymentGateway, ProductList, UserAccount{
	
	public void displayAppName() {
		System.out.println("E-commerce App");
	}

}
