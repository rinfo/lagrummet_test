package test.base;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import pages.ContactUsPage;
import pages.SiteMapPage;
import pages.StartPage;
import test.category.BaseCategory;
import test.category.PageCategory;

import static org.junit.Assert.assertEquals;

@Category({BaseCategory.class, PageCategory.class})
public class SiteMapTest {

    private StartPage startPage;

    public SiteMapTest() {
        startPage = new StartPage().openPage(StartPage.class);
    }

    @Test
    public void clickOnSiteMap() {
        SiteMapPage siteMapPage = startPage.getHeaderPage().clickOnSiteMapLink();

        assertEquals(true, siteMapPage.isAt());
    }
}
