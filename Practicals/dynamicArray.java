package Practicals;

import java.util.ArrayList;
public class dynamicArray {
public static void main(String[] args) {
ArrayList<Integer> dynamicArray = new ArrayList<>();
dynamicArray.add(10);
dynamicArray.add(20);
dynamicArray.add(30);
dynamicArray.add(40);
dynamicArray.add(50);
System.out.println("Dynamic Array: " + dynamicArray);
dynamicArray.add(60);
dynamicArray.add(70);
dynamicArray.add(80);
System.out.println("Updated Dynamic Array: " + dynamicArray);
dynamicArray.remove(3);
System.out.println("Updated Dynamic Array after removal: " +
dynamicArray);
}
}

