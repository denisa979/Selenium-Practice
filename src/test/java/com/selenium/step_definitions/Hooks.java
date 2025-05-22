package com.selenium.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.selenium.utilities.ConfigurationReader;

public class Hooks {

      @Before
    public void setUp() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @After
    public void teardown(Scenario scenario){
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        ElementUtil.sleep(2);
        Driver.closeDriver();
    }
}
