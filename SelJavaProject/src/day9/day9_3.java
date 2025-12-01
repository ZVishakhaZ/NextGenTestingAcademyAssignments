package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day9_3 {

	public static void main(String[] args) {
		// iframes
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://qaplayground.dev/apps/iframe/");
		driver.manage().window().maximize();
		driver.switchTo().frame("frame1");
		driver.switchTo().frame("frame2");		
		//WebElement button= driver.findElement(By.linkText("Click Me"));
		WebElement clickMe=driver.findElement(By.xpath("//a[@class='btn btn-green-outline']"));
		//System.out.println(driver.findElement(By.linkText("Click Me")).getText());
		//button.click();
		clickMe.click();
		System.out.println(driver.findElement(By.id("msg")).getText());
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		WebElement btnTestSuite=driver.findElement(By.xpath("//b[text()='View Test Suite']"));
		btnTestSuite.click();
		driver.switchTo().defaultContent();
		driver.quit();
		
		
		
		
		

	}

}
