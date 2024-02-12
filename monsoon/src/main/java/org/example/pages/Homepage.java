package org.example.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Utility {
    private static final Logger log = LogManager.getLogger(Homepage.class.getName());
@CacheLookup
@FindBy(xpath="//div[@class=\"b-panel js-panel-content\"]/div/div[2]/span/a")
WebElement Register;
    @CacheLookup
    @FindBy(xpath = "//*[@id=\"js-page\"]/header/div[2]/section/div/div/div[5]/div/div[1]/div/a/span")
    WebElement signin;
    @CacheLookup
    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    WebElement accept;
    @CacheLookup
    @FindBy(xpath = "//*[@id=\"js-page\"]/header/div[2]/section/div/div/div[5]/div/div[1]/div/div/div/a")
    WebElement signup;
    @CacheLookup
    @FindBy(xpath = "//span[@id=\"dismissbutton2header1\"]")
    WebElement noThanks;
    @CacheLookup
    @FindBy(xpath = "//input[@id='dwfrm_login_email']")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//input[@id='dwfrm_login_password']")
    WebElement password;
    @CacheLookup
    @FindBy(xpath = "//button[@type=\"submit\" and @class='js-search-button b-panel__loop js-outline-control']")
    WebElement signingup;

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    public void clickonsignin() {
        clickOnElement(signin);

    }


    public void clickOnaccept() {
        clickOnElement(accept);
    }

    public void clickingsignup() {
        clickOnElement(signup);

    }

    public void clickOnNoThanks() {
        clickOnElement(noThanks);
    }

    public void signupdetails(String Email,String Password ) {
sendTextToElement(email,Email);
sendTextToElement(password,Password);
clickOnElement(signingup);
    }
    public  void clickOnRegister(){
      clickOnElement(Register);
    }

}