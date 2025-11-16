package Assignmentday4;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashSet<String> hs = new HashSet<>();
		 hs.add("Vishakha");
		 hs.add("Rushikesh");
		 hs.add("Pratik");
		 hs.add("Amit");
		 hs.add("Parag");
		 System.out.println("Original Names: "+ hs);
		 hs.add("Vishakha");
		 hs.add("Rushikesh");
		 hs.add("Pratik");
		 hs.add("Amit");
		 hs.add("Parag");
		 System.out.println("After adding more Names: "+ hs);

	}

}
