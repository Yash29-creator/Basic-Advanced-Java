package unit3;
import java.util.Scanner;
public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting number: ");
		int s = sc.nextInt();
		System.out.println("Enter ending number: ");
		int l = sc.nextInt();
		int sum =0;
		do {
			sum+=s;
			s++;
		}while(s<=l);
		System.out.println("The sum of the numbers int the given range is: "+sum);

	}

}
