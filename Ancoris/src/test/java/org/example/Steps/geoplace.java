package org.example.Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.example.pages.GeoplaceHomepage;
import org.testng.Assert;

public class geoplace {
    @Given("^user is on Homepage of geoplace$")
    public void userIsOnHomepageOfGeoplace() {
    }

    @And("^clicks on accept$")
    public void clicksOnAccept() {
        new GeoplaceHomepage().clickOnAccept();
    }

    @And("^clicks on local Authority Resources$")
    public void clicksOnLocalAuthorityResources() {
        new GeoplaceHomepage() .clickOnLocalAuthority();
    }

    @And("^click on Data creation manuals$")
    public void clickOnDataCreationManuals() {
        new GeoplaceHomepage().clickOnDataCreationManual();
    }

    @Then("^verify text \"([^\"]*)\"$")
    public void verifyText(String expected)  {

        Assert.assertEquals(new GeoplaceHomepage().verifyTextMessage(),expected,"pass");
    }

    @Then("^print the name of (\\d+) items present on page$")
    public void printTheNameOfItemsPresentOnPage(int a) {
        System.out.println("Total no of items on page   =     "+ new GeoplaceHomepage().size());
        new GeoplaceHomepage().print();


    }
}
