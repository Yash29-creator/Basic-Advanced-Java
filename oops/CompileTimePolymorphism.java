package oops;

public class CompileTimePolymorphism {

	public static void main(String[] args) {
		
		
		add(10);
		add(10,20);
		add(10,20,30); // by changing number of arguments

	}

	public static void add(int x) {
		System.out.println("From add(int x): "+(x+0));
	}
	public static void add(int x,int y) {
		System.out.println("From add(int x,int y): "+(x+y));
	}
	public static void add(int x,int y,int z) {
		System.out.println("From add(int x,int y,int z): "+(x+y+z));
	}
	
	

}
