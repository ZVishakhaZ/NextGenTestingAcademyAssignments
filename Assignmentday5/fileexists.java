package Assignmentday5;

import java.io.File;

public class fileexists {

	public static void main(String[] args) {
		File file = new File("myFile.txt");
		if(file.exists()) {
			System.out.println("File is present and the size of file is: "+ file.length());
			System.out.println("Absolute Path of file is: "+ file.getAbsolutePath());
		}else {
			System.out.println("File doesn't exists");	
			}
		}
		

	}


