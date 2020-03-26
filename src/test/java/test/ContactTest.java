package test;

import org.testng.annotations.Test;

public class ContactTest extends BaseTest {
    @Test
    public void login() {
        loginPage
                .openPage()
                .writeUserName("ooprt-hsg4@force.com")
                .writePassword("QWERTY123")
                .clickLogin();
        contactPage
                .openPage()
                .clickNew()
                .createContact()
                .clickSave();


        //залогинится +
        //вкладка контактс+
        //нажать new+
        //заполнить поля
        //клик сэйв


    }
}
