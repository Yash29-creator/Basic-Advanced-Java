package unit3;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your starting number: ");
		int s = sc.nextInt();
		System.out.println("Enter your ending number: ");
		int e = sc.nextInt();
		int num = s, count =0;
		while(num<=e) {
			if(isPrime(num)) {
				System.out.println(num + "");
				count++;
			}
			num++;
		}
		System.out.println("\nTotal number of prime number in the given range: "+count);
	}

	public static boolean isPrime(int num) {
		
		if(num<=1) {
			return false;
		}
		int j=2;
		while(j*j<=num) {
			if(num%j==0) {
				return false;
			}
			j++;
		}
		return true;
	}

}
