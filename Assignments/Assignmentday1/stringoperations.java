package Assignmentday1;

public class stringoperations {

	public static void main(String[] args) {
		String sentence= "Automation testing with java";
		System.out.println("Length of string is "+ sentence.length());
		System.out.println("Print only substring: testing "+ sentence.substring(11, 18));
		System.out.println("Print to uppercase: "+ sentence.toUpperCase());
		System.out.println("Does string contain Selenium: "+ sentence.contains("Selenium"));
		
		String name1="PASS";
		String name2="pass";
		System.out.println(name1==name2);
		System.out.println(name1.equalsIgnoreCase(name2));
		
		
	

	}

}
