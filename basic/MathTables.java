package unit3;
import java.util.Scanner;

public class MathTables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your range: ");
		int n = sc.nextInt();
//		int i=1;
		int j=1;
//		while(i<=n) {
//			System.out.println(i+" x "+j+" = "+ (i*j));
//			if(j==10) {
//				i++; j=1;
//				System.out.println();
//			}
//			else {
//				j++;				
//			}
//		}
		for(int i=1;i<=n;i++) {
			for(int k =1;k<=10;k++) {
				System.out.println(i+" x "+k+" = "+ (i*k));
			}			
			System.out.println("");
		}

	}

}

//while(i<=n) {
//	while(j<=10) {
//		System.out.println(i+" x "+j+" = "+ (i*j));
//		j++;
//	}
//	i++;
//}


