package Assignmentday3;

public class counterclass {
	
	static int counter=0;
	
	public counterclass() {
		counter++;
	}

	public static void main(String[] args) {
		counterclass c= new counterclass();
		counterclass c1= new counterclass();
		counterclass c2= new counterclass();
		counterclass c3= new counterclass();
		System.out.println("Increase Counter: "+ counterclass.counter);
		
		

	}

}
