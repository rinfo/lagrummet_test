package test.suite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.category.PageCategory;

import static setup.SeleniumDriver.getDriver;

@RunWith(Categories.class)
@Categories.IncludeCategory(PageCategory.class)
@Suite.SuiteClasses({AllTests.class})
public class PageTestSuite {

    @BeforeClass
    public static void setUp() {
    }

    @AfterClass
    public static void tearDown() {
        //getDriver().quit();
    }
}