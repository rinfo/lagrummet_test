package test.base;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.support.PageFactory;
import pages.CategorizedSearchHelpPage;
import pages.SearchHelpPage;
import pages.SearchResultPage;
import test.category.BaseCategory;
import test.category.PageCategory;

import static org.junit.Assert.assertEquals;
import static setup.SeleniumDriver.getDriver;

@Category({BaseCategory.class, PageCategory.class})
public class SearchHelpTest {

    private SearchResultPage searchResultPage;

    public SearchHelpTest() {
        searchResultPage = PageFactory.initElements(getDriver(), SearchResultPage.class);
    }

    @Test
    public void searchHelpLinkPresent() {
        //searchResultPage.searchFor("flyghöna");
        //CategorizedSearchHelpPage categorizedSearchHelpPage = searchResultPage.clickOnLawsAndRegulationsCategoryLink();

        //SearchHelpPage searchHelpPage = categorizedSearchHelpPage.clickOnSearchHelpLink();
        //assertEquals(true, searchHelpPage.isAt());
    }
}
