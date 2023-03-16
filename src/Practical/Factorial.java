package Practical;

public class Factorial {

	public static void facto(int n) {
		
		int fact = 1;
		if (n==0) {
			System.out.println("1");
			return;
		}
		
		for (int i = 1; i <=n; i++) {
				
				fact = fact*i;
		}
		System.out.println(fact);
	}
	
	public static int fact(int m) {
		if(m==0)
		{
			return 1;
		}else {
			return (m*fact(m-1));
		}
			
	}
	

	
	public static void main(String[] args) {
	
	
		facto(4);
		facto(1);
		facto(0);
		System.out.println(fact(5));
	

	}

}
