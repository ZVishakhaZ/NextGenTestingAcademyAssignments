package Assignmentday2;

public class student {
	
	String name="Vishakha";
	int rollno=101;
	int marks=95;
	void display() {
		System.out.print("Student Name "+ name+ " Student rollno "+ rollno+ " marks of student "+ marks );
	}
	public static void main(String[] args) {
		student s= new student();
		s.display();
		
		
	}

}
