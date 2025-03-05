package oops;

public class CompileTimePoly {

	public static void main(String[] args) {
		add(10, 12.45);
		add(12.35, 52.8);
		add(34.35,20);

	}
	
	public static void add(int a,double b) {
		System.out.println("From add(int a, double b): "+(a+b));
	}
	public static void add(double a,double b) {
		System.out.println("From add(double a,double b): "+(a+b));
	}
	public static void add(double a,int b) {
		System.out.println("From add(double a,int b): "+(a+b));
	}
	
}
