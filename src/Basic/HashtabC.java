package Basic;

import java.util.Hashtable;

public class HashtabC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable a = new Hashtable();
		
		a.put(1, 100);
		a.put("a", "Brown");
		
		System.out.println(a.size());
		System.out.println(a.get("a"));
		
		
		Hashtable<Integer, Integer> ar = new Hashtable<Integer, Integer>();
		ar.put(1, 1);
		ar.put(2, 2);
		
		
	}
	
	

}
