package day10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//UseCase: how many columns and rows are there
		//Usecase: is value present in that column or row
		WebElement tableStatic= driver.findElement(By.name("BookTable"));
		List <WebElement> rows=tableStatic.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		System.out.println("Row Count is: "+  rows.size());
		List <WebElement> column=tableStatic.findElements(By.xpath(".//tbody/tr/th"));
		System.out.println("column Count is: "+ column.size());
		String strAuthor= tableStatic.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[3]/td[2]")).getText();
		System.out.println(strAuthor);
			

	}

}
