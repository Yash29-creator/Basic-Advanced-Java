package unit3;

public class Pattern {

	public static void main(String[] args) {
		int n=5;
		for(int i =1; i<=n; i++) {
			for(int j =1; j<=i; j++) {
				System.out.printf("*\t");
			}
			System.out.printf("\n");
		}
	}

}
