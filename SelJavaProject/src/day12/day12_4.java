package day12;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class day12_4 {

	public static void main(String[] args) throws InterruptedException {
		// Selenium Waits
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.webdriveruniversity.com/Accordion/index.html");
		//thread.sleep(2000);
		
		//Implicit Wait
//		System.out.println("Waiting Implicitly ");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		WebElement lblWaitForComplete= driver.findElement(By.xpath("//p[text()='LOADING COMPLETE.']"));
//		
//		System.out.println("Execution Completed");
		
		//Explicit Wait
//		System.out.println("Waiting explicitly..");
//		WebDriverWait explicitWait= new WebDriverWait(driver,Duration.ofSeconds(50));
//		explicitWait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//p[text()='LOADING COMPLETE.']"), "LOADING COMPLETE."));
		
		//Fluent Wait
		
		System.out.println("Fluently..");
		Wait<WebDriver> fluentWait=  new FluentWait<>(driver)
						.withTimeout(Duration.ofSeconds(50))
						.pollingEvery(Duration.ofMillis(100))
						.ignoring(Exception.class);
		
		WebElement elm = fluentWait.until(dr->{
			WebElement e=dr.findElement(By.id("hidden-text"));
					String text= e.getText().trim();
					return text.contains("LOADING COMPLETE.")?e:null;
		});
		
		
		
		
		
		
		
		
		System.out.println("Execution Completed");
		
		
		
		
		

	}

}
