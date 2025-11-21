package Assignmentday5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class collectionsExample {

	public static void main(String[] args) {
		 List<Integer> nums = Arrays.asList(10, 5, 2, 8,3,2,3,3,3);
		 Collections.sort(nums);
		 System.out.println(nums);
		 System.out.println();
		 System.out.println(nums.size());
		 System.out.println();
		 Collections.shuffle(nums);
		 System.out.println(nums);
		 Collections.swap(nums, 0, 5);
		 System.out.println(nums);
		 System.out.println();
		 System.out.println(Collections.frequency(nums, 3));
		
		 
		 

	}

}
