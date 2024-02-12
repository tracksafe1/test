Feature:signin


  @test
  Scenario:enter course
    Given i am on homepage
    And i click on searchbutton

    And click on search
    And i should land on coursesearchpage

    And click on resetall
    Then I should see 18 courses available on page



