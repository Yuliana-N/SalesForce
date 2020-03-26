package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import page.AccountPage;
import page.ContactPage;
import page.LoginPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;
    LoginPage loginPage;
    AccountPage accountPage;
    ContactPage contactPage;
    @BeforeTest
    public void setDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        accountPage = new AccountPage(driver);
        contactPage = new ContactPage(driver);
    }
//    @AfterTest(alwaysRun = true)
//    public void closeDriver() {
//        driver.quit();
//    }

}
