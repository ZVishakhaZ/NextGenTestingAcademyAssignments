package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class day7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement edtUsername= driver.findElement(By.id("name"));
		edtUsername.clear();
		edtUsername.sendKeys("Vishakha");
//		driver.findElement(By.id("name")).clear();
//		driver.findElement(By.id("name")).sendKeys("Vishakha");
		
		//System.out.println(driver.findElement(By.xpath("(//span))[1]")).getText());
		System.out.println("Placeholder values is : "+ edtUsername.getAttribute("placeholder"));
		
		//Handling Dropdowns
		WebElement drpCountry= driver.findElement(By.id("country"));
		Select s= new Select(driver.findElement(By.id("country")));
		List<WebElement> Options=s.getAllSelectedOptions();
		//s.selectByValue("france");
		//System.out.println("Selected usimg value: "+ s.getFirstSelectedOption());
		//s.selectByIndex(0);
		//s.selectByVisibleText("India");
		s.selectByContainsVisibleText("China");
		
	Select drpAnimals= new Select( driver.findElement(By.id("animals")));
	drpAnimals.selectByIndex(0);
	drpAnimals.selectByIndex(1);
	drpAnimals.selectByIndex(2);
	System.out.println("First Selected Options is: "+ drpAnimals.getFirstSelectedOption().getText() );
	drpAnimals.deselectAll();
	
	
//		for(WebElement l:Options) {
//			System.out.println(l);
//		}

		
		
		

	}

}
