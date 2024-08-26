package pageObjects_orangehrm;

import org.openqa.selenium.WebDriver;

public class SalaryPageObject extends EmployeeListMenuPageObject{
    WebDriver driver;

    public SalaryPageObject(WebDriver driver){
        super(driver);
        this.driver=driver;

    }
}
