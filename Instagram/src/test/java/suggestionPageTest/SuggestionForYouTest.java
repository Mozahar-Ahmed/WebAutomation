package suggestionPageTest;

        import base.CommonAPI;
        import loginPage.Login;
        import org.openqa.selenium.support.PageFactory;
        import org.testng.annotations.Test;
        import suggestionPage.SuggestionForYou;

public class SuggestionForYouTest extends CommonAPI {
    Login login = new Login();

    @Test
    public void validateSuggestionPageDisplayed() {

        SuggestionForYou suggestionForYou = PageFactory.initElements(driver, SuggestionForYou.class);
        login.loginFunctionality();
        suggestionForYou.suggestionPageDisplayed();

    }
}
