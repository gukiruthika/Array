package sept8;

import java.util.Arrays;
import java.util.Scanner;

public class RearrangeArray {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int length = sn.nextInt();
		int[] arr = new int[length];
		for(int i=0; i<length; i++) 
			arr[i] = sn.nextInt();
		int[] arr2 = new int[length];
		
		Arrays.sort(arr);
		
		int evenSpot=0,oddSpot=length;
		for(int i=length-1; i>=0; i--) {
			if(i%2!=0) {
				oddSpot--;
				arr2[i] = arr[oddSpot];
			}
			else{
				arr2[i] = arr[evenSpot];
				evenSpot++;
			}
		}
		
		System.out.print(Arrays.toString(arr2));	
	}

}
