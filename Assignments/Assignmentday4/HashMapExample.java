package Assignmentday4;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<String,Integer> Groceries = new HashMap<>();
		 Groceries.put("Tomato",20);
		 Groceries.put("Potato",40);
		 Groceries.put("Onions",100);
		 Groceries.put("Cucumber",15);
		 Groceries.put("Carrots",20);
		 
		 System.out.println("Original Groceries List: "+ Groceries );
		 Groceries.put("Onions", 200);
		 System.out.println("Updates Groceries List: "+ Groceries);
		 
		 

	}

}
