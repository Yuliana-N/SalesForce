package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search {
    String label;
    String locator = "//div[contains(@class,'isModal')]//span[contains(text(),'%s')]/../..//input";

    public Search(String label){
        this.label = label;
    }
    public void write(WebDriver driver, String text){
        driver.findElement(By.xpath(String.format(locator, label))).sendKeys(text);
        driver.findElement(By.cssSelector(String.format("div[title='%s']",text))).click();

    }
}
