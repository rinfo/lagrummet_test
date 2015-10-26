package test.base;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.support.PageFactory;
import pages.AdminPage;
import test.category.BaseCategory;
import test.category.PageCategory;

import static org.junit.Assert.assertEquals;
import static setup.SeleniumDriver.getDriver;

@Category({BaseCategory.class, PageCategory.class})
public class AdminTest {

    private AdminPage adminPage;

    public AdminTest() {
        adminPage = new AdminPage().openPage(AdminPage.class);
    }

    @Test
    public void adminPage() {
        PageFactory.initElements(getDriver(), AdminPage.class);
        assertEquals(true, adminPage.isAt());
    }

}
