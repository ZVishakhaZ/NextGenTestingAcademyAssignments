package Assignmentday4;

import java.util.ArrayList;
import java.util.List;

public class Listexample {

	public static void main(String[] args) {
		
		List<Integer> Numbers= new ArrayList <Integer>();
		Numbers.add(1);
		Numbers.add(2);
		Numbers.add(3);
		Numbers.add(4);
		Numbers.add(5);
		Numbers.add(6);
		Numbers.add(7);
		Numbers.add(8);
		Numbers.add(9);
		Numbers.add(10);
		
		System.out.println("Original List: "+ Numbers );
		
		for(int evenNumbers: Numbers) {
			if(evenNumbers%2==0) {
				System.out.println(evenNumbers);
				
			}
		}
		

	}

}
