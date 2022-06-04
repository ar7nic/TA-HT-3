package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TvAndAccesory extends BasePage{
    public TvAndAccesory(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='brand-box__title']/a[contains(@href,'televizoryi')]")
    private WebElement tvLink;

    public void clickOnTvLink() {
        tvLink.click();
    }

}
