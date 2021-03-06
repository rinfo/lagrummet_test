package test.base;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import pages.StartPage;
import test.category.BaseCategory;

import static org.junit.Assert.assertEquals;

@Category(BaseCategory.class)
public class MenuTest {

    private StartPage startPage;

    public MenuTest() {
        startPage = new StartPage().openPage(StartPage.class);
    }

    @Test
    public void menuElementsPresent() {
        assertEquals(true,startPage.getMenuPage().lawsAndRegulationsLinkPresent());
        assertEquals(true,startPage.getMenuPage().regulationsLinkPresent());
        assertEquals(true,startPage.getMenuPage().groundworksLinkPresent());
        assertEquals(true,startPage.getMenuPage().caseLawLinksPresent());
        assertEquals(true,startPage.getMenuPage().internationalMaterialLinkPresent());
        assertEquals(true,startPage.getMenuPage().allLegalSourcesLinkPresent());
        assertEquals(true,startPage.getMenuPage().responsibilitiesLinkPresent());
        assertEquals(true,startPage.getMenuPage().wordListLinkPresent());
        assertEquals(true,startPage.getMenuPage().rightProcessLinkPresent());
        assertEquals(true,startPage.getMenuPage().faqLinkPresent());
    }
}
