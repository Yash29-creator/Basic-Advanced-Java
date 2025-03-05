package arrayprograms;

public class RotateArray {

	public static void rotate(int num[], int k) {
		
		int n = num.length;
		k = k%n;
		int []result = new int[n];
		for (int i = 0; i < n; i++) {
			result[(i+k)%n] = num[i];
		}
		System.arraycopy(result, 0, num, 0, n);
	}
	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7,8,9,10};
        int k = 4;
        System.out.println("Original array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        rotate(arr, k);
        System.out.println("Rotated array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
