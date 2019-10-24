package loginPageTest;

import base.CommonAPI;
import loginPage.ForgotPassword;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends CommonAPI {
    ForgotPassword forgotPassword;

    @Test(enabled = false)
    public void loginButtonInSignupPageValidation() {
        forgotPassword = PageFactory.initElements(driver, ForgotPassword.class);
        forgotPassword.validateLoginButtonInSignupPageDisplayed();
        forgotPassword.validateLoginButtonInSignupPageClickable();

    }

    @Test(enabled = false)
    public void forgotPasswordButtonValidation() {
        forgotPassword = PageFactory.initElements(driver, ForgotPassword.class);
        forgotPassword.validateForgotPasswordButtonDisplayed();
        forgotPassword.validateForgotPasswordButtonClickable();
    }

    @Test
    public void forgetPasswordFunctionality() {
        forgotPassword = PageFactory.initElements(driver, ForgotPassword.class);
        forgotPassword.validateLoginButtonInSignupPageDisplayed();
        forgotPassword.validateLoginButtonInSignupPageClickable();
        forgotPassword.validateForgotPasswordButtonDisplayed();
        forgotPassword.validateForgotPasswordButtonClickable();
    }
}