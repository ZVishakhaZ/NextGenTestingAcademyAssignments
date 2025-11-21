package Assignmentday5;

import java.io.FileWriter;
import java.io.IOException;

public class WritingInFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter writer = new FileWriter("start.txt");
			writer.write("Automation starts here");
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
