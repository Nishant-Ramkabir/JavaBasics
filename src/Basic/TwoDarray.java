package Basic;

public class TwoDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s[][]= new String[2][2];
		
		//total number of rows
		System.out.println(s.length); 
		//total number of columns
		System.out.println(s[0].length);
		
		//1st row
		s[0][0] = "a";
		s[0][1] = "b";
		//2nd row
		s[1][0] = "c";
		s[1][1] = "d";
		
		System.out.println(s[1][1]);
		System.out.println("********");
		
		for (int i = 0; i < s.length; i++) {
			
			for (int j = 0; j < s[0].length; j++) {
				
				System.out.println(s[i][j]);
				
			}
			
		}
		
		
	

	}

}
