package org.example.Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.example.pages.Homepage;
import org.testng.Assert;

public class step {
    @Given("^user is on Homepage$")
    public void userIsOnHomepage() {

    }

    @And("^click on Accept$")
    public void clickOnAccept() {
        new Homepage().clickOnAccept();
    }


    @And("^click on lastname and enter \"([^\"]*)\"$")
    public void clickOnLastnameAndEnter(String Lastname) {
        new Homepage().enterLastname("Roy");
    }

    @And("^click on Contactus$")
    public void clickOnContactus() {
        new Homepage().clickOnContact();
    }

    @And("^click on companyName and enter \"([^\"]*)\"$")
    public void clickOnCompanyNameAndEnter(String CompanyName) {
        new Homepage().companyName("Asos");

    }


    @And("^click on phoneNo and enter \"([^\"]*)\"$")
    public void clickOnPhoneNoAndEnter(String PhoneNo) {
        new Homepage().enterPhoneNo("07688989898");
    }

    @And("^click on Email and enter \"([^\"]*)\"$")
    public void clickOnEmailAndEnter(String Email) {
        new Homepage().enterEmail("xyz1@ancoris.com");
    }

    @And("^select Employees from dropdown$")
    public void selectEmployeesFromDropdown() {
        new Homepage().selectEmployees();
    }

    @And("^click on jobTittle and enter \"([^\"]*)\"$")
    public void clickOnJobTittleAndEnter(String JobTittle) {
        new Homepage().jobTittle("Software Tester");
    }

    @And("^click on checkbox$")
    public void clickOnCheckbox() {
        new Homepage().clickOnCheckBox();
    }


    @And("^click on submit button$")
    public void clickOnSubmitButton() {
        new Homepage().clickOnSubmitButton();
    }


    @Then("^verify message \"([^\"]*)\"$")
    public void verifyMessage(String a) {
        {
            Assert.assertEquals(new Homepage().verifyTextMessage(), a, "Pass");
        }

    }


}


