package Assignmentday5;

import java.io.File;
import java.io.IOException;

public class newfilecreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file= new File("report.txt");
		try {
			if(file.createNewFile()){
				System.out.println("File has been created: "+ file.getName());
				}else {
					System.out.println("report.text already exists");
				}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
