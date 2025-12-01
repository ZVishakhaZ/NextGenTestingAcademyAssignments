package day11;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day11_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		String orgHandle= driver.getWindowHandle();
		WebElement popUpbtn=driver.findElement(By.id("PopUp"));
		popUpbtn.click();
		Thread.sleep(2000);
		
		Set<String> winHandle= driver.getWindowHandles();
		for(String handle: winHandle) {
			if(!handle.equalsIgnoreCase(orgHandle)) {
				
			
			driver.switchTo().window(handle);
			driver.manage().window().maximize();
			if(driver.getTitle().contains("Selenium")){
				
				driver.findElement(By.xpath("//a[contains(text(),'Register now!')]"));
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
}
