package base;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;
import report.ExtentManager;
import report.ExtentTestManager;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CommonAPI {
    /**
     * create account in saucelabs and/or browserstack and take user name, key and url from there to run your test cases in
     * in cloud driver using any of these two environment
     */
    public static WebDriver driver;
    public static ExtentReports extent;
    public static String sauceUserName = "mozahar.ahmed";
    public static String sauceKey = "42902092-7840-417c-ab02-062a4ed1520d";
    public static String browserstackUserName = "mozaharahmed1";
    public static String browserstackKey = "eN6qwtszMHxsqYBGbruD";
    //http:// + username + : + sauce Key + specific url for cloud
    public static String SAUCE_URL = "http://" + sauceUserName + ":" + sauceKey + "@ondemand.saucelabs.com:80/wd/hub";
    //public static String SAUCE_URL="http://peoplentech1234:f8195613-4319-4b3a-8ebc-e02c512ee521@ondemond.saucelabs.com:80/wd/hub";
    public static String BROWSERSTACK_URL = "https://" + browserstackUserName + ":" + browserstackKey + "@hub-cloud.browserstack.com/wd/hub";

    /**
     * @param platform-           operating system-mac? or windows?
     * @param url-
     * @param browser-            chrome/firefox/IE?
     * @param cloud-remoteDriver  that we use to run test cases
     * @param browserVersion      -either chrome version 75/76/77 or firefox version
     * @param envName-environment name-either saucelabs or browserstack
     * @return -it will return either local driver or cloud driver that we fix in runner file
     * @throws MalformedURLException
     */
    @Parameters({"platform", "url", "browser", "cloud", "browserVersion", "envName"})
    @BeforeMethod
    public static WebDriver setupDriver(String platform, String url, String browser,
                                        boolean cloud, String browserVersion, String envName) throws MalformedURLException {
        if (cloud) {
            driver = getCloudDriver(browser, browserVersion, platform, envName);
        } else {
            driver = getLocalDriver(browser, platform);
        }
        driver.get(url);
        return driver;
    }

    /**
     * @param browser  chrome/gecko driver that is going to be used for testing
     * @param platform nothing but operating system(mac/windows) of your machine
     * @return it will return the webDriver object
     */

    public static WebDriver getLocalDriver(String browser, String platform) {

        //To disable the Chrome popup
        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.addArguments("Disable-infobars");

        if (platform.equalsIgnoreCase("windows") && browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "../Generic/src/main/resources/chromedriver.exe");
            driver = new ChromeDriver(chromeoptions);
        } else if (platform.equalsIgnoreCase("mac") && browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "../Generic/src/main/resources/chromedriver");
            driver = new ChromeDriver(chromeoptions);
        } else if (platform.equalsIgnoreCase("windows") && browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "../Generic/src/main/resources/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (platform.equalsIgnoreCase("mac") && browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "../Generic/src/main/resources/geckodriver");
            driver = new FirefoxDriver();
        }
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }

    /**
     * @param browser
     * @param browserVersion
     * @param platform
     * @param envName
     * @return
     * @throws MalformedURLException
     */

    public static WebDriver getCloudDriver(String browser, String browserVersion,
                                           String platform, String envName) throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("name", "Cloud Execution");
        desiredCapabilities.setCapability("browserName", browser);
        desiredCapabilities.setCapability("browser_version", browserVersion);
        desiredCapabilities.setCapability("os", platform);
        desiredCapabilities.setCapability("os_version", "Windows 10");

        if (envName.equalsIgnoreCase("saucelabs")) {
            desiredCapabilities.setCapability("resolution", "1600x1200");
            driver = new RemoteWebDriver(new URL(SAUCE_URL), desiredCapabilities);
        } else if (envName.equalsIgnoreCase("browserstack")) {
            desiredCapabilities.setCapability("resolution", "1024x768");
            driver = new RemoteWebDriver(new URL(BROWSERSTACK_URL), desiredCapabilities);
        }
        return driver;
    }

    //Screen shot

    /**
     * @param driver
     * @param screenshotName
     */
    public static void captureScreenshot(WebDriver driver, String screenshotName) {
        DateFormat dateFormat = new SimpleDateFormat("MM.dd.yyyy-HH.mm.ss");//in order to having a name of the screenshot we need this dateformat.
        Date date = new Date();
        String uniqueName = dateFormat.format(date);//this line is giving a name of the screenshot
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);//outputType is an interface
        //in this line File class is telling the the driver to store the screenshots into file object.
        try {
            FileUtils.copyFile(file, new File(System.getProperty("user.dir") + "/screenshots/" + screenshotName + uniqueName + ".png"));//user.dir>> we are providing the path where we want our folder
        } catch (IOException e) {
            //but that file is not a real file so in order to store the screenshots we need a physical file.That's why we need this FileUtil class.
            //and here we are copying the file to FileUtils.
            // every time we take a screenshot this will store in File class.
            e.printStackTrace();
        }
    }

    //common API
    // public static void captureScreenshot(String testcase name) {

    @AfterMethod
    public void cleanup() {
        driver.close();
        driver.quit();
    }

    //reporting starts
    public void sleepFor(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @BeforeSuite
    public void extentSetup(ITestContext context) {
        ExtentManager.setOutputDirectory(context);
        extent = ExtentManager.getInstance();
    }

    @BeforeMethod
    public void startExtent(Method method) {
        String className = method.getDeclaringClass().getSimpleName();
        ExtentTestManager.startTest(method.getName());
        ExtentTestManager.getTest().assignCategory(className);
    }

    protected String getStackTrace(Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        return sw.toString();
    }

    @AfterMethod
    public void afterEachTestMethod(ITestResult result) {
        ExtentTestManager.getTest().getTest().setStartedTime(getTime(result.getStartMillis()));
        ExtentTestManager.getTest().getTest().setEndedTime(getTime(result.getEndMillis()));
        for (String group : result.getMethod().getGroups()) {
            ExtentTestManager.getTest().assignCategory(group);
        }
        if (result.getStatus() == 1) {
            ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passed");
        } else if (result.getStatus() == 2) {
            ExtentTestManager.getTest().log(LogStatus.FAIL, getStackTrace(result.getThrowable()));
        } else if (result.getStatus() == 3) {
            ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
        }
        ExtentTestManager.endTest();
        extent.flush();
        if (result.getStatus() == ITestResult.FAILURE) {
            captureScreenshot(driver, result.getName());
        }
    }

    private Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }

    @AfterSuite
    public void generateReport() {
        extent.close();
    }
    //reporting ends

    //Common methods
    public void clickOnElementByXpath(String locator) {
        driver.findElement(By.xpath(locator)).click();
    }

    public void clickOnElementById(String locator) {
        driver.findElement(By.id(locator)).click();
    }

    public void clickOnElementByLinkTest(String locator) {
        driver.findElement(By.linkText(locator)).click();
    }

    public void typeOnElementByXpath(String locator, String value) {
        driver.findElement(By.xpath(locator)).sendKeys(value);
    }

    public void typeOnElementById(String locator, String value) {
        driver.findElement(By.id(locator)).sendKeys(value);
    }

    //for the understanding purpose
   /* public String getValueByXpath(String locator){
        String value = driver.findElement(By.xpath(locator)).getText();
        return value;
    }*/

    public String getValueByXpath(String locator) {
        return driver.findElement(By.xpath(locator)).getText();
    }

    public boolean isElementDisplayed(String locator) {
        return driver.findElement(By.xpath(locator)).isDisplayed();
    }

    public boolean isElementEnabled(String locator) {
        return driver.findElement(By.xpath(locator)).isEnabled();
    }

    public boolean isElementSelected(String locator) {
        return driver.findElement(By.xpath(locator)).isSelected();
    }

    /**
     * @param locator -xpath that we are trying to make webElement of
     * @return -webElement of the xpath
     */
    public WebElement getElement(String locator) {
        WebElement element = driver.findElement(By.xpath(locator));
        return element;
    }

    public WebElement getElementByLinkTest(String locator) {
        return driver.findElement(By.linkText(locator));

    }

    public void dragNdropByXpaths(String fromLocator, String toLocator) {
        Actions actions = new Actions(driver);
        WebElement from = getElement("");
        WebElement to = getElement("");
        actions.dragAndDrop(from, to).build().perform();
    }

    public void scrollIntoView(String locator) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", getElementByLinkTest(""));
    }


}