package sept8;

public class ProgramPattern {

	public static void main(String[] args) {
		String word="PROGRAM";
		int len=word.length();
		for(int i=0;i<len;i++) {
			int l=(len-1)-i;
				for(int j=0;j<len;j++) {
					if(j==i||j==l) {
						System.out.print(word.charAt(j));
					}
					else {
						System.out.print(" ");
					}
				}
			System.out.println();
		}


	}

}
