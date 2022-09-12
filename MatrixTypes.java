package sept8;

import java.util.Scanner;

public class MatrixTypes {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);

		System.out.print("Enter the no. of rows..");
		int row = sn.nextInt();
		System.out.print("Enter the no. of columns..");
		int col = sn.nextInt();
		int[][] matrix1 = new int[row][col];
		System.out.print("\nEnter the elements of the matrix..");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix1[i][j] = sn.nextInt();
			}
		}
		sn.close();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(matrix1[i][j] + " ");
			}
			System.out.println();
		}
		if (row == col) {
			System.out.println("-> Square Matrix");
			if(row==1)
				System.out.println("-> Singleton Matrix");
			int diagonalCheck = 0, identityCheck = 0, upperTriCheck=0, lowerTriCheck=0, scalarCheck = 0;
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if (i != j) {
						if (matrix1[i][j] != 0)
							diagonalCheck++;
						if(i>j) {
							if (matrix1[i][j] != 0)
								upperTriCheck++;
						}
						if(i<j) {
							if (matrix1[i][j] != 0)
								lowerTriCheck++;
						}
					} else {
						if (matrix1[i][j] != 1)
							identityCheck++;
						if (matrix1[i][j] != matrix1[0][0])
							scalarCheck++;				
					}
				}
			}
			if (diagonalCheck == 0) {
				System.out.println("-> Diagonal Matrix");
				
				if (identityCheck == 0) {
					System.out.println("-> Identity Matrix");
				}
				else if (scalarCheck == 0) {
					System.out.println("-> Scalar Matrix");
				}
			}
			else {
				if (upperTriCheck == 0) {
					System.out.println("-> Upper Triangle Matrix");
				}
				if (lowerTriCheck == 0) {
					System.out.println("-> Lower Triangle Matrix");
				}
			}
		} 
		else {
			System.out.println("-> Rectangular Matrix");
			if (row > col) {
				System.out.println("-> Vertical Matrix");
				if (col == 1)
					System.out.println("-> Column Matrix");
			}
			if (row < col) {
				System.out.println("-> Horizontal Matrix");
				if (row == 1)
					System.out.println("-> Row Matrix");
			}
		}
		int zeroCheck=0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
					if (matrix1[i][j] != 0)
						zeroCheck++;
				}
			}
		if (zeroCheck == 0) 
			System.out.println("-> Zero Matrix");
		

}

}
