package org.example.pages;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.example.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class Homepage extends Utility {

    private static final Logger log = LogManager.getLogger(Homepage.class.getName());

    public Homepage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//a[@id='hs-eu-confirmation-button']")
    WebElement accept;
    @CacheLookup
    @FindBy(xpath = "//*[@id=\"menu\"]/ul/li[5]/a")
    WebElement contactus;
    @CacheLookup
    @FindBy(xpath = "//input[@id='lastname-3dd4eca2-695f-4758-aed5-b46ebb1efe12_960']")
    WebElement lastname;
    @CacheLookup
    @FindBy(xpath = "//input[@id='company-3dd4eca2-695f-4758-aed5-b46ebb1efe12_960']")
    WebElement companyName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='jobtitle-3dd4eca2-695f-4758-aed5-b46ebb1efe12_960']")
    WebElement jobTittle;
    @CacheLookup
    @FindBy(xpath = "//input[@id='phone-3dd4eca2-695f-4758-aed5-b46ebb1efe12_960']")
    WebElement phoneNo;
    @CacheLookup
    @FindBy(xpath = "//input[@id='email-3dd4eca2-695f-4758-aed5-b46ebb1efe12_960']")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//select[@id='numemployees-3dd4eca2-695f-4758-aed5-b46ebb1efe12_960']")
    WebElement Employees;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='inputs-list']/li/label/input")
    WebElement clickBox;

    @CacheLookup
    @FindBy(xpath = "//div[@class='actions']/input[1]")
    WebElement submit;
    @CacheLookup
    @FindBy(xpath = "//div[@id='hs_form_target_form_495117269']/div")
    WebElement verifyMessage;

    public void clickOnAccept() {
        clickOnElement(accept);
        log.info("Accept cookies" + accept.toString());
    }

    public void job() {
        sendTextToElement(jobTittle, "Automation Tester");
        log.info("Enter Job Title in text field" + jobTittle.toString());
    }

    public void clickOnContact() {
        clickOnElement(contactus);
        log.info("Enter contact details in text field" + contactus.toString());
    }

    public void enterLastname(String Lastname) {
        sendTextToElement(lastname, Lastname);
        log.info("Enter last name in text field" + lastname.toString());
    }

    public void companyName(String CompanyName) {
        sendTextToElement(companyName, CompanyName);
        log.info("Enter company name in text field" + companyName.toString());
    }

    public void jobTittle(String JobTittle) {
        sendTextToElement(jobTittle, JobTittle);
        log.info("Enter jobTittle in text field" + jobTittle.toString());
    }

    public void enterPhoneNo(String PhoneNo) {
        sendTextToElement(phoneNo, PhoneNo);
        log.info("Enter phoneNo in text field" + phoneNo.toString());
    }

    public void enterEmail(String Email) {
        sendTextToElement(email, Email);
        log.info("Enter Email  in text field" + email.toString());
    }

    public void selectEmployees() {
        selectByValueFromDropDown(Employees, "5-25");
        log.info("Enter Employees  in text field" + Employees.toString());
    }

    public void clickOnCheckBox() {

        mouseHoverToElementAndClick(clickBox);
    }

    public void clickOnSubmitButton() {
        mouseHoverToElementAndClick(submit);
    }

    public String verifyTextMessage() {
        return(getTextFromElement(verifyMessage));
    }

}