package oops;

public class ObjectLoadingProcess {
	
	int c;
	public ObjectLoadingProcess(int e) {
		System.out.println("Programmer written Instructions.");
		c = e;
	}
	{
		System.out.println("From MLNSI");// non-static multi-line initializer
	}
	int d = 34;
	
	public static void main(String[] args) {
		
		System.out.println("From Main");
		ObjectLoadingProcess olp = new ObjectLoadingProcess(10);
		System.out.println(olp.c);
		System.out.println(olp.d);
		ObjectLoadingProcess olp1 = new ObjectLoadingProcess(20);
		System.out.println(olp1.c);
		System.out.println(olp1.d);
		

	}

}
