package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Method 1
		File f = new File("C:\\Users\\nishant.ramkabir\\Downloads\\harshita.txt");
		
		try {
			Scanner sc = new Scanner(f);
			while (sc.hasNextLine()) {
				String file = sc.nextLine();
				
				System.out.println("File Data:"+file);
				
			}
			
			sc.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		//Method 2
		
		try {
			FileReader fr = new FileReader("C:\\Users\\nishant.ramkabir\\Downloads\\harshita.txt");
			int i;
			while ((i = fr.read())!=-1) {
				System.out.print((char)i);
				
			}
			fr.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		

	}

}
