package unit3;
import java.util.Scanner;
public class NumberDivisiblebySeven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting number: ");
		int s= sc.nextInt();
		System.out.println("Enter ending number: ");
		int l= sc.nextInt();
		int count = 0;
		for(int i=s;i<=l;i++) {
			if(i%7==0) {
				System.out.println("Number which is divisible by 7: "+i);
				count++;
			}
		}
		System.out.println("\nTotal numbers divisible by 7: "+ count);
	}

}
