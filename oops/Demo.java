package oops;

public class Demo {

	public static void test() {
		System.out.println("From test()");
	}
	
	public static void main(String[] args) {
		
		test();
		
		Demo.test();
		
		Demo d = new Demo();
		d.test();
		
	}

}
