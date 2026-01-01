package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.DriverFactory;
import utils.ScreenshotUtils;

public class Hooks {

	@Before
	public void beforeScenario() {
		String browser = System.getProperty("browser");

		if (browser == null) {
			browser = "edge"; // default
		}

		DriverFactory.initDriver(browser);
		System.out.println("Driver initialized with browser: " + browser);
	}

	@After
	public void afterScenario(Scenario scenario) {

		if (scenario.isFailed() && DriverFactory.getDriver() != null) {

			String screenshotName = scenario.getName().replaceAll("[^a-zA-Z0-9-_]", "_");

			// Save screenshot to folder
			ScreenshotUtils.captureAndSave(DriverFactory.getDriver(), screenshotName);

			// Attach screenshot to Cucumber report
			byte[] screenshotBytes = ScreenshotUtils.captureAsBytes(DriverFactory.getDriver());

			scenario.attach(screenshotBytes, "image/png", "Failed Screenshot");
		}

		DriverFactory.quitDriver();
	}

}
