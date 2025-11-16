package Assignmentday1;

public class logintest2 {

	public static void main(String[] args) {
		boolean loginPassed= true;
		boolean homePageLoaded= false;
		boolean finalResult= loginPassed && homePageLoaded;
		System.out.println(finalResult);
		boolean finalResult1= loginPassed || homePageLoaded;
		System.out.println(finalResult1);
		boolean finalResult2= loginPassed != homePageLoaded;
		System.out.println(finalResult2);
		
		int testid=10;
		int testid1=9;
		
		System.out.println("Test id is even: " +testid%2);
		System.out.println("Test id is odd: " +testid1%2);

		int testcase=1;
		int testcounter=0;
		if(testcase==1) {
			testcounter+=1;
			System.out.println(testcounter);
		}
		else {
			testcounter-=1;
			System.out.println(testcounter);
		}
		
	}

}
