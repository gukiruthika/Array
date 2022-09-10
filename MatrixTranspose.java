package sept8;

import java.util.Scanner;

public class MatrixTranspose {

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
		//Getting input
		System.out.print("Enter the no. of rows..");	
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
		int b=0;
		int[][] matrix2 = new int[col1][row1];
		for(int i=0; i<col1; i++) {
			int a=0;
			for(int j=0; j<row1; j++) {
				matrix2[i][j] = matrix1[a][b];
				a++;
			}
			b++;
		}
		printMatrix(row1,col1,matrix1);
		System.out.println("Result:");	
		printMatrix(col1,row1,matrix2);
	}

}
