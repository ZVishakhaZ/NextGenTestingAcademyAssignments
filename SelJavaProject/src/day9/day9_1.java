package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day9_1 {

	public static void main(String[] args) {
		// Element Operations
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement btnStart= driver.findElement(By.name("start"));
		js.executeScript("arguments[0].click();",btnStart);
		WebElement edtAddress= driver.findElement(By.id("textarea"));
		js.executeScript("arguments[0].value='Airoli';", edtAddress);
		WebElement lnkErr503= driver.findElement(By.linkText("Errorcode 503"));
		js.executeScript("arguments[0].scrollIntoView(true);", lnkErr503);
		
	}

}
