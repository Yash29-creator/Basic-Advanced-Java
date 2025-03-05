package oops;

public class Return {

	public static void main(String[] args) {
		add(12.45,10);

	}

	public static int add(double d, int i) {
		System.out.println("From add(double d, int i): ");
		return 20;
	}
	public static void add(int i, int b) {
		System.out.println("From add(int i, int b): ");		
	}

}
