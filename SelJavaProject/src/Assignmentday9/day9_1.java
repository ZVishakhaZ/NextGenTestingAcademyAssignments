package Assignmentday9;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day9_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Write a script to open a new tab on W3Schools and switch to the tab.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();


		String orgHandle = driver.getWindowHandle();
		System.out.println("Original Handle: " + orgHandle);

		
		WebElement HTMLBtn = driver.findElement(By.xpath("//a[text()='Learn HTML']"));
		HTMLBtn.click();

		Thread.sleep(2000);

		
		Set<String> winHandles = driver.getWindowHandles();

		
		for (String handle : winHandles) {
		    if (!handle.equalsIgnoreCase(orgHandle)) {
		        driver.switchTo().window(handle);
		        driver.manage().window().maximize();

		        
		        if (driver.getTitle().contains("HTML Tutorial")) {

		           
		            driver.findElement(By.xpath("//a[text()='See all HTML Examples']")).click();

		            System.out.println("Switched to new tab: " + driver.getTitle());

		            driver.close();
		        }
		    }
		}
	}
	
}

