package day10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day10_4 {

	public static void main(String[] args) throws AWTException {
		// Robo Class: default selenium methods are not working
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Robot robot= new Robot();
		robot.delay(2000); //pauses the execution for 2 seconds
		
		WebElement txtArAddress= driver.findElement(By.id("textarea"));
		txtArAddress.click();
		
		String text="Hello";
		for(char c: text.toCharArray()) {
			int code= KeyEvent.getExtendedKeyCodeForChar(c);
			robot.keyPress(code);
			robot.keyRelease(code);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
		}
		robot.delay(2000);
		//Ctrl A
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		//Ctrl C
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		//mouse Hover Phone Field
		
		robot.mouseMove(300, 600);
		
		
		robot.mousePress(InputEvent.BUTTON2_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
	}
	
}
