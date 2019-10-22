package loginPageTest;

import loginPage.Login;
import org.testng.annotations.Test;
import resultPage.ResultPage;

public class LoginTest extends Login {
    ResultPage resultPage= new ResultPage();

    @Test(enabled = false)
    public void validateSigninButtonInSignupPageWorks() {
        clickOnLoginButton();
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
    @Test(enabled = true)
    public void login() {
        clickOnLoginFromSignUp();
        resultPage.loginPageDisplayed();
        clickOnPhoneNumberUsernameOrEmailField();
        typeOnPhoneNumberUsernameOrEmailField("demouser95");
        clickOnPasswordField();
        typeOnPasswordField("abcd1234");
        clickOnLoginButton();
        sleepFor(80);
        resultPage.popupPageDisplayed();
        resultPage.turnOnButtonClickable();
    }
    @Test(enabled = false)
    public void loginTest() {
        loginFunctionalityTest();
    }

    @Test(enabled = false) //Negative test with no user name
    public void validateLoginFunctionalityWithoutUserName() {
        clickOnLoginFromSignUp();
        resultPage.loginPageDisplayed();
        clickOnPhoneNumberUsernameOrEmailField();
        typeOnPhoneNumberUsernameOrEmailField("");
        clickOnPasswordField();
        typeOnPasswordField("abcd1234");
        clickOnLoginButton();
    }
    @Test(enabled = false) //Negative test with invalid user name
    public void validateLoginFunctionalityWithInvalidUserName() {
        clickOnLoginFromSignUp();
        resultPage.loginPageDisplayed();
        clickOnPhoneNumberUsernameOrEmailField();
        typeOnPhoneNumberUsernameOrEmailField("xyzuser");
        clickOnPasswordField();
        typeOnPasswordField("abcd1234");
        clickOnLoginButton();
    }
    @Test(enabled = false)//Negative test with no password
    public void validateLoginFunctionalityWithoutPassword() {
        clickOnLoginFromSignUp();
        resultPage.loginPageDisplayed();
        clickOnPhoneNumberUsernameOrEmailField();
        typeOnPhoneNumberUsernameOrEmailField("demouser");
        clickOnPasswordField();
        typeOnPasswordField("");
        clickOnLoginButton();
    }
    @Test(enabled = false)//Negative test with invalid password
    public void validateLoginFunctionalityWithInvalidPassword() {
        clickOnLoginFromSignUp();
        resultPage.loginPageDisplayed();
        clickOnPhoneNumberUsernameOrEmailField();
        typeOnPhoneNumberUsernameOrEmailField("demouser");
        clickOnPasswordField();
        typeOnPasswordField("Kue64xhfd2541");
        clickOnLoginButton();
    }

    @Test(enabled = false)//Negative test without username and password
    public void validateLoginFunctionalityWithoutUserNameAndPassword() {
        clickOnLoginFromSignUp();
        resultPage.loginPageDisplayed();
        clickOnPhoneNumberUsernameOrEmailField();
        typeOnPhoneNumberUsernameOrEmailField("");
        clickOnPasswordField();
        typeOnPasswordField("");
        clickOnLoginButton();

    }
    @Test(enabled = false)//Negative test with invalid user name and password
    public void validateLoginFunctionalityWitInvalidUserNameAndPassword() {
        clickOnLoginFromSignUp();
        resultPage.loginPageDisplayed();
        clickOnPhoneNumberUsernameOrEmailField();
        typeOnPhoneNumberUsernameOrEmailField("nfvbjfern");
        clickOnPasswordField();
        typeOnPasswordField("Dlmgltg3463215");
        clickOnLoginButton();
    }
}