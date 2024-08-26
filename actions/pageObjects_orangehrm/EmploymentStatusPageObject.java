package pageObjects_orangehrm;

import org.openqa.selenium.WebDriver;

public class EmploymentStatusPageObject extends SubMenuPageObject {
    WebDriver driver;
    public EmploymentStatusPageObject (WebDriver driver){
        super(driver);
        this.driver=driver;
    }
}
