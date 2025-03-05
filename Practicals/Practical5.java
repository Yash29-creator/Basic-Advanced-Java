package Practicals;
import java.util.Scanner;

public class Practical5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a, b, c: ");
		double a = sc.nextDouble(), b = sc.nextDouble(), 
		c = sc.nextDouble();
		double d = b * b - 4 * a * c;
		System.out.println(d < 0 ? "No real solutions" : "The solutions are: = " + (-b + Math.sqrt(d)) / (2 * a) + " = " + (-b - Math.sqrt(d)) / (2 * a));
	}
}
