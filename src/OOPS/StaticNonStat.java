package OOPS;

public class StaticNonStat {
	
	String s = "Tom"; //Non static 
	static int age = 25; //static variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//How to call the static methods
		//1. By direct name
		sum();
		//2. calling by class name	
		StaticNonStat.sum();
		
		System.out.println(age);
		System.out.println(StaticNonStat.age);
		
		//How to call non static Var and method
		StaticNonStat o = new StaticNonStat();
		System.out.println(o.s);
		o.sendmail();
		
		//Can we access static method with object reference- yes but with warning
		o.sum();
		
		

	}
	
	
	public void sendmail() {
		System.out.println("Send mail method");
		
	}
	
	public static void sum() {
		System.out.println("Sum method");
	}
}
