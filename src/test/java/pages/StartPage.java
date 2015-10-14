package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.common.FooterPage;
import pages.common.HeaderPage;
import pages.common.MenuPage;

import static setup.SeleniumDriver.getDriver;

public class StartPage extends BasePage<StartPage> {

    private HeaderPage headerPage = PageFactory.initElements(getDriver(), HeaderPage.class);
    private FooterPage footerPage = PageFactory.initElements(getDriver(), FooterPage.class);
    private MenuPage menuPage = PageFactory.initElements(getDriver(), MenuPage.class);

    @FindBy(id = "query")
    WebElement searchQueryField;

    @Override
    public boolean isAt() {
        return getDriver().getTitle().equalsIgnoreCase("lagrummet.se - startsida");
    }

    @Override
    public String getUrl() {
        return "";
    }

    public SFSPage getSFSPage(String url) {
        getDriver().get(BASE_URL + "/rinfo/publ/sfs/" + url);
        return new SFSPage();
    }

    public HeaderPage getHeaderPage() {
        return headerPage;
    }

    public FooterPage getFooterPage() {
        return footerPage;
    }

    public MenuPage getMenuPage() {
        return menuPage;
    }

    public void setSearchQuery(String query) {
        searchQueryField.sendKeys(query);
    }

    public String getSearchQuery() {
        return searchQueryField.getAttribute("value");
    }
}
