package com.selenium.pages;

import org.openqa.selenium.By;

public class CareerPage extends BasePage{
    
     private By careersBtn = By.xpath("//span[@data-text='Careers']");
     private By openPositionBtn = By.xpath("//div[@class='magnetic']");
     
     public void clickCareersButton() {
          driver.findElement(careersBtn).click();
    }
    public void clickOpenJobPositionButton() {
          driver.findElement(openPositionBtn).click();
    }
}
