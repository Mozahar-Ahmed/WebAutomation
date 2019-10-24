package loginPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ForgotPassword extends CommonAPI {

    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    public static WebElement loginButtonInSignupPage;
    @FindBy(xpath = "//h1[contains(@class,'coreSpriteLoggedOutWordmark')]")
    public static WebElement loginPageView;

    @FindBy(xpath = "//*[@method='post' and @href='/accounts/password/reset/']")
    public static WebElement forgotPasswordButton;
    @FindBy(xpath = "//span[contains(@class,'coreSpriteLockSmall')]")
    public static WebElement passwordRetrievePage;

    public void validateLoginButtonInSignupPageDisplayed() {
        System.out.println(loginButtonInSignupPage.isDisplayed());
        Assert.assertEquals(loginButtonInSignupPage.isDisplayed(), true);
    }

    public void validateLoginButtonInSignupPageClickable() {
        loginButtonInSignupPage.click();
        Assert.assertEquals(loginPageView.isDisplayed(), true);
    }

    public void validateForgotPasswordButtonDisplayed() {
        System.out.println(forgotPasswordButton.isDisplayed());
        Assert.assertEquals(forgotPasswordButton.isDisplayed(), true);
    }

    public void validateForgotPasswordButtonClickable() {
        forgotPasswordButton.click();
        Assert.assertEquals(passwordRetrievePage.isDisplayed(), true);
    }
}
