package helloWorld;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

class SchoolWebsite {

    @Test
    void test() {
        // Instantiate a WebDriver object (FirefoxDriver in this case)
        WebDriver driver = new FirefoxDriver();
        
        try {
            driver.get("https://schooledn.py.gov.in/schools/govtAided.html");

            // Locate the "School" element
            WebElement schoolElement = driver.findElement(By.xpath("//a[@href='#'][text()='Schools']"));

            // Instantiate the Actions class
            Actions actions = new Actions(driver);

            // Perform mouse hover on the "School" element
            actions.moveToElement(schoolElement).perform();

            // Locate the "Private" element under "School"
            WebElement privateElement = driver.findElement(By.xpath("//a[@href='#'][text()='Private']"));

            // Perform mouse hover on the "Private" element
            actions.moveToElement(privateElement).perform();

            // Locate the "Un-aided" element under "Private"
            WebElement unaidedElement = driver.findElement(By.xpath("//a[text()='Un-aided']"));

            // Perform mouse hover on the "Un-aided" element
            actions.moveToElement(unaidedElement).perform();

            // Perform click action on the "Un-aided" element if needed
            // unaidedElement.click();
        } catch (Exception e) {
            e.printStackTrace(); // Print any exceptions that occur during execution
            fail("Test failed: " + e.getMessage()); // Fail the test if an exception occurs
        } finally {
            // Close the browser after the test
            driver.quit();
        }
    }
}
