package Assignmentday9;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day9_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Write a script to handle multiple windows on demo.opencart.com.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		String orgHandle= driver.getWindowHandle();
		WebElement btnPopUp= driver.findElement(By.id("PopUp"));
		btnPopUp.click();
		Thread.sleep(2000);
		
		Set<String> winHandles= driver.getWindowHandles();
		for(String handle:winHandles) {
			if(!handle.equalsIgnoreCase(orgHandle)) {
				driver.switchTo().window(handle);
				driver.manage().window().maximize();
			}
			if(driver.getTitle().contains("Selenium")) {
				driver.findElement(By.xpath("//h2[text()='Getting Started']"));
				System.out.println("On browser: " + driver.getTitle());
				driver.close();
				
			}else if(driver.getTitle().contains("Playwright")){
				
				driver.findElement(By.xpath("//a[contains(text(),'Get started')]"));
				System.out.println("On browser: " + driver.getTitle());
				driver.close();
			
		}
			
		
		

			
	}
		
}
	
}
