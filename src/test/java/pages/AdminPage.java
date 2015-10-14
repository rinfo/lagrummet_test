package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import setup.SeleniumDriver;

import static setup.SeleniumDriver.getDriver;

public class AdminPage extends BasePage<AdminPage> {

    @FindBy(id = "username")
    WebElement usernameField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "submit")
    WebElement loginField;

    @Override
    public boolean isAt() {
        return SeleniumDriver.isDisplayed(getDriver().findElement(By.xpath("//div[@id='content']/article/h1[contains(text(), 'Please Login')]")))
                        && SeleniumDriver.isDisplayed(usernameField)
                        && SeleniumDriver.isDisplayed(passwordField)
                        && SeleniumDriver.isDisplayed(loginField);
    }

    @Override
    public String getUrl() {
        return "/admin";
    }

}
