package oops;

public class Child2 extends Parent2{
	
	public void test() {
		System.out.println("From Child class Test()");
	}

	public static void main(String[] args) {
		
		Parent2 p1 = new Parent2();
		p1.test();
		Child2 ch1 = new Child2();
		ch1.test();
		Parent2 p2 = ch1;// Upcasting
		p2.test();
		Child2 ch2 = (Child2)p2;// Downcasting
		ch2.test();
		Parent2 p3 = new Child2();// Reference Casting
		p3.test();

	}

}
