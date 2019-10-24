package loginPageTest;

import loginPage.Login;
import org.testng.annotations.Test;

public class NegativeTest extends Login {
    @Test(enabled = false) //Negative test with no user name
    public void validateLoginFunctionalityWithoutUserName() {
        clickOnLoginFromSignUp();
        clickOnPhoneNumberUsernameOrEmailField();
        typeOnPhoneNumberUsernameOrEmailField("");
        clickOnPasswordField();
        typeOnPasswordField("abcd1234");
        clickOnLoginButton();
    }

    @Test(enabled = false) //Negative test with invalid user name
    public void validateLoginFunctionalityWithInvalidUserName() {
        clickOnLoginFromSignUp();
        clickOnPhoneNumberUsernameOrEmailField();
        typeOnPhoneNumberUsernameOrEmailField("xyzuser");
        clickOnPasswordField();
        typeOnPasswordField("abcd1234");
        clickOnLoginButton();
    }

    @Test(enabled = false)//Negative test with no password
    public void validateLoginFunctionalityWithoutPassword() {
        clickOnLoginFromSignUp();
        clickOnPhoneNumberUsernameOrEmailField();
        typeOnPhoneNumberUsernameOrEmailField("demouser");
        clickOnPasswordField();
        typeOnPasswordField("");
        clickOnLoginButton();
    }

    @Test(enabled = false)//Negative test with invalid password
    public void validateLoginFunctionalityWithInvalidPassword() {
        clickOnLoginFromSignUp();
        clickOnPhoneNumberUsernameOrEmailField();
        typeOnPhoneNumberUsernameOrEmailField("demouser");
        clickOnPasswordField();
        typeOnPasswordField("Kue64xhfd2541");
        clickOnLoginButton();
    }

    @Test(enabled = false)//Negative test without username and password
    public void validateLoginFunctionalityWithoutUserNameAndPassword() {
        clickOnLoginFromSignUp();
        clickOnPhoneNumberUsernameOrEmailField();
        typeOnPhoneNumberUsernameOrEmailField("");
        clickOnPasswordField();
        typeOnPasswordField("");
        clickOnLoginButton();

    }

    @Test(enabled = false)//Negative test with invalid user name and password
    public void validateLoginFunctionalityWitInvalidUserNameAndPassword() {
        clickOnLoginFromSignUp();
        clickOnPhoneNumberUsernameOrEmailField();
        typeOnPhoneNumberUsernameOrEmailField("nfvbjfern");
        clickOnPasswordField();
        typeOnPasswordField("Dlmgltg3463215");
        clickOnLoginButton();
    }
}
