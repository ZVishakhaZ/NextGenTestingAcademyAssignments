package Assignmentday4;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> queue= new LinkedList<String>();
		queue.add("Task1");
		queue.add("Task2");
		queue.add("Task3");
		queue.add("Task4");
		queue.add("Task5");
		System.out.println("Original queue: "+ queue);
		
		queue.addFirst("Task0");
		queue.addLast("TaskFinal");
		
		System.out.println("Updated queue: "+ queue );
		

	}

}
