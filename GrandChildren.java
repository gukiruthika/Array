package sept8;

import java.util.Arrays;
import java.util.Scanner;

public class GrandChildren {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		String[][] names = {{"luke","shaw"},{"wayne","rooney"},{"rooney","ronaldo"},{"shaw","rooney"}};
		System.out.println(Arrays.deepToString(names));
		String in = sn.next();
		int count=0;
		for(int i=0; i<names.length; i++) {
			if(names[i][1].equalsIgnoreCase(in)) {
				for(int j=0; j<names.length; j++) {
					if(names[j][1].equalsIgnoreCase(names[i][0])) {
						count++;
					}
				}
			}
		}
		if(count>1)
			System.out.println(in + " has " + count + " grandchildren.");
		else
			System.out.println(in + " has " + count + " grandchild.");
		sn.close();
	}

}
