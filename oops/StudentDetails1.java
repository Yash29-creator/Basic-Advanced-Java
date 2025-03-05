package oops;

public class StudentDetails1 {

	
	String name;
	int id;
	long cno;
	static String University = "Parul Univerity";
	
	public StudentDetails1(String name) {
		this.name = name;
		System.out.println("From StudentDetails1(String)");
	}
	public StudentDetails1(String name, int id) {
		this(name);
		this.id = id;
		System.out.println("From StudentDetails1(String, int)");
	}
	public StudentDetails1(String name, int id, long cno) {
		this(name,id);
		this.cno = cno;
		System.out.println("From StudentDetails1(String, int, long)");
	}
	public void getStudentDetails() {
		System.out.println("Student Name: "+ name);
		System.out.println("Student ID: "+ id);
		System.out.println("Student Contact: "+ cno);
		System.out.println("University: "+ University);
	}
	
	public static void main(String[] args) {
		
		StudentDetails1 s1 = new StudentDetails1("Yash",101,90984398);
		s1.getStudentDetails();

	}

}
