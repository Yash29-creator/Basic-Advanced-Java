package Practicals;

import java.util.Scanner;
public class Practical7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = sc.nextInt();
		System.out.println("Prime numbers up to " + n + ":");
		for (int i = 2; i <= n; i++) {
			if (isPrime(i))
				System.out.print(i + " ");
		}
	}
	public static boolean isPrime(int num) {
		if (num <= 1)
			return false;
		for (int i = 2, sqrt = (int) Math.sqrt(num); i <= sqrt; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}