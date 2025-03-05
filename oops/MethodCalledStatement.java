package oops;

public class MethodCalledStatement {

	public static void main(String[] args) {
		add(10,20);
		add(10.25,23.45);

	}

	public static void add(double c, double d) {
		
		System.out.println("Addition is: "+(c+d));		
	}

	public static void add(int a, int b) {
		
		System.out.println("Addition is: "+(a+b));
	}

}
