package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DropdownMenu extends CommonAPI {
    public List<WebElement>getListFromLanguage(){
        return driver.findElements(By.xpath("//select[contains(@class,'hztqj')]"));
    }
}
