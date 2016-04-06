package test.search;

import junit.framework.TestCase;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.SearchResultPage;
import test.category.SearchCategory;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;
import static setup.SeleniumDriver.getDriver;


@Category(SearchCategory.class)
public class SearchRegressionsTest {

    private SearchResultPage searchResultPage;

    public SearchRegressionsTest() {
        searchResultPage = PageFactory.initElements(getDriver(), SearchResultPage.class);
    }


    @Test
    public void correctSumOfCategoriesDisplayedAsTotalCount() {
        searchResultPage.searchFor("sameby");

        assertEquals(99, searchResultPage.getTotalHits());
        assertEquals(43, searchResultPage.getNumberOfCourtCasesHits());
        assertEquals(56, searchResultPage.getNumberOfLawsAndRegulationsHits());
    }

    @Test
    public void checkResultTextTruncation() {
        searchResultPage.searchFor("Lag (1944:219) om djurskydd");

        assertEquals(5, searchResultPage.getTotalHits());
        assertEquals(5, searchResultPage.getNumberOfLawsAndRegulationsHits());
        List<String> hits = searchResultPage.getLawsAndRegulationsHits();
        for(String s : hits) {
            TestCase.assertTrue("string i failed", s.length() < 100);
        }
    }
}

