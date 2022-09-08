package sept8;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {
	public static void printMatrix(int row,int col,int[][] mat) {
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		
		System.out.print("Matrix no. 1");	
		System.out.print("\nEnter the no. of rows..");	
		int row1 = sn.nextInt();
		System.out.print("Enter the no. of columns..");	
		int col1 = sn.nextInt();
		int[][] matrix1 = new int[row1][col1];
		System.out.print("\nEnter the elements of the matrix..");
		for(int i=0; i<row1; i++) {
			for(int j=0; j<col1; j++) {
				matrix1[i][j] = sn.nextInt();
			}
		}
		
		System.out.print("\nMatrix no. 2");	
		System.out.print("\nEnter the no. of rows..");	
		int row2 = sn.nextInt();
		while(row2!=col1) {
			System.out.print("No. of rows of Matrix 2 should be equal to no. of columns of Matrix 1 for Multiplication");
			System.out.print("\nEnter the no. of rows again..");	
			row2 = sn.nextInt();
		}
		System.out.print("Enter the no. of columns..");	
		int col2 = sn.nextInt();
		int[][] matrix2 = new int[row2][col2];
		System.out.print("\nEnter the elements of the matrix..");
		for(int i=0; i<row2; i++) {
			for(int j=0; j<col2; j++) {
				matrix2[i][j] = sn.nextInt();
			}
		}
		System.out.println("\nMatrix no. 1:");	
		printMatrix(row1,col1,matrix1);
		System.out.println("\nMatrix no. 2:");	
		printMatrix(row2,col2,matrix2);
		int[][] result = new int[row1][col2];
		for(int[] r:result)
			Arrays.fill(r, 0);
		for(int i=0; i<row1; i++) {
			for(int j=0; j<col2; j++) {
				for(int k=0; k<col1; k++) {
					result[i][j]+= matrix1[i][k]*matrix2[k][j];
				}
			}
		}
		System.out.println("\nResult:");	
		printMatrix(row1,col2,result);
	}

}
