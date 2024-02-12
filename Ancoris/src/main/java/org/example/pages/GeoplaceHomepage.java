package org.example.pages;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.example.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;


public class GeoplaceHomepage extends Utility {

    private static final Logger log = LogManager.getLogger(GeoplaceHomepage.class.getName());

    public GeoplaceHomepage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//*[@id=\"ccc-notify\"]/div[2]/button[1]")
    WebElement accept;
    @CacheLookup
    @FindBy(xpath = "//*[@id=\"offcanvas-nav\"]/div[1]/div[2]/button[3]")
    WebElement localAuthorityAreas;
    @CacheLookup
    @FindBy(xpath = "//*[@id=\"offcanvas-nav\"]/div[4]/div[2]/div[1]/div/a[1]")
    WebElement DataCreationManual;
    @CacheLookup
    @FindBy(xpath="//div[@class=\"download-item\"]")
   List<WebElement>  itemsOnPage;
    @CacheLookup
    @FindBy(xpath = "//div[@class=\"hero-split\"]/div[2]/div/div/h1")
    WebElement verifyMessage;

    public void clickOnAccept() {
        clickOnElement(accept);
        log.info("Accept cookies" + accept.toString());
    }


    public void clickOnLocalAuthority() {
        clickOnElement(localAuthorityAreas);
        log.info("click local Authority Areas" + localAuthorityAreas.toString());
    }
    public void clickOnDataCreationManual() {

        clickOnElement(DataCreationManual);
        log.info("clicking DataCreationManual " + DataCreationManual.toString());
    }
    public ArrayList print() {
        ArrayList<String> keymanuals = new ArrayList<>();
        for (WebElement manual : itemsOnPage) {
            keymanuals.add(manual.getText());
            System.out.println(keymanuals);

        }
        return keymanuals;

    }
    public int size(){
      ArrayList<String >  Keymanuals1=new ArrayList<>();
      for(WebElement a:itemsOnPage){
          Keymanuals1.add(a.getText());
      }
      return Keymanuals1.size();
    }




    public String verifyTextMessage() {
        return(getTextFromElement(verifyMessage));

    }}

