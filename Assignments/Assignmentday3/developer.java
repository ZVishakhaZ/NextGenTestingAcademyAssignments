package Assignmentday3;

public class developer extends employee1{
	
	String name2="Rushikesh";
	int studentid=202;
	
	public void displaydetails1() {
		System.out.println("Name of student is: "+ name2+ " Student id is: " + studentid);
	}

	public static void main(String[] args) {
		developer d= new developer();
		d.displaydetails();
		d.displaydetails1();

	}

}
