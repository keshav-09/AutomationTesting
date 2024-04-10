package helloWorld;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

class Calculator {

    @Test
    void test() {
        // Initialize WebDriver
        WebDriver driver = new FirefoxDriver();

        try {
            driver.get("https://www.calculator.net/");
            driver.findElement(By.id("calcSearchTerm")).sendKeys("sadadad");
            driver.findElement(By.linkText("Mortgage Calculator")).click();
            
            // Add additional lines of code here
            driver.findElement(By.xpath("//input[@id='calcSearchTerm']")).sendKeys("abcd");
//             driver.findElement(By.className("homelisttile"));
            driver.findElement(By.tagName("body"));
            driver.findElement(By.linkText("about us"));
            driver.findElement(By.xpath("//a[contains(text(),'privacy policy')]"));
//             driver.findElement(By.xpath("(//SPAN[@class='rbmark'])[2]")).click();
        } catch (Exception e) {
            e.printStackTrace();
            fail("An exception occurred: " + e.getMessage());
        } finally {
            // Close the WebDriver instance
            driver.quit();
        }
    }

}
