package OOPS;

public class CallByValue {

		int p,q;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CallByValue a = new CallByValue();
		int x=10,y=5;
		
		//call by values or pass by values
		a.sum(x, y);
		
		a.p=20;
		a.q=30;
		//call by reference
		a.swap(a);
		System.out.println(a.p+"  "+a.q);
			

	}
	
	public int sum(int a, int b) {
		
		int c = a+b;
		return c;
	}
	
	//call by reference
	public void swap(CallByValue t) {
		
		int temp;
		temp=t.p;
		t.p=t.q;
		t.q=temp;
		
		
	}

}
