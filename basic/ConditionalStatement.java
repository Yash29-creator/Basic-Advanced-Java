package unit3;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st Number: " );
		int a = sc.nextInt();
		System.out.println("Enter the 2nd Number: " );
		int b = sc.nextInt();
		
		// I
		if (a<b) {
			System.out.println(a + " is smaller than " + b);
		}
		
		// If else
		if (a<b || a==b) {
			System.out.println(a + " is smaller than or equal to " + b);
		}
		else {
			System.out.println(a + " is greater than " + b);
		}
		
		// If else if 
		if (a<b) {
			System.out.println(a + " is smaller than " + b);
		}
		else if (a>b) {
			System.out.println(a + " is greater than " + b);
		}
		else {
			System.out.println(a + " is equal to " + b);
		}
	}

}
// if (a>0) {
// 		System.out.println(a + " is positive.");
// }
// else if (a<0) {
// 		System.out.println(a + " is negative.");
// }
// else {
// 		System.out.println(a + " is equal to 0.");
// }
//
// if (true){
// 		System.out.println("If condition is executed.");
// }
// else {
// 		System.out.println("Else condition is executed.");
// }
// 
// 
// 