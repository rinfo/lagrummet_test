package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static setup.SeleniumDriver.getDriver;

public class CategorizedSearchHelpPage extends BasePage<CategorizedSearchHelpPage> {

    @FindBy(linkText = "Skriv ut")
    WebElement printLink;

    @FindBy(linkText = "Sökhjälp")
    WebElement searchHelpLink;


    @Override
    public boolean isAt() {
        return false;
    }

    @Override
    public String getUrl() {
        return null;
    }

    public boolean printLinkPresent() {
        return printLink.isDisplayed();
    }

    public boolean searchHelpLinkPresent() {
        return searchHelpLink.isDisplayed();
    }

    public boolean titlePresent(String title) {
        WebElement element = getDriver().findElement(By.xpath(String.format("//table/tbody/tr/td/p/a[contains(text(), '%s')]", title)));
            return element.isDisplayed();
    }

    public boolean hitResultLabelPresent(String label) {
        WebElement element = getDriver().findElement(By.xpath(String.format("//article[@id='searchResults']/p/strong[contains(text(), '%s')]", label)));
        return element.isDisplayed();
    }

    public boolean tableTitlePresent(String title) {
        WebElement element = getDriver().findElement(By.xpath(String.format("//table/tbody/tr/th[contains(text(), '%s')]", title)));
        return element.isDisplayed();
    }
}
