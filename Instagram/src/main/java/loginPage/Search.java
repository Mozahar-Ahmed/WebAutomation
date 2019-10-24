package loginPage;

import base.CommonAPI;
import report.TestLogger;

public class Search extends CommonAPI {

    public void clickOnSearchBar() {
        clickOnElementByXpath("//input[@placeholder='Search']");
        TestLogger.log("Search bar is clicked");
    }

    public void typeOnSearchBar(String value) {
        typeOnElementByXpath("//input[@placeholder='Search']", value);

    }
}
