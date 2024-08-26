package pageObjects_orangehrm;

import org.openqa.selenium.WebDriver;
import pageUIs_orangehrm.PersonalDetailsPageUI;

public class PersonalDetailsPageObject extends EmployeeListMenuPageObject{
    WebDriver driver;

    public PersonalDetailsPageObject(WebDriver driver){
        super(driver);
        this.driver=driver;

    }


    public void clickToGenderRadio() {
        clickToElementByJS(driver, PersonalDetailsPageUI.GENDER_RADIO);
    }

    public void enterToDriverNumberTextbox(String numberDriver) {
        waitForElementVisible(driver,PersonalDetailsPageUI.DRIVER_NUMBER_TEXTBOX);
        sendkeyToElement(driver,PersonalDetailsPageUI.DRIVER_NUMBER_TEXTBOX,numberDriver);
    }



}
