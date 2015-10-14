package test.base;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import pages.SFSPage;
import pages.StartPage;
import test.category.SearchCategory;

import static org.junit.Assert.assertEquals;

@Category(SearchCategory.class)
public class ConsolidationTest {

    private StartPage startPage;

    public ConsolidationTest() {
        startPage = new StartPage().openPage(StartPage.class);
    }

    @Test
    public void consolidationNotDisplayed() {
        SFSPage sfsPage = startPage.getSFSPage("1999:175/konsolidering/2011-05-02");

        assertEquals(true, sfsPage.isAt());
        assertEquals(true, sfsPage.consolidationsEmpty());
    }

}
