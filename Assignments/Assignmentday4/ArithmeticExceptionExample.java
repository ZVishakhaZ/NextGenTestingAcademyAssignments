package Assignmentday4;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int number1=10;
			int number2=0;
			System.out.println("Aritimetic Exception: "+ (number1/number2));
		}catch(ArithmeticException e) {
			System.out.println("Error Message: "+ e.getMessage());
		}

	}

}
