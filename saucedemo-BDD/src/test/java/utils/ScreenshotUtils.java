package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtils {

	public static String captureAndSave(WebDriver driver, String name) {
		try {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			String dirPath = System.getProperty("user.dir") + "/screenshots";
			File dir = new File(dirPath);
			if (!dir.exists()) {
				dir.mkdirs();
			}

			String path = dirPath + "/" + name + ".png";
			FileUtils.copyFile(src, new File(path));
			return path;

		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static byte[] captureAsBytes(WebDriver driver) {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}
}
