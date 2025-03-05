package unit3;
import java.util.Scanner;
public class ReverseNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int res= 0;
		System.out.println("Enter your number: ");
		int num = sc.nextInt();
		do {
			int dig = num%10;
			res = res*10 + dig;
			num/=10;
		}while(num!=0);
		System.out.println("The reverse is: "+res);		
	}

}
