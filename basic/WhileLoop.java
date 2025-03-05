package unit3;

public class WhileLoop {

	public static void main(String[] args) {
		int a= 15;// initialization
		int b = 30;
		while(a<b) {// condition
			System.out.println(b-a + "From While block.");
			a++;// updation
		}
		System.out.println("Condition Failed....");
		
		
	}
}
