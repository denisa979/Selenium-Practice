
Feature: Company page
      @wip
      Scenario: Verify user can have access to open positions
        
        When User lands on company page
        Then User should be able to see company "An agency fueled by purpose, with impact you can certify"
        And User should see 6 options on the manu bar:
          | What we do      |
          | Who we are      |
          | Healthcare      |
          | Company we keep |
          | Careers         |
          | Work with us    |
        
        Then User send request to count total links on the company home page
        And User get number of links together with the links names
