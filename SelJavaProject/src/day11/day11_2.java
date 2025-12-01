package day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement lnkPagination = driver.findElement(By.id("pagination"));
		List<WebElement> lstPage = lnkPagination.findElements(By.tagName("li"));
		
		
		driver.manage().window().maximize();
		WebElement tblPagination= driver.findElement(By.id("productTable"));
		List <WebElement> rows=tblPagination.findElements(By.xpath(".//tbody/tr"));
		System.out.println("Row Count is: "+  rows.size());
		List <WebElement> column=tblPagination.findElements(By.xpath(".//tbody/tr[1]/td"));
		System.out.println("column Count is: "+ column.size());
		
		String exName= "Wireless Mouse 0";
		String acName="";
		boolean prodSelected=false;
		
		for(int j=1;j<=lstPage.size()-1;j++) {
			lstPage.get(j).click();
			for(int i=1;i<=rows.size();i++) {
				acName= tblPagination.findElement(By.xpath(".//tbody/tr["+i+"]/td[2]")).getText();
				if(acName.equalsIgnoreCase(exName)) {
					tblPagination.findElement(By.xpath(".//tbody/tr["+i+"]/td[4]/input")).click();
					System.out.println("Product Selected");
					prodSelected=true;
					break;
				}
			
			}
			if(prodSelected) {
				break;
			}
		}
		if(!prodSelected) {
			System.out.println("Product not available");
		}
		System.out.println("Program execution Completed");
		
		
		
	}

}
