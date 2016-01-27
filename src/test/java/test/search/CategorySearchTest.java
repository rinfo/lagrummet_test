package test.search;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import pages.CategorizedSearchHelpPage;
import pages.SearchResultPage;
import test.category.SearchCategory;

import static org.junit.Assert.assertEquals;

@Category(SearchCategory.class)
public class CategorySearchTest {

    private SearchResultPage searchResultPage;

    public CategorySearchTest() {
        searchResultPage = new SearchResultPage().openPage(SearchResultPage.class);
    }

    @Test
    public void informationCategory() {
        searchResultPage.searchFor("hjälp");
        CategorizedSearchHelpPage categorizedSearchHelpPage = searchResultPage.clickOnInformationCategoryLink();

        assertEquals(true, categorizedSearchHelpPage.hitResultLabelPresent("På lagrummet.se"));

        assertEquals(true, categorizedSearchHelpPage.titlePresent("Myndigheters och kommuners ansvar"));
        assertEquals(true, categorizedSearchHelpPage.titlePresent("Så svarar vi på e-post"));
        assertEquals(true, categorizedSearchHelpPage.titlePresent("Det offentliga rättsinformationssystemet"));
        assertEquals(true, categorizedSearchHelpPage.titlePresent("Vanliga frågor"));
        assertEquals(true, categorizedSearchHelpPage.titlePresent("Ordlista A–Ö"));
    }

    @Test
    public void lawsAndRegulationsCategory() {
        searchResultPage.searchFor("flyghöna");
        CategorizedSearchHelpPage categorizedSearchHelpPage = searchResultPage.clickOnLawsAndRegulationsCategoryLink();

        assertEquals(true, categorizedSearchHelpPage.hitResultLabelPresent("Lagar och förordningar (SFS)"));

        assertEquals(true, categorizedSearchHelpPage.titlePresent("Artskyddsförordning (1998:179)"));
        assertEquals(true, categorizedSearchHelpPage.tableTitlePresent("SFS-nummer"));
    }

    @Test
    public void courtCaseCategory() {
        searchResultPage.searchFor("djurpark");
        CategorizedSearchHelpPage categorizedSearchHelpPage = searchResultPage.clickOnCourtCaseCategoryLink();

        assertEquals(true, categorizedSearchHelpPage.hitResultLabelPresent("Vägledande domar"));

        assertEquals(true, categorizedSearchHelpPage.titlePresent("MÖD 2007:27"));
        assertEquals(true, categorizedSearchHelpPage.tableTitlePresent("Referat/Dom"));
    }
}
