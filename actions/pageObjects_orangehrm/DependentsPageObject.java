package pageObjects_orangehrm;

import org.openqa.selenium.WebDriver;

public class DependentsPageObject extends EmployeeListMenuPageObject{
    WebDriver driver;

    public DependentsPageObject(WebDriver driver){
        super(driver);
        this.driver=driver;

    }
}
