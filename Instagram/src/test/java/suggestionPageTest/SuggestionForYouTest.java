package suggestionPageTest;

import loginPageTest.LoginTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import suggestionPage.SuggestionForYou;

public class SuggestionForYouTest extends SuggestionForYou {

    @Test
    public void validateSuggestionPageDisplayed(){
        SuggestionForYou suggestionForYou= PageFactory.initElements(driver, SuggestionForYou.class);
        LoginTest loginTest=new LoginTest();
        loginTest.loginTest();
        suggestionForYou.suggestionPageDisplayed();
        suggestionForYou.michelleobamaIsClickable();
    }
}
