package com.selenium.step_definitions;

import com.selenium.pages.CareerPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CareerPageStepDefinitions {
    
    CareerPage careerPage = new CareerPage();
    
@When("User click on {string}")
public void user_click_on(String string) {
   
}
@Then("User should land on careers page")
public void user_should_land_on_careers_page() {
    
}
@Then("User click {string}")
public void user_click(String string) {
}
@Then("User should see all  open positions")
public void user_should_see_all_open_positions() {
   
}
}
