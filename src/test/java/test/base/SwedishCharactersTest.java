package test.base;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import pages.SFSPage;
import pages.StartPage;
import test.category.BaseCategory;

import static org.junit.Assert.assertEquals;

@Category(BaseCategory.class)
public class SwedishCharactersTest {

    private StartPage startPage;

    public SwedishCharactersTest() {
        startPage = new StartPage().openPage(StartPage.class);
    }

    @Test
    public void swedishCharacterHeadingPresent() {
        SFSPage sfsPage = startPage.getSFSPage("1999:175/konsolidering/2011-05-02");

        assertEquals(true, sfsPage.isAt());
        assertEquals(true, sfsPage.headingPresent("Rättsinformationsförordning (1999:175)"));
    }
}
