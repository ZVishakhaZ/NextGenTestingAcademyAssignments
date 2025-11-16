package Assignmentday3;

public class student1 {
	
	String name;
	int rollno;
	
	// Default constructor
	public student1(){
		this.name="Vishakha";
		this.rollno=101;
		System.out.println("Inside Default Constructor");
		
	}
	//Parameterized Constructor
	public student1(String name1,int rollno1){
		this.name=name1;
		this.rollno=rollno1;
		System.out.println("Inside Paratemerised Constructor");
		
	}
	public void displaystudentdetails() {
		System.out.println("Name: "+ name+" rollno is: "+ rollno);
	}
	public void displaystudentdetails(String name1,int rollno1) {
		System.out.println("Name: "+ name1+" rollno is: "+ rollno1);
	}
	
	

}
