package Practicals;

import java.util.Scanner;
public class Practical4 {
	String name;
	int age;
	String designation;
	double salary;
	
	public Practical4(Scanner scanner) {
	System.out.println("Enter employee details:");
	System.out.print("Name: ");
	name = scanner.nextLine();
	System.out.print("Age: ");
	age = scanner.nextInt();
	System.out.print("Designation: ");
	scanner.nextLine(); // Consume newline left-over
	designation = scanner.nextLine();
	System.out.print("Salary: ");
	salary = scanner.nextDouble();
	}
	public void employeeDetails() {
		System.out.println("Employee Details");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Designation: " + designation);
		System.out.println("Salary: " + salary);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Practical4 emp = new Practical4(sc);
		emp.employeeDetails();
	}
}

