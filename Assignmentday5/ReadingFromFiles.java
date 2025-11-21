package Assignmentday5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFromFiles {

	public static void main(String[] args) {
		File file= new File("data.txt");
		try {
			if(file.createNewFile()){
				System.out.println("File has been created: "+ file.getName());
				}else {
					System.out.println("data.text already exists");
				}
			FileWriter writer = new FileWriter("data.txt");
			writer.write("Automation starts here");
			writer.close();
			Scanner sc = new Scanner("data.txt"); 
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
