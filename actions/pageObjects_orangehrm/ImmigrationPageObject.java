package pageObjects_orangehrm;

import org.openqa.selenium.WebDriver;

public class ImmigrationPageObject extends EmployeeListMenuPageObject{
    WebDriver driver;

    public ImmigrationPageObject(WebDriver driver){
        super(driver);
        this.driver=driver;

    }
}
