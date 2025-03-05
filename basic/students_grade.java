package control_flow_statements;

import java.util.Scanner;

public class students_grade {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter grade : ");
		char grade = s.next().charAt(0);
				
		switch(grade)
		{
		case 'A':
		case 'a':
			System.out.println("excellent");
			break;
		case 'B':
		case 'b':
			System.out.println("good");
			break;
		case 'C':
		case 'c':
			System.out.println("fair");
			break;
		case 'D':
		case 'd':
			System.out.println("poor");
			break;
		case 'F':
		case 'f':
			System.out.println("fail");
			break;
		default:
			System.out.println("wrong input");
			break;
				
		}

	}

}