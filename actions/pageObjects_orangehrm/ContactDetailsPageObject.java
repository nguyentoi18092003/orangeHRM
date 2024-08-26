package pageObjects_orangehrm;

import org.openqa.selenium.WebDriver;

public class ContactDetailsPageObject extends EmployeeListMenuPageObject {
    WebDriver driver;

    public ContactDetailsPageObject (WebDriver driver){
        super(driver);
        this.driver=driver;

    }
}
