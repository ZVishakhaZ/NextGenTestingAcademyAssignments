package Assignmentday3;

public class local_instancevariable {

	int num1=101;
	String name1= "Rushikesh";
	static String name2="Pratik";
	
	public void display() {
		int num=21;
		String name="Vishakha";
		System.out.println("number is "+ num+ " name is: "+ name);
		System.out.println("number is "+ num1+ " name is: "+ name1);
		System.out.println(name2);
		
		String[] s = {"Vish","Rush","Sanket"};
		for (String a:s) {
			int num3=23;
			//System.out.println(s.length);
			System.out.println(a);
			
		}
		//System.out.println(num3); not accessible because of block scope
		
	}
	public static void main(String[] args) {
		local_instancevariable c1= new local_instancevariable();
		c1.display();

	}

}
