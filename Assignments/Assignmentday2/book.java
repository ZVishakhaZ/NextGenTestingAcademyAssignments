package Assignmentday2;

public class book {
	
	
	String title="Testing101";
	String Author= "Vishakha";
	int price=80;
	
	void display() {
		System.out.println("Title of the book is "+ title+ " Name of the author is: "+ Author+ " Price of the book is "+ price);
	}
	

	public static void main(String[] args) {
		book b= new book();
		b.Author="ABC";
		b.title="DEF";
		b.price=100;
		b.display();
		

	}

}
