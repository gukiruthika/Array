package sept8;

import java.util.Scanner;

public class MatrixSpiral {

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

		int rb = 0, cb = 0, re = row - 1, ce = col - 1, d = 0;
		while (rb <= re && cb <= ce) {
			if (d == 0) {
				for (int i = cb; i <= ce; i++) 
					System.out.print(matrix1[rb][i] + " ");
				
				rb++;
				d++;
			} 
			
			else if (d == 1) {
				for (int i = rb; i <= re; i++) 
					System.out.print(matrix1[i][ce] + " ");
				
				ce--;
				d++;
			} 
			
			else if (d == 2) {
				for (int i = ce; i >= cb; i--) 
					System.out.print(matrix1[re][i] + " ");
				
				re--;
				d++;
			} 
			
			else {
				for (int i = re; i >= rb; i--) 
					System.out.print(matrix1[i][cb] + " ");
				
				cb++;
				d++;
			}
			
			if (d == 4)
				d = 0;
		}
		sn.close();

	}

}
