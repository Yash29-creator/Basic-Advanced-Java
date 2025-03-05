package oops;

public class NoSuitableFound {

	public static void main(String[] args) {
		add(5,12.45);

	}
	public static void add(int a, float b) {
		System.out.println("From add(int a, float b)");
	}
	public static void add(int a, int b) {
		System.out.println("From add(int a, int b)");
	}

}
