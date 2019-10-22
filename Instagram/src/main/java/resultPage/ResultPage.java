package resultPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import report.TestLogger;

public class ResultPage extends CommonAPI {
    public void loginPageDisplayed(){
        WebElement element= getElement("//h1[contains(@class,'coreSpriteLoggedOutWordmark')]");
        Assert.assertEquals(element.isDisplayed(),true,"Login page is not displayed");
        TestLogger.log("Login page is displayed "+ element.isDisplayed());
    }

    public void popupPageDisplayed(){
        WebElement element= getElement("//*[contains(text(),'Turn On')]");
        Assert.assertEquals(element.isDisplayed(),true,"popup page is not displayed");
        TestLogger.log("popup page is displayed "+ element.isDisplayed());
    }
    public void turnOnButtonClickable(){
        clickOnElementByXpath("//*[contains(text(),'Turn On')]");
    }

    }//h1[contains(@class,'coreSpriteLoggedOutWordmark')]

////span[@id='react-root']/section/main[@role='main']//article[@class='agXmL']//h1[.='Instagram']