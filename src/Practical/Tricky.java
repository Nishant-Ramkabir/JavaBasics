package Practical;

public class Tricky {	
	
	
	public static void Ser(int n) {
		
		if (n==101) {
			return;
		}
		else
		{
			System.out.println(n);
			Ser(n+1);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Print Hello world without semicolon
		if(System.out.printf("Hello world") == null) {
			
		}
		 
		if (System.out.append("Hello world").equals(null)) {
			
		}
		
		Ser(1);
		
		
		
	}

}
