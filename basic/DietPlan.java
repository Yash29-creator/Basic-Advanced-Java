package control_flow_statements;
import java.util.Scanner;
public class DietPlan {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter day name : ");
	String day = s.next();
	switch(day)
	{
	case "sunday" :
		 System.out.println("day 1");
		 break;
	case "monday" :
	     System.out.println("day 2");
	     break;
	case "tuesday" :
	     System.out.println("day 3");
	     break;
	case "wednesday" :
	    System.out.println("day 4");
	    break; 
	case "thursday" :
	    System.out.println("day 5");
	    break;  
	case "friday" :
	    System.out.println("day 6");
	    break;		    
	case "saturday" :
	    System.out.println("day 7");
	    break;
	default : 
		System.out.println("not a valid day");
		break;
		    
	}
	
}

}


