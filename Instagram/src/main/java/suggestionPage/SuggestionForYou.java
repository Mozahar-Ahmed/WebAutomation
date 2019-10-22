package suggestionPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SuggestionForYou extends CommonAPI {
    @FindBy(xpath = "//div[contains(text(),'michelleobama')]")
    public static WebElement michelleobama;
    @FindBy(xpath = "//h1[contains(text(),'michelleobama')]")
    public static WebElement michelleobamaPage;

    public void suggestionPageDisplayed(){
        System.out.println(michelleobama.isDisplayed());
        Assert.assertEquals(michelleobama.isDisplayed(),true);
    }
    public void michelleobamaIsClickable(){
        michelleobama.click();
        Assert.assertEquals(michelleobamaPage.isDisplayed(),true);
    }
}
