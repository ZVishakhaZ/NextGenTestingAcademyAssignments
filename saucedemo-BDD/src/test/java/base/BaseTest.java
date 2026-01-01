package base;

import utils.ConfigReader;
import utils.DriverFactory;

public class BaseTest {

	protected void launchApp() {
		System.out.println("Launch Application");
		ConfigReader.loadProperties();
		String browser = ConfigReader.get("browser");
		DriverFactory.initDriver(browser);
		DriverFactory.getDriver().manage().window().maximize();		
		String url = ConfigReader.get("appUrl");
		DriverFactory.getDriver().get(url);
	}
	
	protected void tearDown() {
		System.out.println("Closing Application");
		DriverFactory.quitDriver();
	}
	
}
