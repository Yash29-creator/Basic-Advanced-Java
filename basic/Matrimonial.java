package unit3;
import java.util.Scanner;
public class Matrimonial {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Age:- ");
		int age = s.nextInt();
		System.out.println("Enter your Gender:- ");
		char gender = s.next().charAt(0);
		
		if(age>=18 && age<=30) {
			if (gender == 'M' || gender == 'm') {
				System.out.println("You will get beautiful Wife.");
			}
			else if (gender == 'F' || gender == 'f') {
				System.out.println("You will get handsome Husband.");
			}
		}
		if(age>=31 && age<=45) {
			if (gender == 'M' || gender == 'm') {
				System.out.println("Hard...! But you can have hope to find a Wife. :)");
			}
			else if (gender == 'F' || gender == 'f') {
				System.out.println("Hard...! But you can have hope to find a Husband. :)");
			}
		}
		else if(age>=46) {
			if (gender == 'M' || gender == 'm') {
				System.out.println("Better luck next birth Sir.");
			}
			else if (gender == 'F' || gender == 'f') {
				System.out.println("Better luck next birth Mam.");
			}
		}
		else if(age<18){
			if (gender == 'M' || gender == 'm') {
				System.out.println("Bada to ho ja beta.");
			}
			else if (gender == 'F' || gender == 'f') {
				System.out.println("Badi to ho ja beti.");
			}
		}
		

	}

}
