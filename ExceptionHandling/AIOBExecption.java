package ExceptionHandling;

public class AIOBExecption {

	public static void main(String[] args) {
		
		try {
			
			System.out.println("From try block");
			int a[] = new int[5];
			a[10] = 50;
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception got handled");
		}

	}

}
