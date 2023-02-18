package Basic;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. while loop
		// Disadvantage of of the while loop is it can go into infinite loop
		
		int i=0;
		while(i<5){
			System.out.println(i);
			i = i+1;
			
		}
		
		System.out.println("**********");
		
		//2. For loop
		// j++ means J=J+1
		
		for (int j = 1; j < 5; j++) {
			System.out.println(j);
			
		}
		System.out.println("**********");	
		
		for (int k = 5; k >=1 ; k--) {
			System.out.println(k);
			
		}
		

	}

}
