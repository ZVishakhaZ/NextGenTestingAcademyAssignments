package Assignmentday8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class day8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement btnPointMe= driver.findElement(By.cssSelector(".dropbtn"));
		Actions act= new Actions(driver);
		act.moveToElement(btnPointMe).build().perform();
		WebElement Laptop= driver.findElement(By.xpath("//a[text()='Laptops']"));
		Laptop.click();

	}

}
