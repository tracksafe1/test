/* @Shikha
open https://www.ice.cam.ac.uk/
enter your name in search field
click on search button
And verify "search found 0 courses"
Click on "Rest all" link
Verify you have 18 courses available on page and print all of them*/
package org.example.pages;

import org.example.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Homepage1 extends Utility {
    @CacheLookup
    @FindBy(xpath = "//input[@id='edit-freetext']")
    WebElement searchtextbox;
    @CacheLookup
    @FindBy(xpath = "//*[@id=\"edit-submit\"]")
    WebElement search;
    @CacheLookup
    @FindBy(xpath="//div[@class=\"region region-content\"]/div[1]/div/div[3]/div/a")
    WebElement resetall;
    @CacheLookup
    @FindBy(xpath="//div[@class='region region-content']/div[1]/div/div[1]/div")
    WebElement verifySearchResult;


    @CacheLookup
    @FindBy(xpath = "//div[@class='view-content']/div/div/div")
    List<WebElement> courseListNew;

    public void enterCourse(){
        clickOnElement(searchtextbox);
        sendTextToElement(searchtextbox,"shikha");
    }
    public void clickSearch(){
        clickOnElement(search);
    }
    public void clickResetAll(){
        clickOnElement(resetall);
    }
    public String getResultText(){
        String message=getTextFromElement(verifySearchResult);
        return message;
    }
    public ArrayList print() {

        //List<WebElement> courses = courseList;
        ArrayList<String> coursesName = new ArrayList<>();

        for (WebElement e : courseListNew) {
            coursesName.add(e.getText());
        }

        System.out.println(coursesName);
        return coursesName;

    }

//    public Arraylist print(){
//      String text=  getTextFromElement(courseListNew);
//      return text;
//    }

    public  int courseCount() {
        print();

        System.out.println(courseListNew);
        return courseListNew.size();
    }
       }



