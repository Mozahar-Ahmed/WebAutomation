package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Footer extends CommonAPI {

    @FindBy(linkText = "ABOUT US")
    public static WebElement aboutUs;
    @FindBy(xpath = "//h2[text()='About']")
    public static WebElement aboutUsValue;

    @FindBy(linkText = "SUPPORT")
    public static WebElement support;
    @FindBy(linkText = "Help Center")
    public static WebElement supportValue;

    @FindBy(xpath= "//a[contains(text(),'Press')]")
    public static WebElement press;
    @FindBy(xpath = "/html/body/main[@class='main']//span[@class='press']")
    public static WebElement pressValue;

    @FindBy(linkText = "API")
    public static WebElement api;
    @FindBy(xpath = "//h1[contains(text(),'Hello Developers.')]")
    public static WebElement apiValue;

    @FindBy(linkText = "JOBS")
    public static WebElement jobs;
    @FindBy(xpath = "//body/div//section[@role='main']//p[1]")
    public static WebElement jobsValue;

    @FindBy(linkText = "PRIVACY")
    public static WebElement privacy;
    @FindBy(linkText = "Privacy and Safety Center")
    public static WebElement privacyValue;

    @FindBy(linkText = "TERMS")
    public static WebElement terms;
    @FindBy(xpath = "//h2[@class='_2s4h']")
    public static WebElement termsValue;

    @FindBy(linkText = "DIRECTORY")
    public static WebElement directory;
    @FindBy(xpath = "//a[contains(text(),'Directory')]")
    public static WebElement directoryValue;

    @FindBy(linkText = "PROFILES")
   public static WebElement profiles;
    @FindBy(xpath = "//div[@class='_13F5E']")
    public static WebElement profilesValue;

    public void validateAboutUsDisplayed() {
        System.out.println(aboutUs.isDisplayed());
        Assert.assertEquals(aboutUs.isDisplayed(), true);
    }

    public void validateAboutUsClickable() {
        aboutUs.click();
        Assert.assertEquals(aboutUsValue.isDisplayed(), true);
    }

    public void supportDisplayed() {
        System.out.println(support.isDisplayed());
        Assert.assertEquals(support.isDisplayed(), true);
    }

    public void validateSupportClickable() {
        support.click();
        Assert.assertEquals(supportValue.isDisplayed(), true);
    }

    public void validatePressDisplayed() {
        System.out.println(press.isDisplayed());
        Assert.assertEquals(press.isDisplayed(), true);
    }

    public void validatePressClickable() {
        press.click();
        Assert.assertEquals(press.isDisplayed(), true);
    }

    public void validateAPIDisplayed() {
        System.out.println(api.isDisplayed());
        Assert.assertEquals(api.isDisplayed(), true);
    }

    public void validateAPIClickable() {
        api.click();
        Assert.assertEquals(apiValue.isDisplayed(), true);
    }

    public void validateJobsDisplayed() {
        System.out.println(jobs.isDisplayed());
        Assert.assertEquals(jobs.isDisplayed(), true);
    }

    public void validateJobsClickable() {
        jobs.click();
        Assert.assertEquals(jobsValue.isDisplayed(), true);
    }

    public void validatePrivacyDisplayed() {
        System.out.println(privacy.isDisplayed());
        Assert.assertEquals(privacy.isDisplayed(), true);
    }

    public void validatePrivacyClickable() {
        privacy.click();
        Assert.assertEquals(privacyValue.isDisplayed(), true);
    }

    public void validateTermsDisplayed(){
        System.out.println(terms.isDisplayed());
        Assert.assertEquals(terms.isDisplayed(),true);
    }
    public void validateTermsClickable(){
        terms.click();
        Assert.assertEquals(termsValue.isDisplayed(),true);
    }

    public void validateDirectoryDisplayed(){
        System.out.println(directory.isDisplayed());
        Assert.assertEquals(directory.isDisplayed(),true);
    }
    public void validateDirectoryClickable(){
        directory.click();
        Assert.assertEquals(directory.isDisplayed(),true);
    }
    public void validateProfilesDisplayed(){
        System.out.println(profiles.isDisplayed());
        Assert.assertEquals(profiles.isDisplayed(),true);
    }
    public void validateProfilesClickable(){
        profiles.click();
        Assert.assertEquals(profilesValue.isDisplayed(),true);
    }

}
