package Assignmentday4;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Set<Integer> s = new HashSet<>();
		 s.add(1);
		 s.add(2);
		 s.add(3);
		 s.add(4);
		 s.add(5);
		 s.add(6);
		 s.add(7);
		 s.add(8);
		 s.add(9);
		 s.add(10);
		 
		 System.out.println(s);
		 
		 s.add(10);
		 s.add(9);
		 s.add(8);
		 s.add(7);
		 s.add(6);
		 s.add(1);
		 s.add(2);
		 s.add(3);
		 s.add(4);
		 s.add(5);
		 System.out.println(s);

	}

}
