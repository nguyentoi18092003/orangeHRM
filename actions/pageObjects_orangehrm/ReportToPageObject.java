package pageObjects_orangehrm;

import org.openqa.selenium.WebDriver;

public class ReportToPageObject extends EmployeeListMenuPageObject{
    WebDriver driver;

    public ReportToPageObject(WebDriver driver){
        super(driver);
        this.driver=driver;

    }
}
