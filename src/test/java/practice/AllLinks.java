package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AllLinks {
    
    static WebDriver driver;

    public static void main(String[] args) {
        
        driver = new ChromeDriver();
        
        driver.get("https://www.amazon.com/");
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        System.out.println("allLinks = " + allLinks);
        for (WebElement e : allLinks){
            String text = e.getText();
            if(text.length() !=0){
                System.out.println("text = " + text);
                
        }
        }

    }
}
