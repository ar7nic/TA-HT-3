package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage{
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "js_cart")
    private WebElement cart;

    @FindBy(xpath = "//a[@data-fancybox-close]")
    private WebElement continueButton;

    @FindBy(xpath = "//span[@class='js_plus btn-count btn-count--plus ']")
    private WebElement plusButton;

    @FindBy(xpath = "//input[@class='js-changeAmount count']")
    private WebElement inputValue;

    @FindBy(xpath = "//div[@class='cart-parent']//div[@class='item']")
    private List<WebElement> listOfGoodsInCart;

    public int getQuantityOfGoogsInCart() {
        return listOfGoodsInCart.size();
    }


    public void clickOnContinueButton() {
        continueButton.click();
    }

    public void clickOnPlusButton() {
        plusButton.click();
    }

    public String getQuantity() {
        return inputValue.getAttribute("value");
    }

    public WebElement getCartPopup() {
        return cart;
    }
}
