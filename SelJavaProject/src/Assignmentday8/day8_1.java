package Assignmentday8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement rdbtn= driver.findElement(By.id("male"));
		if(!rdbtn.isSelected()) {
			rdbtn.click();
			System.out.println("Radio button for male is selected");
			}
		WebElement chkbox= driver.findElement(By.id("tuesday"));
		if(!chkbox.isSelected()) {
			chkbox.click();
			System.out.println("Checkbox for Tuesday is selected");
			}
	}
	

}
