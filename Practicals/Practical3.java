package Practicals;

public class Practical3 {
	public static void main(String[] args) {
		int a = 45;
		int b = 8;
		System.out.println("Arithmetic Operations:");
		System.out.println("Sum: " + add(a, b));
		System.out.println("Difference: " + sub(a, b));
		System.out.println("Product: " + multi(a, b));
		System.out.println("Quotient: " + div(a, b));
		System.out.println("Remainder: " + rem(a, b));
		System.out.println("Bitwise Operations:");
		System.out.println("AND: " + and(a, b));
		System.out.println("OR: " + or(a, b));
		System.out.println("XOR: " + xor(a, b));
		System.out.println("NOT A: " + not(a));
		System.out.println("Left Shift: " + leftShift(a));
		System.out.println("Right Shift: " + rightShift(a));
	}
	public static int add(int a, int b) {
		return a + b;
	}
	public static int sub(int a, int b) {
		return a - b;
	}
	public static int multi(int a, int b) {
		return a * b;
	}
	public static int div(int a, int b) {
		return a / b;
	}
	public static int rem(int a, int b) {
		return a % b;
	}
	public static int and(int a, int b) {
		return a & b;
	}
	public static int or(int a, int b) {
		return a | b;
	}
	public static int xor(int a, int b) {
		return a ^ b;
	}
	public static int not(int a) {
		return ~a;
	}
	public static int leftShift(int a) {
		return a << 1;
	}
	public static int rightShift(int a) {
		return a >> 1;
	}}
