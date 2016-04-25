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

    @Test
    public void linkToConsolidatedDocumentDisplayed_sfs_1999_175() {
        SFSPage sfsPage = startPage.getSFSPage("1999:175/konsolidering/2011-05-02");

        assertEquals(true, sfsPage.isAt());
        assertEquals(true, sfsPage.consolidationsEmpty());
        assertEquals(true, sfsPage.linkToConsolidatedDocumentExists());

    }

    // Don't run this test until documents from early 1998 become available from external database again.
    //@Test
    public void ConsolidatedDocumentDisplayed_sfs_1998_150() {
        SFSPage sfsPage = startPage.getSFSPage("1998:150");
        assertEquals(true, sfsPage.isAt());
    }

    @Test
    public void linkToConsolidatedDocumentDisplayed_sfs_1998_150() {
        SFSPage sfsPage = startPage.getSFSPage("1998:150/konsolidering/2010-09-01");

        assertEquals(true, sfsPage.isAt());
        assertEquals(true, sfsPage.consolidationsEmpty());
        assertEquals(true, sfsPage.linkToConsolidatedDocumentExists());

    }
    
}
