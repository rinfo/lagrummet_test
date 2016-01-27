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
    //see issue https://github.com/rinfo/lagrummet.se/issues/163
    public void consolidationNotDisplayed() {
        SFSPage sfsPage = startPage.getSFSPage("1999:175/konsolidering/2011-05-02");

        assertEquals(true, sfsPage.isAt());
        assertEquals(true, sfsPage.consolidationsEmpty());
    }

    @Test
    //see issue https://github.com/rinfo/lagrummet.se/issues/192
    public void preambelNotDisplayed() {
        SFSPage sfsPage = startPage.getSFSPage("1999:175/konsolidering/2011-05-02");

        assertEquals(true, sfsPage.isAt());
        assertEquals(true, sfsPage.preambleDisplayValueNone());
    }

}
