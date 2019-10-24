package homePageTest;

import homepage.DropdownMenu;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class DropdownMenuTest extends DropdownMenu {

    @Test
    public void testLanguageDropdownMenu(){
        List<WebElement>languageList=getListFromLanguage();
        System.out.println(languageList.size());
        for (int i=0;i<languageList.size();i++){
            System.out.println(languageList.get(i).getText());
        }
    }
}
