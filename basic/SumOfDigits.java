package unit3;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int num = sc.nextInt();
		int sum= 0;
		for(int i = num;i!=0;i/=10){
			int rem = i%10;
			sum += rem;
		}
		System.out.println("The sum of digits is: "+sum);
	}

}
