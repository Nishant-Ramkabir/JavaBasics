package OOPS;

public class Functions {

	public static void main(String[] args) {
		
		Functions f = new Functions();
		f.test();
		//f.test1();
		System.out.println(f.test1());
		//f.test2();
		System.out.println(f.test2());
		
		int t = f.div(20, 4);
		System.out.println(t);
		
		
		
	}
	//Non Static methods
	//1. No input No output
	//void means no return values
	public void test() {
		System.out.println("Test method");
		
	}
	//2. No input Some output
	//return type of this method is int
	public int test1() {
		System.out.println("Test1 method");
		int a=10,b=12;
		int c=a+b;
		
		return c;
	
	}
	
	public String test2() {
		System.out.println("test2 method");
		String s = "Selenium";
		
		return s;
	}
	
	//2.With input and output
	//X and Y is input arguments
	public int div(int k,int l) {
		System.out.println("Div method");
		int d = k/l;
		
		return d;
		
		
	}
	
}
