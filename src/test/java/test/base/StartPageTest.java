package test.base;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import pages.StartPage;
import test.category.BaseCategory;

import static org.junit.Assert.assertEquals;

@Category(BaseCategory.class)
public class StartPageTest {

    private StartPage startPage;

    public StartPageTest() {
        startPage = new StartPage().openPage(StartPage.class);
    }

    @Test
    public void startPage() {
        startPage.getMenuPage().clickOnLagrummetLinkButton();

        assertEquals(true, startPage.isAt());
    }

}
