package utils;

import page.LoginPage;

public class LoginHelper {

    public static void loginAsStandardUser() {

        DriverFactory.getDriver().get(ConfigReader.get("url"));
        String url = ConfigReader.get("url");
        System.out.println("LOGIN HELPER URL = " + url);
        LoginPage loginPage = new LoginPage();
        

        loginPage.login(
            ConfigReader.get("username"),
            ConfigReader.get("password")
        );
    }
}
