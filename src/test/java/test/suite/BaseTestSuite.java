package test.suite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.experimental.categories.Categories;
import org.junit.extensions.cpsuite.ClasspathSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.base.*;
import test.category.BaseCategory;

import static setup.SeleniumDriver.getDriver;

@RunWith(Categories.class)
@Categories.IncludeCategory(BaseCategory.class)
@Suite.SuiteClasses({AllTests.class})
public class BaseTestSuite {

    @BeforeClass
    public static void setUp() {
    }

    @AfterClass
    public static void tearDown() {
        //getDriver().quit();
    }
}
