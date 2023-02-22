package OOPS2;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bmw b = new Bmw();
		b.start();  
		b.stop();
		
		Car c= new Car();
		c.start();
		
		
		//Top casting
		//Runtime polymorphism
		Car c1= new Bmw();
		//it will call the overridden method
	
		c1.start();
	}

}
