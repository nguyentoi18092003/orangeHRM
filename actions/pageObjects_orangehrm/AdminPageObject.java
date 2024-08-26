package pageObjects_orangehrm;

import org.openqa.selenium.WebDriver;

public class AdminPageObject extends SubMenuPageObject {
    WebDriver driver;
    public AdminPageObject(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
}
