package suggestionPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SuggestionForYou extends CommonAPI {
    @FindBy(xpath = "//h4[contains(@class,'')]")
    public static WebElement suggestionForYou;

    public void suggestionPageDisplayed() {
        System.out.println(suggestionForYou.isDisplayed());
        Assert.assertEquals(suggestionForYou.isDisplayed(), true);
    }
}
