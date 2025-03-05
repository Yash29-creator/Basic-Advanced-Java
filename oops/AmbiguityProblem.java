package oops;

public class AmbiguityProblem {

	public static void main(String[] args) {
		
		add(5,10);
		

	}
	public static void add(int a, float b) {
		System.out.println("From add(int a, float b): ");
	}
	public static void add(float a, int b) {
		System.out.println("From add(float a, int b): ");
	}
	public static void add(double a, int b) {
		System.out.println("From add(double a, int b): ");
	}

}
