package ExceptionHandling;

public class ArithmeticException1 {

	public static void main(String[] args) {
		
		try {
			System.out.println("From Try block");
			int a = 5/0;
			System.out.println(a);
		} catch (ArithmeticException e) {
			System.out.println("Exception got handled");
		}

	}

}
