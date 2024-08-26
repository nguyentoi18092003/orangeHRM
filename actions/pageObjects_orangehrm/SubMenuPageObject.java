package pageObjects_orangehrm;

import commons.BaseElement;
import org.openqa.selenium.WebDriver;
import pageUIs_orangehrm.SubMenuPageUI;

public class SubMenuPageObject extends SidebarPageObject{
    WebDriver driver;
    public SubMenuPageObject(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
    public void clickToItemSubMenuByName(String nameSubMenu,String nameItemOfSubmenu){
        waitForElementClickable(driver, SubMenuPageUI.DYNAMIC_ITEM_SUBMENU_BY_NAME,nameSubMenu,nameItemOfSubmenu);
        clickToElement(driver, SubMenuPageUI.DYNAMIC_ITEM_SUBMENU_BY_NAME,nameSubMenu,nameItemOfSubmenu);
    }
    public void clickToSubMenuByName(String nameSubMenu){
        waitForElementClickable(driver, SubMenuPageUI.DYNAMIC_SUBMENU_BY_NAME,nameSubMenu);
        clickToElement(driver, SubMenuPageUI.DYNAMIC_SUBMENU_BY_NAME,nameSubMenu);
    }
}
