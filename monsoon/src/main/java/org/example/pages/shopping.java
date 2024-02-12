package org.example.pages;

import org.example.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class shopping extends Utility {
    @CacheLookup
    @FindBy(xpath = "//*[@id=\"js-page\"]/header/div[2]/section/div/div/div[3]/nav/ul/li[3]/a")
    WebElement women;
    @CacheLookup
    @FindBy(xpath="//*[@id=\"maincontent\"]/div/div[2]/div/div/div[2]/div/div[2]/a[1]")
    WebElement dressesandJumpsuits;
    public void clickOnWomen() {
        clickOnElement(women);
    }
    public void clickOndressesandjumpsuit(){
        clickOnElement(dressesandJumpsuits);
    }
}
