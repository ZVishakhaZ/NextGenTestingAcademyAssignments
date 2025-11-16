package Assignmentday3;

public class student {
	
	public void study() {
		System.out.println("inside study method");
		
	}
	public void displaydetails() {
		System.out.println("inside display details method");
		
	}

	/* class and object
	 * WebDriver class/interface
	 * driver-object
	 * Chromedriver- class implementing webdriver
	 * 
	 * Encapsulation
	 * driver.manage.window.maximize
	 * manage gives access to window and timeout settings but internal implementation is hidden
	 * 
	 * Inheritance
	 * Chromedriver inherits functionality from Remote Webdriver and implements webdriver interface
	 * 
	 * Polymorphism
	 * WebDriver driver;
	 * driver= new Chromedriver();
	 * 
	 *driver.get("google");
	 *driver= new Firefoxdriver();
	 *driver.get("facebook");
	 *driver variable can refer to different browser driver objects but the same method get() across all
	 *
	 *Thats runtime polymorphism same interface different behavoiur
	 *
	 *Abstraction
	 *driver.findelement(By.id("username").sendkeys("Vishakha");
	 *how selenium locates the element in the DOM Internally 
	 */

}
