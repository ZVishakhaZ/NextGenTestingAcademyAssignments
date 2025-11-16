package Assignmentday4;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(10, "Ten");
		tm.put(1, "One");
		tm.put(3, "Three");
		tm.put(100, "Hundred");
		tm.put(99, "Ninety Nine");
		System.out.println(tm);
		
		int firstEntry= tm.firstKey();
		int lastEntry=tm.lastKey();
		System.out.println("First Entry: "+firstEntry );
		System.out.println("Last Entry: "+ lastEntry);

	}

}
