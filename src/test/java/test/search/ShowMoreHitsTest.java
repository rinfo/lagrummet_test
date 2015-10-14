package test.search;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import pages.CategorizedSearchHelpPage;
import pages.SearchResultPage;
import test.category.SearchCategory;

import static org.junit.Assert.assertEquals;

@Category(SearchCategory.class)
public class ShowMoreHitsTest {

    private SearchResultPage searchResultPage;

    public ShowMoreHitsTest() {
        searchResultPage = new SearchResultPage().openPage(SearchResultPage.class);
    }

        @Test
    public void showMoreHitsLawsAndRegulationsCategory() {
        searchResultPage.searchFor("flyghöna");
        CategorizedSearchHelpPage categorizedSearchHelpPage = searchResultPage.clickOnShowMoreHitsCourtCaseCategoryLink();

        assertEquals(true, categorizedSearchHelpPage.printLinkPresent());
        assertEquals(true, categorizedSearchHelpPage.searchHelpLinkPresent());
        assertEquals(true, categorizedSearchHelpPage.hitResultLabelPresent("Lagar och förordningar (SFS)"));

        assertEquals(true, categorizedSearchHelpPage.titlePresent("Artskyddsförordning (1998:179)"));
        assertEquals(true, categorizedSearchHelpPage.tableTitlePresent("SFS-nummer"));
    }

    @Test
    public void showMoreHitsCourtCaseCategory() {
        searchResultPage.searchFor("djurpark");
        CategorizedSearchHelpPage categorizedSearchHelpPage = searchResultPage.clickOnShowMoreHitsCourtCaseCategoryLink();

        assertEquals(true, categorizedSearchHelpPage.printLinkPresent());
        assertEquals(true, categorizedSearchHelpPage.searchHelpLinkPresent());
        assertEquals(true, categorizedSearchHelpPage.hitResultLabelPresent("Vägledande domar"));

        assertEquals(true, categorizedSearchHelpPage.titlePresent("MÖD 2007:27"));
        assertEquals(true, categorizedSearchHelpPage.tableTitlePresent("Referat/Dom"));
    }

}
