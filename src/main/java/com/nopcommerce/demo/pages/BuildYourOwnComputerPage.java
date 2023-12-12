package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BuildYourOwnComputerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Build your own computer']")
    WebElement textBuiltYourOwnComputer;

    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement processorLink;

    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement ramLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement hddRadioButton;

    @CacheLookup
    @FindBy(id = "product_attribute_4_9")
    WebElement osRadioButton;

    @CacheLookup
    @FindBy(id = "product_attribute_5_12")
    WebElement softwareCheckBoxes;

    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement textProductAddedToYourCart;

    public String verifyBuildYourOwnComputer() {
        return getTextFromElement(textBuiltYourOwnComputer);
    }

    public void selectProcessor(String processor) {
        selectByVisibleTextFromDropDown(processorLink, processor);
    }

    public void selectRAM(String ram) {
        selectByVisibleTextFromDropDown(ramLink, ram);
    }

    public void selectHDD(String hdd) {
        clickOnElement(hddRadioButton);
    }

    public void selectOS(String os) {
        clickOnElement(osRadioButton);
    }

    public void clickOnCheckBox3(String software) {
        clickOnElement(softwareCheckBoxes);
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }

    public String verifyTextProductAdded() {
        return getTextFromElement(textProductAddedToYourCart);

    }
}
