package Assignmentday4;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<>();
		
		ts.add(100);
		ts.add(99);
		ts.add(101);
		ts.add(555);
		ts.add(1);
		System.out.println(ts);
		
		int smallestNumber= ts.first();
		int largestNumber=ts.last();
		
		System.out.println("Smallest Number is: "+ smallestNumber);
		System.out.println("Largest Number is: "+ largestNumber);

	}

}
