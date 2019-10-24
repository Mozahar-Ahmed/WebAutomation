package loginPageTest;

import loginPage.Login;
import org.testng.annotations.Test;
import resultPage.ResultPage;

public class LoginTest extends Login {
    ResultPage resultPage = new ResultPage();

    @Test(enabled = false)
    public void validateSigninButtonInSignupPageWorks() {
        clickOnLoginFromSignUp();
    }

    @Test(enabled = false)
    public void validateUserNameFieldWorksWithUserName() {
        clickOnPhoneNumberUsernameOrEmailField();
        typeOnPhoneNumberUsernameOrEmailField("demouser95");
    }

    @Test(enabled = false)
    public void validateUserNameFieldWorksWithPhoneNumber() {
        clickOnPhoneNumberUsernameOrEmailField();
        typeOnPhoneNumberUsernameOrEmailField("3135235647");
    }

    @Test(enabled = false)
    public void validateUserNameFieldWorksWithEmail() {
        clickOnPhoneNumberUsernameOrEmailField();
        typeOnPhoneNumberUsernameOrEmailField("mozahar33@yahoo.com");
    }

    @Test(enabled = false)
    public void ValidatePasswordFieldWorks() {
        clickOnPasswordField();
        typeOnPasswordField("abcd1234");
    }

    @Test(enabled = false)
    public void validateLoginButtonWorks() {
        clickOnLoginButton();
    }

    @Test
    public void loginFunction() {
        loginFunctionality();
    }

    @Test(enabled = true)
    public void login() {
        clickOnLoginFromSignUp();
        resultPage.loginPageDisplayed();
        clickOnPhoneNumberUsernameOrEmailField();
        typeOnPhoneNumberUsernameOrEmailField("demouser95");
        clickOnPasswordField();
        typeOnPasswordField("abcd1234");
        clickOnLoginButton();
    }


}