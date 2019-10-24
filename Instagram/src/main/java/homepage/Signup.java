package homepage;

import base.CommonAPI;
import report.TestLogger;

public class Signup extends CommonAPI {
    public void clickOnMobileNumberOrEmailField() {
        clickOnElementByXpath("//input[@name='emailOrPhone']");
        TestLogger.log("Mobile Number or Email Field is clicked");

    }

    public void typeOnMobileNumberOrEmailField(String value) {
        typeOnElementByXpath("//input[@name='emailOrPhone']", value);
        TestLogger.log("Typed on Mobile Number or Email Field");

    }

    public void clickOnFullNameField() {
        clickOnElementByXpath("//input[@name='fullName']");
        TestLogger.log("Clicked on Full Name field");

    }

    public void typeOnFullNameField(String value) {
        typeOnElementByXpath("//input[@name='fullName']", value);
        TestLogger.log("Full name typed on Full Name field");

    }

    public void clickOnUsernameField() {
        clickOnElementByXpath("//input[@name='username']");
        TestLogger.log("Clicked on Username field");

    }

    public void typeOnUsernameField(String value) {
        typeOnElementByXpath("//input[@name='username']", value);
        TestLogger.log("Username typed on Username field");
    }

    public void clickOnPasswordField() {
        clickOnElementByXpath("//input[@name='password']");
        TestLogger.log("Clicked on Password field");

    }

    public void typeOnPassworField(String value) {
        typeOnElementByXpath("//input[@name='password']", value);
        TestLogger.log("Password typed on Password field");

    }

    public void clickOnPasswordShowButton() {
        clickOnElementByXpath("//button[contains(text(),'Show')]");
        TestLogger.log("Show button inside password field is clicked");

    }

    public void clickOnPsswordHideButton() {
        clickOnElementByXpath("//button[contains(text(),'Hide')]");
        TestLogger.log("Hide button inside password field clicked");

    }

    public void clickOnSignUpButton() {
        clickOnElementByXpath("//button[contains(text(),'Sign up')]");
        TestLogger.log("Clicked on Sign up button");

    }

    public void clickOnTurnOnButton() {
        clickOnElementByXpath("//*[@class='aOOlW  bIiDR' and @button='Turn On']");
        TestLogger.log("Clicked on turn on button");
    }

}

