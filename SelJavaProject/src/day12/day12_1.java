package day12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class day12_1 {

	public static void main(String[] args) {
		// calendar 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement calPicker= driver.findElement(By.id("txtDate"));
		calPicker.click();
		
		String day="31";
		String month="Aug";
		String year="2022";
		
		Select drpMonth= new Select(driver.findElement(By.className("ui-datepicker-month")));
		Select drpYear= new Select(driver.findElement(By.className("ui-datepicker-year")));
		
		String exsMonth= drpMonth.getFirstSelectedOption().getText();
		String exsYear= drpMonth.getFirstSelectedOption().getText();
		
		if(!exsMonth.equalsIgnoreCase(month)) {
			drpMonth.selectByVisibleText(month);
		}
		drpYear= new Select(driver.findElement(By.className("ui-datepicker-year")));
		if(!exsYear.equalsIgnoreCase(year)) {
			drpYear.selectByVisibleText(year);
		}
		
		WebElement tblCalendar = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> lstDays= tblCalendar.findElements(By.tagName("a"));
		for(WebElement elm:lstDays) {
			
			if(elm.getText().equalsIgnoreCase(day)) {
				System.out.println("Date found");
				elm.click();
			}
			
		}
		
		System.out.println("Date Selected");
	}

}
