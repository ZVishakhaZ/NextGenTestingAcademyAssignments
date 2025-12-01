package day10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day10_6 {

	public static void main(String[] args) throws AWTException {
		// Use Robot class to press Ctrl + P on selenium.dev homepage.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");

		 Robot robot = new Robot();
		 
		 //pauses the execution for 2 seconds
		 robot.delay(2000);
		 
		 	robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_P);
			robot.keyRelease(KeyEvent.VK_P);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			
			System.out.println("Control P Pressed successfully");
			driver.quit();

		
	}
	
}
