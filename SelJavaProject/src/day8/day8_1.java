package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day8_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement rdGenderM= driver.findElement(By.id("male"));
		if(!rdGenderM.isSelected()) {
			rdGenderM.click();
			System.out.println("Gender Male is selected");
		}
		
		WebElement chkMonday= driver.findElement(By.id("monday"));
			if(!chkMonday.isSelected()) {
				chkMonday.click();
				System.out.println("Monday Checkbox is checked");
			}
		}
		
		
		

	}


