package Basic;

public class StringConcate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100, b = 200;
		
		String x = "Hello";
		String y = "World";
		
		//From left to right string concatenation will work
		
		System.out.println("The addition of a and b:"+(a+b));
		
		System.out.println(x+" "+y);
		
		System.out.println(a+b+x+y);
		
		System.out.println(x+y+a+b);
		
		System.out.println(x+y+(a+b));

	}

}
