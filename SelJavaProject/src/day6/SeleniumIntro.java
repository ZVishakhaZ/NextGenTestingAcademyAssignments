package day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		String URL= driver.getCurrentUrl();
		System.out.println("I am on this URL: "+ URL);
		String title=driver.getTitle();
		System.out.println("Title of this page is: "+ title);
		
		driver.navigate().to("https://www.amazon.in/");
		String URL2= driver.getCurrentUrl();
		System.out.println("I am on this URL: "+ URL2);
		String title2=driver.getTitle();
		System.out.println("Title of this page is: "+ title2);
		//driver.close();
		driver.navigate().back();
		String URL3= driver.getCurrentUrl();
		System.out.println("I am on this URL: "+ URL3);
		driver.navigate().forward();
		String URL4= driver.getCurrentUrl();
		System.out.println("I am on this URL: "+ URL4);
		
		driver.navigate().refresh();
		System.out.println("Refreshed the current Page");
		
		driver.quit();
	}

}
