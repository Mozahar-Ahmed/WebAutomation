package loginPageTest;

import loginPage.Search;
import org.testng.annotations.Test;

public class SearchTest extends Search {

    LoginTest loginTest=new LoginTest();

    @Test
    public void validateSearchBarWorks(){
        loginTest.login();
        clickOnSearchBar();
        typeOnSearchBar("Narendra Modi");
        //testDropDown();
    }

}
