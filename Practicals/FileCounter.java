package Practicals;

import java.util.Scanner;
public class FileCounter {
	public static void main(String[] args) {
		System.out.println("Prince_Chhodavadiya");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your text (Enter an empty line to finish):");
		int charCount = 0;
		int wordCount = 0;
		int lineCount = 0;
		while (true) {
			String line = sc.nextLine();
			if (line.isEmpty()) {
				break;
			}
			charCount += line.length();
			String[] words = line.split("\\s+");
			wordCount += words.length;
			lineCount++;
		}
		System.out.println("Character count: " + charCount);
		System.out.println("Word count: " + wordCount);
		System.out.println("Line count: " + lineCount);
	}
}
