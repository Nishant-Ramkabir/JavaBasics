package OOPS2;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bmw b = new Bmw();
		b.start();  
		b.stop();
		
		Car c= new Car();
		c.start();
		
		
		//Top/Up casting
		//Runtime polymorphism
		Car c1= new Bmw();
		
		//it will call the overridden method
	
		c1.start();
		System.out.println("/////////////////////");
		//Down Casting
/*		try {
			Car c2= new Car();
			Bmw b2= (Bmw) c2;
			b2.start();
			
		} catch (ClassCastException e) {

			System.out.println(e);
		}
*/		

		
		Car c2 = new Bmw ();
		Bmw b2 = (Bmw) c2;
		b2.start();
		
		
	}

}
