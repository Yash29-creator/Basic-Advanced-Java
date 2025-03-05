package oops;

public class MultipleObjectCreation {
	
	public String ename;
	
	public MultipleObjectCreation(String name) {
		ename = name;
		
	}
	
	public static void main(String[] args) {
		MultipleObjectCreation emp = new MultipleObjectCreation("Yash");
		MultipleObjectCreation emp1 = new MultipleObjectCreation("Aditya");
		MultipleObjectCreation emp2 = new MultipleObjectCreation("Anamika");
		MultipleObjectCreation emp3 = new MultipleObjectCreation("Ajay");
		System.out.println(emp);
		System.out.println(emp.ename);
		System.out.println(emp1);
		System.out.println(emp1.ename);
		System.out.println(emp2);
		System.out.println(emp2.ename);
		System.out.println(emp3);
		System.out.println(emp3.ename);

	}

}
