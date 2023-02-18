package OOPS;

public class Car {
	
	//Class variables
	int mod;
	int wheel;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//new Car() is object for car class
		// New keywork is use to create objects
		// abc is reference variables
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.mod = 2013;
		a.wheel = 4;
		b.mod = 2014;
		b.wheel = 4;
		c.mod = 2020;
		c.wheel = 4;
		
		System.out.println("Before assigning the reference ");
		
		System.out.println(a.mod);
		System.out.println(b.mod);
		System.out.println(c.mod);
		System.out.println(c.wheel);

		System.out.println("After shifting the reference");
		
		a=b;
		b=c;
		c=a;
		
		a.mod=10;
		System.out.println(a.mod);
		c.mod=20;
		System.out.println(c.mod);
		System.out.println(a.mod);
	}

}
