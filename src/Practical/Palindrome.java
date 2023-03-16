package Practical;

public class Palindrome {
	
	
	public static void pali(int n) {
		int r=0,t=n, sum=0;
		
		System.out.println("Number: "+n);
		while (n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			
			
		}
		
		if (t==sum) {
			System.out.println("Number is Palindrome");
			
		} else {
			System.out.println("Number is not Palindrome");
		}
		
	}

	public static void main(String[] args) {
		
		pali(121);
		pali(1211);

	}

}
