package helloWorld;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.Set; // Add this import for Set interface

public class redbus {

    @Test
    void testRedBusHelpLink() throws InterruptedException {
        // Initialize WebDriver (ChromeDriver in this case)
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the Redbus website
            driver.get("https://www.redbus.com/");
            String originalWindowHandle = driver.getWindowHandle();
            WebElement Help = driver.findElement(By.xpath("//a[@href='/info/redcare'][text()='Help']"));
            Actions action = new Actions(driver);
            action.click(Help).perform();
            Set<String> allWindowHandles = driver.getWindowHandles();
            for (String windowHandle : allWindowHandles) {
                if (!windowHandle.equals(originalWindowHandle)) {
                    driver.switchTo().window(windowHandle);
                    break; // Assuming only one additional window is opened
                }
            }
            WebElement cross = driver.findElement(By.xpath("//i[@class='icon-close']"));
            action.click(cross).perform();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
