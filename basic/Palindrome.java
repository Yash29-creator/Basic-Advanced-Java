package unit3;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int res= 0;
		System.out.println("Enter your number: ");
		int n= sc.nextInt();
		int num = n;
		do {
			int dig = num%10;
			res = res*10 + dig;
			num/=10;
		}while(num!=0);
		if(n==res) {
			System.out.println("The number is a Palindrome");
		}
		else {
			System.out.println("The number is not a Palindrome");
		}

	}

}
