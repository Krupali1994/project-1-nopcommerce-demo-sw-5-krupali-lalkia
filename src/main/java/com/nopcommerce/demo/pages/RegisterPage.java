package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(id = "gender-female")
    WebElement genderFemale;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement registerText;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement dayOfBirth;

    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement dateOfBirthMonth;

    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement dateOfBirthYear;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(name = "register-button")
    WebElement registerButton;
    @CacheLookup
    @FindBy(id = "FirstName-error")
    WebElement textFirstNameIsRequired;
    @CacheLookup
    @FindBy(id = "LastName-error")
    WebElement textLastNameIsRequired;
    @CacheLookup
    @FindBy(id = "Email-error")
    WebElement textEmailIsRequired;
    @CacheLookup
    @FindBy(id = "Password-error")
    WebElement textPasswordIsRequired;
    @CacheLookup
    @FindBy(id = "ConfirmPassword-error")
    WebElement textConfirmPasswordIsRequired;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement textYourRegistrationCompleted;

    @CacheLookup
    @FindBy
    WebElement continueButton;

    public void selectGenderFemale() {
        mouseHoverToElementAndClick(genderFemale);
    }

    public void enterFirstName(String firstname) {
        sendTextToElement(firstNameField, firstname);
    }

    public void enterLastName(String lastname) {
        sendTextToElement(lastNameField, lastname);
    }

    public void selectDayOfBirth(String date) {
        selectByVisibleTextFromDropDown(dayOfBirth, date);
    }

    public void selectDateOfBirthMonth(String month) {
        selectByVisibleTextFromDropDown(dateOfBirthMonth, month);
    }

    public void selectDateOfBirthYear(String year) {
        selectByVisibleTextFromDropDown(dateOfBirthYear, year);
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        sendTextToElement(confirmPasswordField, confirmPassword);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
    }

    public String verifyRegisterText() {
        return getTextFromElement(registerText);
    }

    public String verifyTextRegistrationComplete() {
        return getTextFromElement(textYourRegistrationCompleted);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);

    }

    public String verifyTextFirstNameIsRequired() {
        return getTextFromElement(textFirstNameIsRequired);
    }

    public String verifyTextLastNameIsRequired() {
        return getTextFromElement(textLastNameIsRequired);
    }

    public String verifyTextEmailIsRequired() {
        return getTextFromElement(textEmailIsRequired);
    }

    public String verifyTextPasswordIsRequired() {
        return getTextFromElement(textPasswordIsRequired);
    }

    public String verifyTextConfirmPasswordIsRequired() {
        return getTextFromElement(textConfirmPasswordIsRequired);
    }

}
