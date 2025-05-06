package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class MultipleElementConcept {

    static WebDriver driver;

    public static void main(String[] args) {
        driver = new FirefoxDriver();
        driver.get("https://www.amazon.com/");

        List<WebElement> allList = driver.findElements(By.tagName("a"));
        System.out.println("All list " + allList.size());

        for (WebElement e : allList) {
            String textLink = e.getText();
            if (textLink.length() != 0) {
                System.out.println("textLink = " + textLink);

                //for (int i = 0; i < allList.size(); i++) {
                //    String linkText = allList.get(i).getText();
                //    if(linkText.length() !=0){
                //       System.out.println(allList.get(i).getText());
            }


        }
    }
}




