package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ElementUtil;

public class SendKeys {

    static WebDriver driver;

    public static void main(String[] args) {

        driver = new ChromeDriver();//123
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        By email = By.id("input-email");
		By password = By.id("input-password");

		ElementUtil elUtil = new ElementUtil((WebDriver) driver);
		elUtil.doSendKeys(email, "naveen@gmail.com");
		elUtil.doSendKeys(password, "naveen@123");
    }
}
