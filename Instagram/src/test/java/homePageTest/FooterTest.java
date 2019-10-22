package homePageTest;

import base.CommonAPI;
import homepage.Footer;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FooterTest extends CommonAPI {
Footer footer;
@BeforeMethod
public void setPageFactoryOfFooterTest(){
    footer = PageFactory.initElements(driver, Footer.class);
}
    @Test(enabled = true)
    public void aboutUsButtonTest() {
        footer.validateAboutUsDisplayed();
        footer.validateAboutUsClickable();
    }

    @Test(enabled = true)
    public void supportButtonTest() {
        footer.supportDisplayed();
        footer.validateSupportClickable();
    }

    @Test(enabled = false)
    public void pressButtonTest() {
        footer.validatePressDisplayed();
        footer.validatePressClickable();
    }

    @Test(enabled = false)
    public void apiButtonTest() {
        footer.validateAPIDisplayed();
        footer.validateAPIClickable();
    }

    @Test(enabled = false)
    public void jobsButtonTest() {
        footer.validateJobsDisplayed();
        footer.validateJobsClickable();
    }

    @Test(enabled = false)
    public void privacyButtonTest() {
        footer.validatePrivacyDisplayed();
        footer.validatePrivacyClickable();
    }

    @Test(enabled = false)
    public void termsButtonTest() {
        footer.validateTermsDisplayed();
        footer.validateTermsClickable();
    }

    @Test(enabled = false)
    public void profilesButtonTest() {
        footer.validateDirectoryDisplayed();
        footer.validateDirectoryClickable();
    }

    @Test(enabled = false)
    public void directoryButtonTest() {
        footer.validateProfilesDisplayed();
        footer.validateProfilesClickable();
    }

}
