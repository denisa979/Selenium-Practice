package com.selenium.pages;

import com.selenium.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public abstract class BasePage {

   protected WebDriver driver;

    public BasePage() {

        this.driver = Driver.getDriver(); 
    }
        public List<String> getElementsText(By locator) {
        List<WebElement> elements = driver.findElements(locator);
        return elements.stream()
            .map(WebElement::getText)
            .collect(Collectors.toList());
    }
}
