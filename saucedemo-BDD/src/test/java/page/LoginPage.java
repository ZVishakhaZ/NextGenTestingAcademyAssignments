package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;
import utils.DriverFactory;

public class LoginPage extends BasePage {

	@FindBy(id = "user-name")
	WebElement userName;

	@FindBy(id = "password")
	WebElement passWord;

	@FindBy(id = "login-button")
	WebElement btnLogin;


	public LoginPage() {
		super();
		PageFactory.initElements(DriverFactory.getDriver(), this);
	}

	public void enterUsername(String username) {
		 waitforVisible(userName);
		    userName.clear();
		    userName.sendKeys(username);
	}

	public void enterPassword(String password) {
		passWord.sendKeys(password);
	}

	public void clickLogin() {
		btnLogin.click();
	}
	
	public void login(String username, String password) {
		enterUsername(username);
		enterPassword(password);
        clickLogin();
    }

}
