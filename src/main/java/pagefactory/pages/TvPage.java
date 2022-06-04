package pagefactory.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class TvPage extends BasePage{

    @FindBy(xpath = "//a[@class='btn-see-more js_show_more']")
    private WebElement moreTwelweButton;

    @FindBy(xpath = "//div[@class='prod-cart height']")
    private List<WebElement> listOfGoods;

    public TvPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnMore12Button(){
        moreTwelweButton.click();
    }

    public List<WebElement> getListOfGoodsOnPage() {
        return listOfGoods;
    }

    public int getAmountOfGoodsOnPage() {
       return listOfGoods.size();
    }

    public void waitForLoadingMoreItems(long timeToWait, List<WebElement> list) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeToWait));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//div[@class='prod-cart height']"),24));
    }

}
