package loginPage;

import base.CommonAPI;
import report.TestLogger;

public class Login extends CommonAPI {
    public void clickOnLoginFromSignUp() {
        clickOnElementByXpath("//a[contains(text(),'Log in')]");
        TestLogger.log("Log in button clicked");
    }

    public void clickOnPhoneNumberUsernameOrEmailField() {
        clickOnElementByXpath("//input[@name='username']");
        TestLogger.log("Username field is clicked");
    }

    public void typeOnPhoneNumberUsernameOrEmailField(String value) {
        typeOnElementByXpath("//input[@name='username']", value);
        TestLogger.log("Username/phone number/email is typed");
    }

    public void clickOnPasswordField() {
        clickOnElementByXpath("//input[@name='password']");
        TestLogger.log("Password field clicked");
    }

    public void typeOnPasswordField(String value) {
        typeOnElementByXpath("//input[@name='password']", value);
        TestLogger.log("Password typed on password field");
    }

    public void clickOnLoginButton() {
        clickOnElementByXpath("//body//div[4]");
        TestLogger.log("Clicked on login button");
    }

    public void loginFunctionalityTest() {
        clickOnElementByXpath("//a[contains(text(),'Log in')]");
        clickOnElementByXpath("//input[@name='username']");
        typeOnElementByXpath("//input[@name='username']", "demouser95");
        clickOnElementByXpath("//input[@name='password']");
        typeOnElementByXpath("//input[@name='password']", "3135235647");
        clickOnElementByXpath("//body//div[4]");
    }

}
