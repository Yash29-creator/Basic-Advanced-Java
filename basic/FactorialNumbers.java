package unit3;
import java.util.Scanner;
public class FactorialNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number: ");
		int num = sc.nextInt();
		int fact = 1;
		int i = 1;
		do {
			fact *= i;
			i++;
		} while(i<=num);
		System.out.println("Factorial is "+fact);

	}

}
