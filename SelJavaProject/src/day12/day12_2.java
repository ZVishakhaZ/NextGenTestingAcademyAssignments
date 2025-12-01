package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day12_2 {

	public static void main(String[] args) {
		// Shadow DOM
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement shadowHost= driver.findElement(By.id("shadow_host"));
		
		SearchContext shadowRoot= shadowHost.getShadowRoot();
		
		WebElement edtText= shadowRoot.findElement(By.cssSelector("input[type='text']"));
		edtText.sendKeys("Vishakha");
		//driver.close();
		//This element is in shadowDOM - input[type='text']
		

	}

}
