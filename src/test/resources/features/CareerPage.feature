Feature: Career job opportunities.

  Scenario:User is able to see all open job positions.
    
    Given User is on the company page
        When  User click on "Careers"
        Then  User should land on careers page
        Then User click "View Openings"
        And User should see all  open positions
   
