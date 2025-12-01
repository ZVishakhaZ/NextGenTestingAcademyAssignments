package day10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day10_1 {

	public static void main(String[] args) {
		//Handling multiple windows and data table
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement btnNewTab= driver.findElement(By.xpath("//button[text()='New Tab']"));
		String originalHandle= driver.getWindowHandle();
		System.out.println("Original Handle: "+ originalHandle);
		System.out.println("Current URL: "+ driver.getCurrentUrl());
		btnNewTab.click();
		
		Set<String> handles= driver.getWindowHandles();
		String newHandle = null;
		for(String h: handles) {
			if(!h.equals(originalHandle)) {
				newHandle=h;
				break;
				
			}
		}
		driver.switchTo().window(newHandle);
		System.out.println("Newtab URL: : "+ driver.getCurrentUrl());
		
	}

}
