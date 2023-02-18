package OOPS;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "100";
		int i = 20;
		
		System.out.println(x+i);
		
		//From string to int
		int y = Integer.parseInt(x);
		System.out.println(i+y);
		
		//From Int to string
		String p = String.valueOf(i);
		System.out.println(p+x);
		

	}

}
