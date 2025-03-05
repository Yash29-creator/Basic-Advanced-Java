package ExceptionHandling;

public class PCDriver {

	public static void main(String[] args) {
		
		try {
			System.out.println("From tray block");
			Parent p1 = new Parent();
			Child ch1 = (Child)p1;
			System.out.println(ch1.a);
			System.out.println(ch1.b);
			System.out.println(ch1.c);
			System.out.println(ch1.d);
		} catch (ClassCastException e) {
			System.out.println("Exception got handled");
		}

	}

}
