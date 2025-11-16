package Assignmentday2;

public class foreachloop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {5, 10, 15,20};
		int sum=0;
		for (int n : numbers) {
			sum=sum+n;
		
		}
		System.out.println("Sum of numbers in Array is: "+sum);

	}

}
