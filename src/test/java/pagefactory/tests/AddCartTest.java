package pagefactory.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddCartTest extends BaseTest{

    private int QUANTITY = 3;
    private String KEYWORD = "Samsung";

@Test
    public void checkQuantity() {
    getHomePage().searchByKeyword(KEYWORD);
    getSearchPage().clickOnFirstByeButton();
    getCartPage().waitVisibilityOfElement(30, getCartPage().getCartPopup());
    for (int i = 0; i < QUANTITY-1; i++) {
        getCartPage().clickOnPlusButton();
    }
    Assert.assertEquals(getCartPage().getQuantity(),Integer.toString(QUANTITY));
}

@Test
    public void chekElementsInCart() {
    getHomePage().searchByKeyword(KEYWORD);
    getSearchPage().clickOnNumberOfButtons(QUANTITY);
    Assert.assertEquals(getCartPage().getQuantityOfGoogsInCart(),QUANTITY);

}
}
