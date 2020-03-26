package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private static final String URL = "https://login.salesforce.com/";
    private static final By USERNAME = By.id("username");
    private static final By PASSWORD = By.id("password");
    private static final By LOGIN_BUTTON = By.id("Login");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage openPage() {
        driver.get(URL);
        return this;
    }

    @Override
    public BasePage isPageOpened() {
        return null;
    }

    public LoginPage writeUserName(String username) {
        driver.findElement(USERNAME).sendKeys(username);
        return this;
    }
    public LoginPage writePassword(String password) {
        driver.findElement(PASSWORD).sendKeys(password);
        return this;
    }
    public LoginPage clickLogin() {
        driver.findElement(LOGIN_BUTTON).click();
        return this;
    }

}
