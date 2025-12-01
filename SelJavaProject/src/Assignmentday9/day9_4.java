package Assignmentday9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day9_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//From datatables.net, click a button inside a row that contains “Ashton Cox”.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://datatables.net/");
		driver.manage().window().maximize();
		WebElement table= driver.findElement(By.id("example"));
		List<WebElement> rows = table.findElements(By.xpath("./tbody/tr"));
		System.out.println("No of rows: "+ rows.size());
		List<WebElement> cols= table.findElements(By.xpath("./tbody/tr/td"));
		System.out.println("No of cols: "+ cols.size());
		for (int i = 1; i <= rows.size(); i++) {

		    String name = table.findElement(By.xpath("./tbody/tr[" + i + "]/td[1]")).getText();

		    if (name.equals("Ashton Cox")) {

		        System.out.println("Found row containing: " + name);

		        WebElement detailsButton = table.findElement(By.xpath("//td[normalize-space()='Ashton Cox']"));
		        detailsButton.click();

		        System.out.println("Clicked details button for Ashton Cox!");

		        break;
		    }

	}
		
}
}
