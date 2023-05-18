package File;

import java.io.File;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("C:\\Users\\nishant.ramkabir\\Downloads\\page.html");
		
		if (f.delete()) {
			System.out.println(f.getName()+"File Deleted Successfully");
			
		}
		
		
		
	}

}
