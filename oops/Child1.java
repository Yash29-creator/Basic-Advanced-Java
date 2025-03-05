package oops;

public class Child1 extends Parent1{

	public void m1() {
		System.out.println("From Child1 class m1()");
	}
	
	public static void main(String[] args) {
		Parent1 p1 = new Parent1();
		p1.m1();
		Child1 ch1 = new Child1();
		ch1.m1();
		Parent1 p2 = ch1;// Upcasting
		p2.m1();
		Child1 ch2 = (Child1)p2;// Downcasting
		ch2.m1();
	}

}
