package Practicals;

import java.util.StringTokenizer;
import java.util.Scanner;

public class IntegerReader {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter line of integers: ");
		String input = sc.nextLine();
		StringTokenizer tokenizer = new StringTokenizer(input, " ");
		int sum = 0;
		System.out.println("Integers: ");
		while(tokenizer.hasMoreTokens()) {
			String tokens = tokenizer.nextToken();
			int integer = Integer.parseInt(tokens);
			System.out.println(integer);
			sum += integer;
		}
		System.out.println("Sum: "+sum);
		

	}

}
