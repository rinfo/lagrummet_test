package test.suite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.extensions.cpsuite.ClasspathSuite;
import org.junit.runner.RunWith;

import static setup.SeleniumDriver.getDriver;

@RunWith(ClasspathSuite.class)
public class AllTests {

    @BeforeClass
    public static void setUp() {
    }

    @AfterClass
    public static void tearDown() {
        getDriver().quit();
    }
}
