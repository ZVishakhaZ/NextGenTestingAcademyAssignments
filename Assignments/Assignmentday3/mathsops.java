package Assignmentday3;

public class mathsops {
	
	int addition(int a,int b) {
		return a+b;
		
	}
	int substract(int a,int b) {
		return a-b;
		
	}
	int multiple(int a,int b) {
		return a*b;
		
	}
	public static void Message() {
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		Message();
		mathsops m= new mathsops();
		int num=m.addition(1, 2);
		System.out.println(num);
		int num2=m.substract(5, 4);
		System.out.println(num2);
		int num3=m.multiple(2, 3);	
		System.out.println(num3);

	}

}
