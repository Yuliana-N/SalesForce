package page;

import elements.DropDown;
import elements.TextInput;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends BasePage {
    private static final String URL = "https://ap16.lightning.force.com/lightning/o/Account/list";
    private static final By NEW_BUTTON = By.cssSelector("a[title = New]");
    private static final By SAVE_BUTTON = By.xpath("//div[contains(@class,'isModal')]//*[text()='Save']");

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AccountPage openPage() {
        driver.get(URL);
        return this;
    }

    @Override
    public BasePage isPageOpened() {
        return null;
    }

    public AccountPage clickNew() {
        driver.findElement(NEW_BUTTON).click();
        return this;
    }
    public AccountPage createAccount(){
        new DropDown("Type").selectValue(driver, "Reseller");
        new TextInput("Account Name").write(driver,"Name of account");
        new TextInput("Website").write(driver,"http://tut.by");
        new TextInput("Phone").write(driver,"+37526999999");
        new TextInput("Employees").write(driver,"23");
        new TextInput("Billing City").write(driver,"23");
        new TextInput("Billing State/Province").write(driver,"23");
        new TextInput("Billing Zip/Postal Code").write(driver,"23");
        new TextInput("Billing Country").write(driver,"23");
        new TextInput("Shipping City").write(driver,"23");
        new TextInput("Shipping State/Province").write(driver,"23");
        new TextInput("Shipping Zip/Postal Code").write(driver,"23");
        new TextInput("Shipping Country").write(driver,"23");
        return this;
    }
    public AccountPage clickSave() {
        driver.findElement(SAVE_BUTTON).click();
        return this;
    }

}
