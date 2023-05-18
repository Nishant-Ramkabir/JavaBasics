package File;

import java.io.File;
import java.io.IOException;

public class File1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("C:\\Users\\nishant.ramkabir\\Downloads\\harshita.txt");
		
		try {
			if (f.createNewFile()) {
				
				System.out.println("File Created " + f.getName());
				
			} else {
				System.out.println("File is already exist");
				System.out.println("File Path "+f.getAbsolutePath());
				System.out.println("File name " +f.getName());

			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		

	}

}
