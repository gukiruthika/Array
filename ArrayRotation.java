package sept8;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
	static void rotate(int[] ar, int d, int n) {
		int[] ar2 = ar.clone();
		int d1=d;
		while(d-- > 0){
			int last = ar[n-1];
			for(int i=n-1; i>=0; i--) {
				if(i!=0)
					ar[i]=ar[i-1];
				else
					ar[i]=last;
			}
		}
		
		while(d1-- > 0){
			int first = ar2[0];
			for(int i=0; i<n; i++) {
				if(i!=(n-1))
					ar2[i]=ar2[i+1];
				else
					ar2[i]=first;
			}
		}
		
		System.out.println("Right Rotate\n" + Arrays.toString(ar));
		System.out.println("Left Rotate\n" + Arrays.toString(ar2));
	}
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n = sn.nextInt();
		System.out.println("Enter the elements");
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = sn.nextInt();
		System.out.println("Enter the distance ");
		int d = sn.nextInt();
		rotate(arr,d,n);

	}

}
