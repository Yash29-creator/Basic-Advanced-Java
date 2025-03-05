package unit3;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number: ");
		int num = sc.nextInt();
		int i=1;
		while(i<=num) {
			System.out.println(num);
			num--;
		}
	}

}
