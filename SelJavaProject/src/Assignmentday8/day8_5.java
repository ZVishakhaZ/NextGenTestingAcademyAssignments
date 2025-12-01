package Assignmentday8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day8_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://qaplayground.dev/apps/iframe/");
		driver.manage().window().maximize();
		driver.switchTo().frame(1);
		driver.switchTo().frame(2);
		WebElement btnClickMe= driver.findElement(By.xpath("//a[text()='Click Me']"));
		btnClickMe.click();
		System.out.println(driver.findElement(By.id("msg")).getText());
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.quit();
		

	}

}
