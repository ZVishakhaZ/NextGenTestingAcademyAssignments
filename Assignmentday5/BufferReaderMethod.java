package Assignmentday5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fileName= "data.txt";
		int lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while (br.readLine() != null) {
                lineCount++;
            }
            System.out.println("Number of lines: " + lineCount);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

	}

}
