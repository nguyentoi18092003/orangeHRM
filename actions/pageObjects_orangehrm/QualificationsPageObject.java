package pageObjects_orangehrm;

import org.openqa.selenium.WebDriver;

public class QualificationsPageObject extends EmployeeListMenuPageObject{
    WebDriver driver;

    public QualificationsPageObject(WebDriver driver){
        super(driver);
        this.driver=driver;

    }
}
