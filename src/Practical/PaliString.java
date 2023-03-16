package Practical;

public class PaliString {
	
		
	public static void pali(String s) {
			String rev= " ";
		
			System.out.println("String :" + s);
		for (int i = s.length()-1; i >=0; i--) {
			
			
			rev = rev + s.charAt(i);
		}
		
		
		if (s.equals(rev)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Non Palindrome");
		}
			
	}
	
	public static void main(String[] args) {
		
		pali("saas");
		pali("DOM");
		
	}

}
