package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SearchPage extends BasePage{
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "js_cart")
    private WebElement cart;

    @FindBy(xpath = "//a[@class='prod-cart__buy']")
    private List<WebElement> bueButtonsList;

    @FindBy(xpath = "//a[@data-fancybox-close]")
    private WebElement continueButton;

    public void clickContinueButton() {
        continueButton.click();
    }

    public void clickOnNumberOfButtons(int number) {
//        bueButtonsList = new ArrayList<>(bueButtonsList);
        for (int i = 0; i < number; i++) {
            bueButtonsList.get(i).click();
            waitVisibilityOfElement(30,cart);
            clickContinueButton();
        }

    }

    public List<WebElement> getBueButtonsList() {
        return bueButtonsList;
    }

    public void clickOnFirstByeButton() {
        bueButtonsList.get(0).click();
    }

}
