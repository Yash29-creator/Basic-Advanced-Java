package Practicals;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practical9 {
	public static void main(String[] args) {
		List<String> name = new ArrayList<>();
		name.add("Bhushan");
		name.add("Vishal");
		name.add("Kanika");
		name.add("Pooja");
		name.add("Meenu");
		System.out.println("Original list:");
		printList(name);
		Collections.sort(name);
		System.out.println("Sorted list:");
		printList(name);
	}
	public static void printList(List<String> list) {
		for (String name : list) {
			System.out.print(name + " ");
		}
		System.out.println();
	}
}