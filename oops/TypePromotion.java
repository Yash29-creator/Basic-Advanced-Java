package oops;

public class TypePromotion {

	public static void main(String[] args) {
		add(10,20);
	}
	public static void add(int a, float b) {
		System.out.println("From add(int a, float b): "+(a+b));
	}
	public static void add(int a, double b) {
		System.out.println("From add(int a, double b): "+(a+b));
	}
	public static void add(int a, char b) {
		System.out.println("From add(int a, char b): "+(a+b));
	}

}
