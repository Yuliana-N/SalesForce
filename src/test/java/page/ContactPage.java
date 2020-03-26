package page;

import elements.DropDown;
import elements.Search;
import elements.TextInput;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage extends BasePage {
    private static final String URL = "https://ap16.lightning.force.com/lightning/o/Contact/list";
    private static final By NEW_BUTTON = By.cssSelector("a[title = New]");
    private static final By SAVE_BUTTON = By.xpath("//div[contains(@class,'isModal')]//*[text()='Save']");


    public ContactPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public ContactPage openPage() {
        driver.get(URL);
        return this;
    }

    @Override
    public BasePage isPageOpened() {
        return null;
    }

    public ContactPage clickNew() {
        driver.findElement(NEW_BUTTON).click();
        return this;
    }
    public ContactPage createContact(){
        new Search("Account Name").write(driver,"Second accounts");
        new DropDown("Salutation").selectValue(driver,"Mr.");

        new TextInput("First Name").write(driver,"Yli");
        new TextInput("Last Name").write(driver,"Nest");
        new TextInput("Phone").write(driver,"+37526999999");
        new TextInput("Mobile").write(driver,"+37526999999");
        new TextInput("Email").write(driver,"ooprt-hsg4@mailinator.com");


        return this;
    }
    public ContactPage clickSave() {
        driver.findElement(SAVE_BUTTON).click();
        return this;
    }





}
