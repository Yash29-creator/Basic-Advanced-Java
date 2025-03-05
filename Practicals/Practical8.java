package Practicals;

public class Practical8 {
	public static void main(String[] args) {
		int[][] matA = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matB = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
		int[][] res = multiplyMatrices(matA, matB);
		System.out.println("Result:");
		printMatrix(res);
	}
	public static int[][] multiplyMatrices(int[][] a, int[][] b) {
		int row1 = a.length;
		int col1 = a[0].length;
		int col2 = b[0].length;
		int[][] result = new int[row1][col2];
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col2; j++) {
				for (int k = 0; k < col1; k++) {
					result[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return result;
	}
	public static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			for (int val : row) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}
}
