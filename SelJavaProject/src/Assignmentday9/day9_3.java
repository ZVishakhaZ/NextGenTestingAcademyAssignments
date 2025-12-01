package Assignmentday9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day9_3 {

	public static void main(String[] args) {
		// Read all data from the static table on W3Schools and print company names.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		WebElement tableStatic = driver.findElement(By.id("customers"));
		List<WebElement> rows= tableStatic.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println("No of rows: "+ rows.size());
		List<WebElement> columns= tableStatic.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		System.out.println("No of columns: "+ columns.size());
		String companyName= tableStatic.findElement(By.xpath("//table[@id='customers']/tbody/tr[1]/th[1]")).getText();
		System.out.println(companyName);
		
		System.out.println("Company Names:");
		for (int i = 2; i <= rows.size(); i++) {
		    String company = tableStatic.findElement(By.xpath("./tbody/tr[" + i + "]/td[1]")).getText();
		    System.out.println(company);
		


	}

}
}
