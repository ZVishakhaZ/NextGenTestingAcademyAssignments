package Assignmentday5;

import java.util.Arrays;
import java.util.List;

public class EvenNumberIterator {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		 for(int evenNumbers: numbers) {
			 if(evenNumbers%2==0) {
				 System.out.println("Even Numbers are: "+evenNumbers);
			 }
		 }
		 

	}

}
