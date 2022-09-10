package sept8;

import java.util.Scanner;

public class MatrixAddition {
	public static void printMatrix(int row, int col, int[][] mat) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);

		System.out.print("\nEnter the no. of rows..");
		int row = sn.nextInt();
		System.out.print("Enter the no. of columns..");
		int col = sn.nextInt();
		int[][] matrix1 = new int[row][col];
		int[][] matrix2 = new int[row][col];
		System.out.print("\nEnter the elements of the matrix 1..");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix1[i][j] = sn.nextInt();
			}
		}

		System.out.print("\nEnter the elements of the matrix 2..");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix2[i][j] = sn.nextInt();
			}
		}
		
		System.out.println("\nMatrix no. 1:");
		printMatrix(row, col, matrix1);
		System.out.println("\nMatrix no. 2:");
		printMatrix(row, col, matrix2);
		
		int[][] result = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				result[i][j] += matrix1[i][j] + matrix2[i][j];
			}
		}
		
		System.out.println("\nResult:");
		printMatrix(row, col, result);

		sn.close();
	}

}
