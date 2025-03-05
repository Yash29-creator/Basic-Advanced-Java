package oops;

public class StudentDetails {

	String name;
	int Enrollment;
	long MobileNumber;
	String scName = "Parul University";
	
	public void getattribute() {
		System.out.println("Student Name: " + name);
		System.out.println("Student Enrollment Number: " + Enrollment);
		System.out.println("Student Mobile Number: " + MobileNumber);
		System.out.println("College Name: " + scName);
	}
	
	public static void main(String[] args) {
		
		StudentDetails std = new StudentDetails();
		std.initialize("Yash", 100, 1234567891);
		std.getattribute();
		StudentDetails std1 = new StudentDetails();
		std1.initialize("Chachi", 420, 888812121);
		std1.getattribute();
		
	}
	public void initialize(String sname, int seno, long scno) {
		name = sname;
		Enrollment = seno;
		MobileNumber = scno;
	}

}
