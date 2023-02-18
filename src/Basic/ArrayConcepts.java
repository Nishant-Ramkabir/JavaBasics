package Basic;

public class ArrayConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1D array
		
		int i[] = new int[4];
		i[0]=1;
		i[1]=2;
		i[2]=3;
		i[3]=4;
		
			System.out.println(i[1]);
			
			//length is 0 to 3 so for i[4] array out of bound exception
			
			//System.out.println(i[4]);
		
			//Size of the array
			System.out.println("size of the array is "+i.length);
			
		for(int j=0;j<i.length;j++)
		{
			System.out.println(i[j]);
		}
		
		
		
		//String array
		String s[] = new String[2];
		s[0] = "Cow";
		s[1] = "Dog";
		
		System.out.println(s[1]);
		
		//Object Array
		Object o[] = new Object[3];
		o[0]= "Nick";
		o[1]= 12.2;
		o[2]= 25;
		
	
		for (int p = 0; p < o.length; p++) {
			System.out.println(o[p]);
		}
		
		
		
		
			
			
		
	}

}
