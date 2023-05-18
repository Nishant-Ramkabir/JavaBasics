package File;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileWriter fw = new FileWriter("C:\\Users\\nishant.ramkabir\\Downloads\\harshita.txt");
			
			fw.write("Harshita is cutiepie");
			fw.close();
			System.out.println("Data written successfully");
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
