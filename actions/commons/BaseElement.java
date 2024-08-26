package commons;

import org.openqa.selenium.WebDriver;
import pageUIs_orangehrm.BaseElementUI;

public class BaseElement extends BasePage {
    WebDriver driver;

    public BaseElement(WebDriver driver) {
        this.driver = driver;
    }

    public void enterToTextboxByName(String valueToSendKey, String name) {
        waitForElementVisible(driver, BaseElementUI.DYNAMIC_TEXTBOX_BY_NAME, name);
        sendkeyToElement(driver, BaseElementUI.DYNAMIC_TEXTBOX_BY_NAME, valueToSendKey, name);
    }

    public void enterToTextboxByLabel(String valueToSendKey, String label) {
        waitForElementVisible(driver, BaseElementUI.DYNAMIC_TEXTBOX_BY_LABEL, label);
        sendkeyToElement(driver, BaseElementUI.DYNAMIC_TEXTBOX_BY_LABEL, valueToSendKey, label);
    }

    public void enterToCanlenderTextboxByLabel(String valueToSendKey, String label) {
        waitForElementVisible(driver, BaseElementUI.DYNAMIC_CANLENDER_TEXTBOX_BY_LABEL, label);
        sendkeyToElement(driver, BaseElementUI.DYNAMIC_CANLENDER_TEXTBOX_BY_LABEL, valueToSendKey, label);
    }

    public void selectToDropdownByLabel(String itemTextExpected, String label) {
        waitForElementClickable(driver, BaseElementUI.DYNAMIC_DROPDOWN_PARENT_BY_LABEL, label);
        selectItemDropdown(driver, BaseElementUI.DYNAMIC_DROPDOWN_PARENT_BY_LABEL, BaseElementUI.DYNAMIC_DROPDOWN_CHILDREN_ITEM_BY_LABEL, itemTextExpected, label);

    }

    public void waitForSpinnerIconInvisible() {
        waitForListElementInvisible(driver, BaseElementUI.SPINNER_ICON);
    }

    public String getValueInTextBoxByLabel(String label) {
        waitForElementVisible(driver, BaseElementUI.DYNAMIC_TEXTBOX_BY_LABEL, label);
        return getElementAttribute(driver, BaseElementUI.DYNAMIC_TEXTBOX_BY_LABEL, "_value", label);
    }

    public void clickToAddButtonByLabel(String label) {
        waitForElementClickable(driver, BaseElementUI.DYNAMIC_ADD_BUTTON, label);
        clickToElement(driver, BaseElementUI.DYNAMIC_ADD_BUTTON, label);
    }

    public void clickToSaveButtonByLabel(String label) {
        waitForElementClickable(driver, BaseElementUI.DYNAMIC_SAVE_BUTTON_BY_LABEL, label);
        clickToElement(driver, BaseElementUI.DYNAMIC_SAVE_BUTTON_BY_LABEL, label);
    }

    public boolean isSuccessMessageDisplayed(String messageContent) {
        waitForElementVisible(driver, BaseElementUI.DYNAMIC_SUCCESS_MESSAGE, messageContent);
        return isElementDisplayed(driver, BaseElementUI.DYNAMIC_SUCCESS_MESSAGE, messageContent);
    }

    public void enterToTextArea(String valueToSenKey) {
        waitForElementVisible(driver, BaseElementUI.TEXTAREA);
        sendkeyToElement(driver, BaseElementUI.TEXTAREA, valueToSenKey);

    }

    public String getValueInCanlenderTextBox(String label) {
        waitForElementVisible(driver, BaseElementUI.DYNAMIC_CANLENDER_TEXTBOX_BY_LABEL, label);
        return getElementAttribute(driver, BaseElementUI.DYNAMIC_CANLENDER_TEXTBOX_BY_LABEL, "value", label);
    }

    public String getValueInDropdownByLabel(String label) {
        waitForElementVisible(driver, BaseElementUI.DYNAMIC_VALUE_DROPDOWN_BY_LABEL, label);
        return getElementText(driver, BaseElementUI.DYNAMIC_VALUE_DROPDOWN_BY_LABEL, label);
    }

    public boolean isValueDisplayedAtColumnName(String columnName, String rowIndex, String rowValue) {
        int columnIndex = getListElementSize(driver, BaseElementUI.DYNAMIC_INDEX_BY_COLUMN_NAME, columnName) + 1;
        return isElementDisplayed(driver, BaseElementUI.DYNAMIC_ROW_VALUE_BY_COLUMN_INDEX_ROW_INDEX, rowIndex, String.valueOf(columnIndex), rowValue);
    }
}