package Practicals;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String input = sc.nextLine();
		if(isPalindrome(input)) {
			System.out.println(input+" is a Palindrome.");
		}else {
			System.out.println(input+" is not a Palindrome.");			
		}

	}
	public static boolean isPalindrome(String str) {
		int i = 0, j = str.length()-1;
		while(i<j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
