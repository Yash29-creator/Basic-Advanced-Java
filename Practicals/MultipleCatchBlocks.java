package Practicals;

public class MultipleCatchBlocks {
public static void main(String[] args) {
try {
int x = 5 / 0; // ArithmeticException
int array[] = new int[10];
array[10] = 30; // ArrayIndexOutOfBoundsException
} catch (ArithmeticException e) {
System.out.println("ArithmeticException: " + e.getMessage());
} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("ArrayIndexOutOfBoundsException: " +
e.getMessage());
} catch (Exception e) {
System.out.println("Exception: " + e.getMessage());
}
}
}
