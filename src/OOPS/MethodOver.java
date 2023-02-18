package OOPS;

public class MethodOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOver o = new MethodOver();
		o.sum();
		o.sum(6);
		o.sum(4, 6);
	}
	
	
	//method overloading - same name of function with different arguments
	public void sum() {
		System.out.println("Sum with 0 input parameter");
	}
	
	public int sum(int i) {
		System.out.println("Sum method with 1 input parameter");
		System.out.println(i);
		return i;
	}
	
	public void sum(int i,int j) {
		System.out.println("Sum with 2 input parameter");
		System.out.println(i+" "+j);
	}
	

}
