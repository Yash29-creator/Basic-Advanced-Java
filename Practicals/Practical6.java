package Practicals;

public class Practical6 {
    public static void main(String[] args) {
        int n = 20;
        System.out.println("Recursive Fibonacci: " + fibRecursive(n));
        System.out.println("Non-Recursive Fibonacci: " + fibNonRecursive(n)*-1);
    }

    public static int fibRecursive(int n) {
        return n < 2 ? n : fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    public static int fibNonRecursive(int n) {
        int a = 0, b = 1;
        for (; n-- > 0; a += b) {
            b = a - b;
        }
        return a;
    }
}