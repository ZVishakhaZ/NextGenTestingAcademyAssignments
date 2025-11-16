package Assignmentday2;

public class ifelse3 {

	public static void main(String[] args) {
		
		int temp=35;
		if(temp>45) {
			System.out.println("Temperature is too hot");
		}
		else if(temp>25||temp<45){
			System.out.println("Temperature is Normal");
		}
		else {
			System.out.println("Temperature is Cold");
		}

	}

}
