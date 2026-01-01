package utils;

import java.util.Properties;
import java.io.FileInputStream;

public class ConfigReader {

	private static Properties configProp;
	private static Properties envProp;

	public static void loadProperties() {
		configProp = new Properties();
		envProp = new Properties();

		try {
			// Load config.properties
			FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
			configProp.load(fis);

			// Read env
			String env = configProp.getProperty("env").trim().toLowerCase();

//			Debug Log (Temporary)
//			System.out.println("ENV = " + env);

			// Load env file ex: staging.properties
			FileInputStream envFis = new FileInputStream("src/test/resources/" + env + ".properties");
			envProp.load(envFis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String get(String key) {

		if (configProp == null || envProp == null) {
			loadProperties();
		}

		if (envProp.getProperty(key) != null) {
			return envProp.getProperty(key);
		}

		return configProp.getProperty(key);
	}
}
