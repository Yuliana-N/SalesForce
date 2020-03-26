package test;

import org.testng.annotations.Test;
import page.AccountPage;

public class LoginTest extends BaseTest{
    @Test
    public void login() {
       loginPage
               .openPage()
               .writeUserName("ooprt-hsg4@force.com")
               .writePassword("QWERTY123")
               .clickLogin();
    accountPage
               .openPage()
               .clickNew()
               .createAccount()
               .clickSave();

    }
}
