Feature: user scenario

  @test
  Scenario:test
    Given user is on Homepage
    And click on Accept
    And click on Contactus
    And click on lastname and enter "<Lastname>"
    And click on companyName and enter "<companyName>"
    And click on jobTittle and enter "<Tittle>"
    And click on phoneNo and enter "<PhoneNo>"
    And click on Email and enter "<Email>"
    And select Employees from dropdown
    And click on checkbox
    And click on submit button
    Then verify message "Thank you for getting in touch! A member of our team will reach out shortly. "
@test1
Scenario:user Scenario
  Given user is on Homepage of geoplace
  And clicks on accept
  And clicks on local Authority Resources
  And click on Data creation manuals
  Then verify text "Data creation and maintenance"
  Then print the name of 8 items present on page

