package loginPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import report.TestLogger;

public class Search extends CommonAPI {

    public  void  clickOnSearchBar(){
        clickOnElementByXpath("//input[@placeholder='Search']");
        TestLogger.log("Search bar is clicked");
    }
    public  void typeOnSearchBar(String value){
        typeOnElementByXpath("//input[@placeholder='Search']", value);

    }
    public  void testDropDown(){
        WebElement element=getElement("//input[@placeholder='Search']");
        Select select=new Select(element);
        select.selectByIndex(0);
        sleepFor(3);
    }
}
