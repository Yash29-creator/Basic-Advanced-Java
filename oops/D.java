package oops;

public class D extends C{

	int d = 40;
	
	public static void main(String[] args) {
		C c1 = new C();
		System.out.println(c1.c);
		A a1 = c1;
		System.out.println(a1.a);
		B b1 = (B)a1;
		System.out.println(b1.b);
		D d1 = new D();
		System.out.println(d1.d);
		
	}

}
