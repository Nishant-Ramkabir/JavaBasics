package Basic;

public class IfElseConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=1, b=20;
		
		if (b>a) {
			
			System.out.println("B is greater");
			
		} else {
			System.out.println("A is greater");
		}
		
		//Comparison operator
		// < > <= >= == !=
		
		int c=4,d=4;
		if (c==d) {
			System.out.println("equal");
		} else {
			System.out.println("no equal");
		}
		
		
		//Highest number from 3
		int p=9,q=6,r=5;
		
		if (p>q && p>r)
		{
			System.out.println("P is greater");
		}
		else if (q>p && q>r)
		{
			System.out.println("Q is greater");
		}
		else
		{
			System.out.println("R is greater");
		}
		
	}


	}


