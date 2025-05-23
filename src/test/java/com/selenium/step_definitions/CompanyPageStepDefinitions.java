package com.selenium.step_definitions;

import com.selenium.pages.CompanyPage;
import com.selenium.utilities.BrowserUtils;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class CompanyPageStepDefinitions {
    
        CompanyPage companyPage = new CompanyPage();
    
        @When("User lands on company page")
        public void userLandsOnCompanyPage() {
             Assert.assertTrue(companyPage.isLogoDisplayed());
        }
        @Then("User should be able to see company {string}")
        public void userShouldBeAbleToSeeCompany(String message) {
            
              BrowserUtils.waitFor(3);
        String expected = "An agency fueled by purpose, with impact you can certify";
    String actual = companyPage.getWelcomeMessageText();
    
    String normalizedExpected = expected.replaceAll("\\s+", " ").trim();
    String normalizedActual = actual.replaceAll("\\s+", " ").trim();
    
    Assert.assertEquals("Company message mismatch", normalizedExpected, normalizedActual);
    
        }
         @And("User should see {int} options on the manu bar:")
        public void userShouldSeeOptionsOnTheManuBar(int expectedCount, DataTable dataTable) {
            List<String> expectedOptions = dataTable.asList();
            List<WebElement> menuOptions = companyPage.getMenuOptions();
            
            assertEquals("Menu option count mismatch",
                    expectedCount,
                    menuOptions.size() // Actual count from the page
            );
            List<String> actualOptions = menuOptions.stream()
                    .map(WebElement::getText)
                    .collect(Collectors.toList());
            assertEquals("Menu options text mismatch",
                    expectedOptions,
                    actualOptions
            );
        }
        @Then("User send request to count total links on the company home page")
        public void userSendRequestToCountTotalLinksOnTheCompanyHomePage() {
              List<String> linksOnTheCompanyPage = companyPage.getLinks();
            System.out.println("linksOnTheCompanyPage.size() = " + linksOnTheCompanyPage.size());
        }
        @And("User get number of links together with the links names")
        public void userGetNumberOfLinksTogetherWithTheLinksNames() {
              List<String> linksOnTheCompanyPage = companyPage.getLinks();
               System.out.println("linksOnTheCompanyPage = " + linksOnTheCompanyPage);
                
        }
    }
