package day10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day10_7 {

	public static void main(String[] args) throws InterruptedException {
		// Use auto-suggest dropdown on makemytrip.com to select “Delhi”.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		String expResult= "New Delhi";
		
		
		Thread.sleep(5000);
		try {
			WebElement btnLoginClose= driver.findElement(By.cssSelector(".commonModal__close"));
			btnLoginClose.click();
		}catch(Exception e) {
			System.out.println("Handled");
			
		}
		try {
			WebElement chatbotPopUp= driver.findElement(By.xpath("//img[contains(@src,'close')]"));
			chatbotPopUp.click();
		}catch(Exception e) {
			System.out.println("Handled");
			
		}
		WebElement edtForm= driver.findElement(By.id("fromCity"));
		Thread.sleep(5000);
		edtForm.sendKeys("Del");
		WebElement autosuggestForm= driver.findElement(By.xpath("//ul[@class='react-autosuggest__suggestions-list']"));
		List<WebElement> autoSuggOptns= autosuggestForm.findElements(By.tagName("li"));
		
		
		for(WebElement opt: autoSuggOptns) {
			if(opt.getText().contains(expResult)) {
			opt.click();
			System.out.println("Option clicked");
			break;
			}
		}
		
	}


	}


