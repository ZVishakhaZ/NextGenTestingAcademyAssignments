package Assignmentday4;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		 Map<Integer, String> empDetails = new HashMap<>();
		
		 empDetails.put(101, "Vishakha");
		 empDetails.put(102, "Rushikesh");
		 empDetails.put(103, "Aditya");
		 empDetails.put(104, "Sumit");
		 empDetails.put(105, "Pratik");
		 
		 System.out.println(empDetails);
		 for (Map.Entry<Integer, String> entry : empDetails.entrySet()) {
	            System.out.println("empID: " + entry.getKey() + ", EmpName " + entry.getValue());
	        }
	}

}
