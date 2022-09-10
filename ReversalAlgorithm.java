package sept8;

import java.util.Arrays;
import java.util.Scanner;

public class ReversalAlgorithm {
	
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.print("Enter the length of the array..");	
		int length = sn.nextInt();
		int[] arr = new int[length];
		System.out.print("Enter the elements of the array..");
		for(int i=0; i<length; i++) 
			arr[i] = sn.nextInt();
		System.out.print("Enter the distance..");	
		int d = sn.nextInt();
		System.out.println(Arrays.toString(arr));
		int[] arr1 = arr.clone();
		
		rightRotate(arr,d);
		leftRotate(arr1,d);

		sn.close();
	}
	public static void reverse(int[] ar, int start, int end) {
		while(start<end) {
			int temp = ar[start];
			ar[start] = ar[end];
			ar[end] = temp;
			start++;
			end--;
		}
	}
	public static void rightRotate(int[] ar, int d) {
		reverse(ar,0,(ar.length-1));
		reverse(ar,0,d-1);
		reverse(ar,d,(ar.length-1));
		System.out.println("Right rotation - "+Arrays.toString(ar));
		
	}
	public static void leftRotate(int[] ar, int d) {
		reverse(ar,0,d-1);
		reverse(ar,d,(ar.length-1));
		reverse(ar,0,(ar.length-1));
		System.out.println("Left rotation - "+ Arrays.toString(ar));
	}

}
 