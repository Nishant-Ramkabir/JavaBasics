package Practical;


public class AlphaPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for (int i = 0; i <5; i++) {
			for (int j = 0; j <=i; j++) {
				int alpha = 65;
				System.out.print((char)(alpha+j)+" ");
			}
			System.out.println("");
		}

	}

}
