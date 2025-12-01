package day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day11_4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		String expResult= "London City Airport";
		
		
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
		//WebElement edtForm= driver.findElement(By.cssSelector("label[for='fromCity'] span[class='lbl_input appendBottom10']"));
		//Thread.sleep(5000);
		//edtForm.click();
		Thread.sleep(5000);
		edtForm.sendKeys("Lon");
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
