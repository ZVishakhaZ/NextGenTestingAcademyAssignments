package Assignmentday5;

public class Container <V>{
	
	private V value;
	
	public Container(V value) {
		this.value = value;
		
	}
	
	 public void printValue() {
	        System.out.println("Value: " + value);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Container<Integer> c = new Container<>(123);
	        c.printValue();

	        // Example with String
	        Container<String> c1 = new Container<>("Hello Generics!");
	       c1.printValue();

	}

}
