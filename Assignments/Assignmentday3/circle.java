package Assignmentday3;

import java.util.ArrayList;
import java.util.List;

public class circle extends shape{
	
	public void drawshapes() {
		System.out.println("Square");
	}
	
	public void drawshapes(String shape) {
		System.out.println("shape "+ shape);
	}
	
	public void drawshapes(int thickness) {
		System.out.println("Thickness "+ thickness);
	}

	public static void main(String[] args) {
		circle c1= new circle();
		c1.drawshapes();
		c1.drawshapes(3);
		c1.drawshapes("Circle");
		 List<shape> shapes = new ArrayList<>();
	        shapes.add(new shape());
	      
	        shapes.add(new shape());
	        

	        // Iterate and call the overridden draw() method
	        for (shape shape : shapes) {
	            shape.draw(); // Runtime polymorphism in action
	        }
	    }
		

	}


