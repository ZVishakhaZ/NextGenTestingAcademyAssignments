package day9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//Simple Alert
		
		WebElement altSimple=driver.findElement(By.id("alertBtn"));
		altSimple.click();
		Alert popSimple = driver.switchTo().alert();
		System.out.println(popSimple.getText());
		popSimple.accept();
		driver.switchTo().defaultContent();
		
		
		//Confirmation Alert
		WebElement altConfirm=driver.findElement(By.id("confirmBtn"));
		altConfirm.click();
		Alert popup= driver.switchTo().alert();
		System.out.println(popup.getText());
		popup.dismiss();
		driver.switchTo().defaultContent();
		
		//Prompt Button
		WebElement altPrompt=driver.findElement(By.id("promptBtn"));
		altPrompt.click();
		Alert Popup=driver.switchTo().alert();
		Popup.sendKeys("Vishakha");
		System.out.println(Popup.getText());
		Popup.accept();
		
		
		

	}

}
