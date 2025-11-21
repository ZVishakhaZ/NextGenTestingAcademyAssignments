package Assignmentday5;

import java.io.File;

public class deletefile {

	public static void main(String[] args) {
		//String filename="abc.txt";
		File file= new File("oldLog.txt");
		System.out.println("delete file: "+ file.delete());
		if(file.delete()==false) {
			System.out.println("File has been deleted");
		}else {
			System.out.println("File exists");
		}
		

	}

}
