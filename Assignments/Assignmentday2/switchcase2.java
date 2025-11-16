package Assignmentday2;

public class switchcase2 {

	public static void main(String[] args) {
		String env="Prod";
		switch (env) {
		case "DEV":
		System.out.println("Month is January ");
		break;
		
		case "UAT":
			System.out.println("Month is February ");
			break;

		case "PROD":
			System.out.println("Month is March");
			break;
			
		default:
			System.out.println("This env doesn't exist ");
			break;

	}

	}
}
