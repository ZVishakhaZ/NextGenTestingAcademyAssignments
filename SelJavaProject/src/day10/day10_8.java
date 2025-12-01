package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day10_8 {

	public static void main(String[] args) {
		//Access nested shadow DOM in books-pwakit.appspot.com and print the title.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://books-pwakit.appspot.com/");
		driver.manage().window().maximize();
		WebElement outerShadowHost= driver.findElement(By.id("shadow_host"));
		
		SearchContext outerShadowRoot= outerShadowHost.getShadowRoot();
		
		WebElement innerShadowHost= outerShadowRoot.findElement(By.id("nested_shadow_host"));
		SearchContext innerShadowRoot= innerShadowHost.getShadowRoot();
		
		System.out.println(innerShadowRoot.findElement(By.id("nested_shadow_content")).isDisplayed());
		

	}

}
