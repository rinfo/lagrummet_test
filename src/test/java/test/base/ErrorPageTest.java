package test.base;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import pages.ErrorPage;
import test.category.BaseCategory;
import test.category.PageCategory;

import static org.junit.Assert.assertEquals;

@Category({BaseCategory.class, PageCategory.class})
public class ErrorPageTest {

    private ErrorPage errorPage;

    public ErrorPageTest() {
        errorPage = new ErrorPage().openPage(ErrorPage.class);
    }

    @Test
    public void errorPageDisplayed() {
        assertEquals(true, errorPage.isAt());
    }
}
