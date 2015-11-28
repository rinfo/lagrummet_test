package test.suite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.category.BaseCategory;
import test.category.SearchCategory;
import test.search.ExactHitsTest;
import test.search.SearchHitsTest;
import org.openqa.selenium.WebDriver;

import static setup.SeleniumDriver.getDriver;

@RunWith(Categories.class)
@Categories.IncludeCategory(SearchCategory.class)
@Suite.SuiteClasses( { AllTests.class })
public class SearchTestSuite {

    @BeforeClass
    public static void setUp() {
    }

    @AfterClass
    public static void tearDown() {
        //getDriver().quit();
    }
}