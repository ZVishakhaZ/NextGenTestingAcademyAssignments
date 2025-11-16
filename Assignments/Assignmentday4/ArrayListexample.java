package Assignmentday4;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names= new ArrayList<String>();
		names.add("Vishakha");
		names.add("Rushikesh");
		names.add("Sumit");
		names.add("Sonal");
		names.add("Dhanshree");
		names.add("Aditya");
		
		System.out.println(names);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name which needs to be removed: ");
		String nametoberemoved= sc.nextLine();
		if(names.remove(nametoberemoved)) {
			System.out.println(nametoberemoved+ " is removed");
		}else {
			System.out.println("Name not in list");
		}

	}

}
