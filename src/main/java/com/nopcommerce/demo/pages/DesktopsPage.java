package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement desktopsText;

    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement sortBy;

    @CacheLookup
    @FindBy(xpath = "//select[@id='products-pagesize']")
    WebElement display;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='List']")
    WebElement productList;

    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputer;

    public String verifyTextDesktops() {
        return getTextFromElement(productList);
    }

    public void selectOptionsFromSortBy(String sortby) {
        selectByVisibleTextFromDropDown(sortBy, sortby);
    }

    public void selectOptionsFromDisplayBy(String displayby) {
        selectByVisibleTextFromDropDown(display, displayby);
    }

    public void clickOnProductListView() {
        clickOnElement(productList);
    }
    public void clickOnBuildYourOwnComputer() {
        clickOnElement(buildYourOwnComputer);
    }

}
