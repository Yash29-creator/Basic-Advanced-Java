package oops;

public class ObjectLoading {
	static int a;
	{
		System.out.println(a);
		a=14;
		d=45;
	}
	int b=20;
	static int c;
	int d;
	static {
		System.out.println(a);
		System.out.println(c);
	}
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(c);
		ObjectLoading obl = new ObjectLoading();
		System.out.println(obl);
		System.out.println(obl.b);
		System.out.println(obl.d);
		System.out.println(a);

	}

}
