package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FooterList extends CommonAPI {
    public List<WebElement>getElementListFromFooter(){
        return driver.findElements(By.xpath("DIRECTORY"));
    }
}
