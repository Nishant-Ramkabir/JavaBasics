package Practical;

public class PrimeN {
	
	public static boolean prime(int a) {
		
		if (a<=1) {
			return false;
		}
		
		for (int i = 2; i <a; i++) {
			if (a%i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Number 13 is Prime "+prime(13));
		
		
	}

}
