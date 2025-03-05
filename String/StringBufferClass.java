package String;

public class StringBufferClass {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Hello, ");
		sb.append("World");
		System.out.println("After Append: "+sb);
		sb.insert(7, "Java ");
		System.out.println("After Insert: "+sb);
		sb.delete(5, 9);
		System.out.println("After Delete: "+sb);		
		sb.reverse();
		System.out.println("After Reverse: "+sb);
		sb.replace(0, 6, "Hiii");
		System.out.println("After Replace: "+sb);
		int length = sb.length();
		System.out.println("Length of Your String: "+length);
		int capacity = sb.capacity();
		System.out.println("Capacity of Your String: "+capacity);
		sb.ensureCapacity(20);
		System.out.println("After Ensuring Capacity: "+sb);
		sb.setLength(10);
		System.out.println("After Setting Length: "+sb);  
		

	}

}
