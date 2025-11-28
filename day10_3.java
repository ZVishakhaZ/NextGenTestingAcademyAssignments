package day10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day10_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement webTable= driver.findElement(By.name("BookTable"));
		List<WebElement> rows = webTable.findElements(By.tagName("tr"));
		System.out.println("No of Rows: "+ rows.size());
		String CourseName="Master In Selenium";
		
		for(WebElement row: rows) {
			 List<WebElement> cols = row.findElements(By.tagName("td"));
			 //System.out.println("No of columns: "+ cols.size());
			 
			 if(cols.size()>0) {
				 String courseName = cols.get(0).getText();
				 System.out.println(courseName);
			if(courseName.equals(CourseName)) {
				String price = cols.get(3).getText();   
                System.out.println("Price for '" + CourseName + "' is: " + price);
                break;
			}
			 }
		}
		
		
			

	}

}

