package homePageTest;

import homePage.FooterList;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class FooterListTest extends FooterList {
    @Test
    public void listAllfooterElements(){
        List<WebElement>elementList=getElementListFromFooter();
        System.out.println(elementList.size());
        for (int i=0;i<elementList.size();i++){
            System.out.println(elementList.get(i).getText());
        }
    }
}
