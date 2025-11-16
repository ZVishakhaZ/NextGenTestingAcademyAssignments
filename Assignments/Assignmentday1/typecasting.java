package Assignmentday1;

public class typecasting {

	public static void main(String[] args) {
		
		int num1=10;
		int testcount=150;
		double testcount1= testcount;
		System.out.println(testcount1);
		double passrate=99.5;
		int passrate1= (int) passrate;
		System.out.println(passrate);
		System.out.println(passrate1);
		
		
		//why is type casting useful in test automation logs
		/*
		 * 1) to log data in a HUman readable format
		 * 2) To match datatypes during comparisons
		 * 3) To format objects and values in logs
		 * 4) To avoid Log errors or ClassCastExceptions
		 */
		

	}

}
