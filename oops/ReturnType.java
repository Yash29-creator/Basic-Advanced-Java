package oops;

public class ReturnType {

	public static void main(String[] args) {
		System.out.println("From Main");
		ram();
		System.out.println("End of Main");
		
	}

	public static void ram() {
		
		System.out.println("From Ram --------- Hii Sheela");
		int res = sheela(1000);
		System.out.println("Here is the remaining amount: "+res);
	}

	public static int sheela(int i) {
		
		System.out.println("Hello Ram");
		System.out.println("Do you have 1000 rs");
		System.out.println("Just give me");
		System.out.println("But I have one condition you have to do some work for me.");
		System.out.println("Yes I'll do it");
		System.out.println("Sheela will start Executing");
		return 500;
	}

}
