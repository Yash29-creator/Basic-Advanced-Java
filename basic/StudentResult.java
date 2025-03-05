package unit3;

import java.util.Scanner;

public class StudentResult {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age:- ");
		double cgpa = sc.nextDouble();
		
		if(cgpa>=08.00 && cgpa<=10.00) {
			System.out.println("Topper! Party kab milegi?");
		}
		else if(cgpa>=06.00 && cgpa<=7.99){
			System.out.println("First Class! Vada Pav kab khiloge?");
		}
		else if(cgpa>=04.00 && cgpa<=05.99) {
			System.out.println("Pass. Jaake Bhagwan ko prasad chadhaa.");
		}
		else {
			System.out.println("Failed! Shani Dev bhari hai teri kundali par.");
		}

	}

}
