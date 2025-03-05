package ExceptionHandling;

public class NullPointerException1 {

	public static void main(String[] args) {
		
		try {
			System.out.println("From try block");
			String s = null;
			System.out.println(s.toLowerCase());
			System.out.println(s);
			System.out.println(s.toUpperCase());
			System.out.println(s);
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("Exception got handled");
		}

	}

}
