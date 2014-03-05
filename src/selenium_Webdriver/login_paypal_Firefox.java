package selenium_Webdriver;
import java.util.List;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
 
public class login_paypal_Firefox {
    public static void main(String[] args) throws Exception {
        // The Firefox driver supports javascript 
        WebDriver driver = new FirefoxDriver();
        String website = "http://www.paypal.com";   
        driver.get(website);
        WebElement query = driver.findElement(By.name("q"));
        query.sendKeys("Cheese");
        long end = System.currentTimeMillis() + 5000;
        while (System.currentTimeMillis() < end) {
            WebElement resultsDiv = driver.findElement(By.className("gssb_e"));
            if (resultsDiv.isDisplayed()) {
              break;
            }
        }

     
        List<WebElement> allSuggestions = driver.findElements(By.xpath("//td[@class='gssb_a gbqfsf']"));
        
        for (WebElement suggestion : allSuggestions) {
            System.out.println(suggestion.getText());
        }
     }
}