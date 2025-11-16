package Assignmentday4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseListexample {

	public static void main(String[] args) {
		
		List<String> OriginalList= new ArrayList<String>();
		OriginalList.add("Vishakha");
		OriginalList.add("Rushikesh");
		OriginalList.add("Pratik");
		OriginalList.add("Sanket");
		OriginalList.add("Sonal");
		OriginalList.add("Aarti");
		
		System.out.println("OriginalList is: "+ OriginalList);
		
		Collections.sort(OriginalList);
		System.out.println("SortedList: "+ OriginalList);
		Collections.sort(OriginalList,Collections.reverseOrder());
		System.out.println("ReveredList: "+ OriginalList);
		
		
		
		
		

	}

}
