package pageObjects_orangehrm;

import org.openqa.selenium.WebDriver;
import pageUIs_orangehrm.JobPageUI;

public class JobPageObject extends EmployeeListMenuPageObject{
    WebDriver driver;

    public JobPageObject(WebDriver driver){
        super(driver);
        this.driver=driver;

    }

    public void clickToContractDetailsButton() {
        waitForElementClickable(driver, JobPageUI.CONTRACT_DETAIL_BUTTON);
        clickToElement(driver,JobPageUI.CONTRACT_DETAIL_BUTTON);
    }
}
