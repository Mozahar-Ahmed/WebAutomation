package loginPageTest;

import base.CommonAPI;
import loginPage.ForgotPassword;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends CommonAPI {

    @Test
    public void forgetPasswordFunctionalityTest() {
        ForgotPassword forgotPassword = PageFactory.initElements(driver, ForgotPassword.class);
        forgotPassword.validateLoginButtonInSignupPageClickable();
        forgotPassword.validateLoginPageDisplayed();
        forgotPassword.validateForgotPasswordButtonClickable();
        forgotPassword.forgotPasswordValueDisplayed();


    }
}