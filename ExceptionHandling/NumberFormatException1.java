package ExceptionHandling;

public class NumberFormatException1 {

	public static void main(String[] args) {
		
		try {
			
			System.out.println("From try block");
			String s = "Yash";
		} catch (NumberFormatException e) {
			System.out.println("Exception got handled");
		}

	}

}
