package oops;

public class Child3 extends Parent3{

	public static void demo() {
		System.out.println("From Child3 class demo()");
	}
	public static void main(String[] args) {
		
		Parent3 p1 = new Parent3();
		p1.demo();
		Child3 ch1 = new Child3();
		ch1.demo();
		Parent3 p2 = ch1;// Upcasting
		p2.demo();
		Child3 ch2 = (Child3)p2;// Downcasting
		ch2.demo();
		Parent3 p3 = new Child3();
		p3.demo();
		
	}

}
