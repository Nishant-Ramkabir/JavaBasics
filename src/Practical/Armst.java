package Practical;

public class Armst {
	
	//153
	//1+125+27 = 153
	public static void arm(int n) {
		
		int r=0, sum=0, t=n;
		while (n>0) {
			r=n%10;
			n=n/10;
			sum = sum + (r*r*r);
			
			
		}
		
		if (sum==t) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not Armstrong Number");
		}
		
	}

	public static void main(String[] args) {
		
		arm(153);
		arm(111);
		arm(407);
	}

}
