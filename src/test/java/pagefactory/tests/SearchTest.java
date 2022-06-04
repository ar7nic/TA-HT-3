package pagefactory.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest{

    private final String SEARCH_KEYWORD = "iPhone 11";
    private final String EXPECTED_SEARCH_QUERY = "query=iPhone";
    private final int EXPECTED_AMOUNT = 24;

    @Test
    private void checkSearchLink() {
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        Assert.assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_SEARCH_QUERY));
    }

    @Test
    private void checkAmountOfGoodsOnPage() {
        getHomePage().clickOnTvMenu();
        getTvAndAccesoryPage().clickOnTvLink();
        getTvPage().clickOnMore12Button();
        getTvPage().waitForLoadingMoreItems(30,getTvPage().getListOfGoodsOnPage());
        getTvPage().waitForPageLoadComplete(30);
        Assert.assertEquals(getTvPage().getAmountOfGoodsOnPage(),EXPECTED_AMOUNT);
    }



}
