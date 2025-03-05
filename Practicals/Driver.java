package Practicals;

class Parent 
{ 
int a = 10; 
int b = 20; 
} 
class Child extends Parent 
{ 
int c = 30; 
int d = 40; 
} 
public class Driver 
{ 
          public static void main (String [] args) 
         { 
                  Parent p1=new Parent (); 
                  try 
                 { 
                	  Child ch1=(Child)p1; 
                	  System.out.println(ch1.a); 
                	  System.out.println(ch1.b); 
                	  System.out.println(ch1.c); 
                	  System.out.println(ch1.d); 
                  } 
                   catch (ClassCastException cce) 
                  { 
System.out.println("Exception got Handled"); 
                  } 
         } 
}