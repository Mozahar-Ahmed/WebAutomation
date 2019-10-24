package homePageTest;

import homepage.Signup;
import org.testng.annotations.Test;

public class SignupTest extends Signup {


    @Test(enabled = false)
    public void validateFieldWithMobileNumberWorks() {
        clickOnMobileNumberOrEmailField();
        typeOnMobileNumberOrEmailField("3135235647");
    }

    @Test(enabled = false)
    public void validateFieldWithEmailWorks() {
        clickOnMobileNumberOrEmailField();
        typeOnMobileNumberOrEmailField("demouser95@gmail.com");
    }

    @Test(enabled = false)
    public void validateFullNameFieldWorks() {
        clickOnFullNameField();
        typeOnFullNameField("demo.user");
    }

    @Test(enabled = false)
    public void validateUserNameFieldWorks() {
        clickOnUsernameField();
        typeOnUsernameField("demouser95");
    }

    @Test(enabled = false)
    public void validatePasswordFieldWorks() {
        clickOnPasswordField();
        typeOnPassworField("abcd1234");
        clickOnPasswordShowButton();
        clickOnPsswordHideButton();
    }

    @Test(enabled = false)
    public void validateSignupButtonWorks() {
        clickOnSignUpButton();
    }

    @Test
    public void signupFunctionality() {
        clickOnMobileNumberOrEmailField();
        typeOnMobileNumberOrEmailField("3135235647");
        clickOnFullNameField();
        typeOnFullNameField("demo.user");
        clickOnUsernameField();
        typeOnUsernameField("demouser95");
        clickOnPasswordField();
        typeOnPassworField("abcd1234");
        clickOnPasswordShowButton();
        clickOnPsswordHideButton();
        clickOnSignUpButton();
    }
}
