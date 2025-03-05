package variableDatatypeOperators;
import java.util.Scanner;

public class ArithmeticOperators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st Number: " );
		int num1 = sc.nextInt();
		System.out.println("Enter the 2nd Number: " );
		int num2 = sc.nextInt();
		int sum = num1+num2;
		System.out.println("Sum is " + sum);
		int sub = num1-num2;
		System.out.println("Subtraction is " + sub);
		int mul = num1*num2;
		System.out.println("Multiplication is " + mul);
		if(num2 != 0) {
			float a = num1, b = num2;
			float div = a/b;
			System.out.printf("Division is %.2f", div);
			int remain = num1%num2;
			System.out.println("\nRemainder is " + remain);
		}
		else {
			System.out.println("Division is infinity for denominator 0.\nRemainder is cannot be achieved.");
		}
	}

}
