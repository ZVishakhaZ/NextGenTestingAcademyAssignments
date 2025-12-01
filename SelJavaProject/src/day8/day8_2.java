package day8;

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
		//Mouse Hover
		
//		WebElement btnPointMe=driver.findElement(By.cssSelector(".dropbtn"));
		Actions act= new Actions(driver);
//		act.moveToElement(btnPointMe).build().perform();
//		System.out.println(	driver.findElement(By.xpath("//a[text()='Mobiles']")).isDisplayed());
//		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
//		
//		//double click
//		WebElement btnCopyText= driver.findElement(By.xpath("//button[text()='Copy Text']"));
//		act.doubleClick(btnCopyText).build().perform();
//		act.doubleClick(btnCopyText);
//		System.out.println(driver.findElement(By.id("field2")).getAttribute("value"));
		
		WebElement source= driver.findElement(By.id("draggable"));
		WebElement target= driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(source, target).build().perform();
		System.out.println("Dragged and dropped successfully");
		
		act.contextClick(driver.findElement(By.name("start"))).build().perform();
		
//		driver.close();
//		driver.quit();
		

	}

}
