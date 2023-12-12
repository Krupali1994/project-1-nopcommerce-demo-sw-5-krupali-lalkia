package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu mobile']//a[normalize-space()='Desktops']")
    WebElement desktops;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu mobile']//a[normalize-space()='Notebooks']")
    WebElement notebooks;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu mobile']//a[normalize-space()='Software']")
    WebElement software;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Computers']")
    WebElement computersText;

    public void clickOnDesktops() {
        mouseHoverToElementAndClick(desktops);
    }

    public void clickOnNotebooks() {
        clickOnElement(notebooks);
    }

    public void clickOnSoftware() {
        clickOnElement(software);
    }

    public String verifyComputerText() {
        return getTextFromElement(computersText);
    }
}
