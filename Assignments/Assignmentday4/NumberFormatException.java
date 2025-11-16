package Assignmentday4;

public class NumberFormatException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//            int num = Integer.parseInt("XYZ");  
//        } catch (NumberFormatException e) {
//            System.out.println("NumberFormatException occurred: " + e.getMessage());
//        }
		
		try {
            int[] arr = {1, 2, 3};
            int x = arr[5];  
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }

	}

}
