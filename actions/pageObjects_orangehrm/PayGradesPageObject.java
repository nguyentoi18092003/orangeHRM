package pageObjects_orangehrm;

import org.openqa.selenium.WebDriver;

public class PayGradesPageObject extends SubMenuPageObject {
    WebDriver driver;
    public PayGradesPageObject (WebDriver driver){
        super(driver);
        this.driver=driver;
    }
}
