package Basic;

import java.util.ArrayList;
import java.util.Iterator;

public class AryListC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//general arraylist
		ArrayList a = new ArrayList();
		a.add(400);
		a.add(22.22);
		a.add("Demo");
		a.add("Hello");
		a.add("lo");
		
		System.out.println(a.size());
		a.remove(4);
		System.out.println("After remove "+a.size());
		System.out.println(a.get(0));
		
		
		for (int i = 0; i < a.size(); i++) {
			
			System.out.println(a.get(i));
		}
		
		//Integer arrray list 
		ArrayList<Integer> ar= new ArrayList<Integer>();
				ar.add(300);
				//ar.add("hello");

	}

}
