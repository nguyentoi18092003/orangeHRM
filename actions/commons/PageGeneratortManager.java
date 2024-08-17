package commons;

import org.openqa.selenium.WebDriver;
import pageObject_28tech.HomePage28techObject;

public class PageGeneratortManager {
    public static HomePage28techObject gethomePage28tech(WebDriver driver){
        return new HomePage28techObject(driver);
    }
}
