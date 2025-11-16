package Assignmentday3;

public class example_1 {
	
	private String name="Vishakha";
	String name1="Rushikesh";
	protected String name3="Ganga";
	
	public void displaynames() {
		String name2="Pratik";
		System.out.println("Names are: "+ name+ " "+ name1+ " "+ name3);
	}
	public static void main(String[] args) {
		example_1 e= new example_1() ;
			e.displaynames();
			
		
	}
	

}
