package pages;

import org.openqa.selenium.By;
import setup.SeleniumDriver;

import static setup.SeleniumDriver.getDriver;

public class SFSPage extends BasePage<SFSPage> {

    @Override
    public boolean isAt() {
        return SeleniumDriver.isDisplayed(getDriver().findElement(By.xpath("//h3[contains(text(), 'Grundförfattning som ändras')]")));
    }

    @Override
    public String getUrl() {
        return "";
    }

    public boolean headingPresent( String heading) {
       return SeleniumDriver.isDisplayed(getDriver().findElement(By.xpath(String.format("//article[@id='rinfo']/h1[contains(text(), '%s')]", heading))));
    }

}
