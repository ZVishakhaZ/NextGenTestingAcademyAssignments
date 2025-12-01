package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day7_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
//		//by id
//		//driver.findElement(By.id("name")).sendKeys("Vishakha");
//		
//		//by name
//		driver.findElement(By.name("gender")).click();
//		
//		//by Partial linkText
//		
//		driver.findElement(By.partialLinkText("PlaywrightPra")).click();
//		driver.navigate().back();
//		
//		//by LinkText
//		driver.findElement(By.linkText("Udemy Courses")).click();
//		driver.navigate().back();
//		
//		//By TagName
//		List<WebElement> url=driver.findElements(By.tagName("a"));
//		for(WebElement l: url){
//			System.out.println(l.getText());
//		}
//		
//		//By classname
//		//driver.findElement(By.className("start")).click();
//		
//		//CSS selectors examples
//		//id
//		
//		//driver.findElement(By.cssSelector("#name")).sendKeys("Vishakha");
//		
//		//tagname with value of id
//		//driver.findElement(By.cssSelector("input#name")).sendKeys("Vishakha");
//		
//		//class
//		//driver.findElement(By.cssSelector(".start")).click();
//		//tagname with value of id
//		//driver.findElement(By.cssSelector("input.start")).click();
//		
//		driver.findElement(By.cssSelector("input[id=\"name\"][placeholder=\"Enter Name\"]")).sendKeys("V");
//		
//		//starts with
//		driver.findElement(By.cssSelector("input[placeholder^=\"Enter E\"]")).sendKeys("vishakha@gmail.com");
//		
//		//ends with
//		driver.findElement(By.cssSelector("input[placeholder$=\"EMail\"]")).sendKeys("V@gamil.com");
//		
//		//contains
//		driver.findElement(By.cssSelector("input[placeholder*=\"EMail\"]")).sendKeys("v@gmail.com");
		
		//Xpath Examples
		
		//Absolute Xpath
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Vishakha");
		
		//Relative Xpath
		//<tagname>[@<attributekey>="<attribute value>"]
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("v@gmail.com");
		
		//driver.findElement(By.xpath("//button[@name='start' or @name='stop']")).click();
		
		driver.findElement(By.xpath("//textarea[@id='textarea'and @class='form-control']")).sendKeys("Yavatmal");
		
		//text
		
		driver.findElement(By.xpath("//button[text()='START']")).click();
		driver.findElement(By.xpath("//button[text()='STOP']")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'STAR')]")).click();
		//driver.findElement(By.xpath(("//button[contains(@class,'STAR')]").click();
		
		//starts with
		
		driver.findElement(By.xpath("//button[starts-with(@class='START')]")).click();
		
		driver.findElement(By.xpath("label[text()='Address']")).sendKeys("Nagpur");
		//parent
		driver.findElement(By.xpath("//label[text()='Address:']/parent::*")).click();
		//following sibling
		driver.findElement(By.xpath("//label[text()='Address:']/following-sibling::textarea")).click();
		//ancestor
		driver.findElement(By.xpath("//label[text()='Address:']/ancestor::div"));
		
		//by index
		//label[text()='Address:']/ancestor::div[20]
		
		driver.findElement(By.xpath("(//input[@class='form-control'])[3]")).sendKeys("v");
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
