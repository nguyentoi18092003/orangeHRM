package pageObjects_orangehrm;

import org.openqa.selenium.WebDriver;

public class EmergencyContactsPageObject extends EmployeeListMenuPageObject{
    WebDriver driver;

    public EmergencyContactsPageObject(WebDriver driver){
        super(driver);
        this.driver=driver;

    }
}
