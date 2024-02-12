package org.example.Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.example.pages.Homepage;
import org.example.pages.Homepage1;
import org.example.pages.shopping;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import static org.example.driverfactory.ManageDriver.driver;

public class sigin {

    @Given("^i am on homepage$")
    public void iAmOnHomepage() {
    }


    @And("^i click on searchbutton$")
    public void iClickOnSearchbutton() {
        new Homepage1().enterCourse();
    }

    @And("^click on search$")
    public void clickOnSearch() {
        new Homepage1().clickSearch();
    }

    @And("^click on resetall$")
    public void clickOnResetall() {
        new Homepage1().clickResetAll();
    }


    @And("^i should land on coursesearchpage$")
    public void iShouldLandOnCoursesearchpage() {
        String expectedResult = "Search found 0 courses";
        String actualResult = new Homepage1().getResultText();
        Assert.assertEquals("Validating Welcome text", expectedResult, actualResult);
    }

    @Then("^I should see (\\d+) courses available on page$")
    public void iShouldSeeCoursesAvailableOnPage(int expectedCourseCount) {
//        new Homepage1();
        int actualCourseCount = new Homepage1().courseCount();
        Assert.assertEquals(actualCourseCount,expectedCourseCount);
    }
}
