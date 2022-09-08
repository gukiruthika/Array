package sept8;

import java.util.Arrays;

public class Sort_based_on_weight {
	public static void main(String[] args) {
		int[] ar = {49,36,8,10,12};
		int[] weight = new int[ar.length];
		int temp;
		Arrays.fill(weight, 0);
		for(int i=0; i<ar.length; i++) {
			if((Math.sqrt(ar[i])- Math.floor(Math.sqrt(ar[i])))==0) 
				weight[i]+=5;
		
			if((ar[i]%12)==0)
				weight[i]+=4;
			
			if((ar[i]%2)==0)
				weight[i]+=3;
		}
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar.length; j++) {
				if(weight[i]>weight[j]) {
					temp=weight[i];
					weight[i]=weight[j];
					weight[j]=temp;
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		for(int i=0; i<ar.length; i++) {
			System.out.print("<" + ar[i] + "," + weight[i] + "> ");
		}

	}

}
