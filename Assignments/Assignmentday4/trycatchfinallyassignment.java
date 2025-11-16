package Assignmentday4;

public class trycatchfinallyassignment {

	public static void main(String[] args) {
		// Write code where try runs safely and only finally executes
		
		try {
			int a=10/0;
		}catch(ArithmeticException e){
			//System.out.println(e.getMessage());
		}finally {
		}
			System.out.println("Finally Block Exectues");
		}

	}


