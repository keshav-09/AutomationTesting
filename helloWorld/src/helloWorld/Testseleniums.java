package helloWorld;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Testseleniums {
    
    @Test
    public void testDragAndDrop() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.redbus.com/");
        WebElement helpLink = driver.findElement(By.xpath("//a[text()='Help']"));
        helpLink.click();
        try {
            Thread.sleep(2000); // Adjust the sleep time as needed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement closeIcon = driver.findElement(By.cssSelector(".modalCloseSmall"));
        closeIcon.click();
        driver.quit();
    }
    
}

//        try {
        	
//        	 driver.get("https://schooledn.py.gov.in/schools/govtAided.html");
//
//             // Locate the "School" element
//             WebElement schoolElement = driver.findElement(By.xpath("//A[@href='#'][text()='Schools']"));
//
//             // Instantiate the Actions class
//             Actions actions = new Actions(driver);
//
//             // Perform mouse hover on the "School" element
//             actions.moveToElement(schoolElement).perform();
//
//             // Locate the "Private" element under "School"
//             WebElement privateElement = driver.findElement(By.xpath("//A[@href='#'][text()='Private']"));
//
//             // Perform mouse hover on the "Private" element
//             actions.moveToElement(privateElement).perform();
//
//             // Locate the "Un-aided" element under "Private"
//             WebElement unaidedElement = driver.findElement(By.xpath("//A[text()='Un-aided']"));
//
//             // Perform mouse hover on the "Un-aided" element
//             actions.moveToElement(unaidedElement).perform();

             // Perform click action on the "Un-aided" element if needed
             // unaidedElement.click();
        	
        	/**
        	 * driver.get("https://example.com");
            
            // Locate the element to hover over
            WebElement hoverElement = driver.findElement(By.id("elementId"));
            
            // Create an instance of Actions class
            Actions actions = new Actions(driver);
            
            // Perform multiple mouse hover actions
            actions.moveToElement(hoverElement).perform(); // First hover
            
            // Add some delay if needed
            Thread.sleep(1000); // Wait for 1 second
            
            actions.moveToElement(hoverElement).perform(); // Second hover
            
            // Add more hover actions if needed
            
            // Perform the final action (e.g., click)
            actions.click().perform();
        	 * 
        	 */
        	
        	
        	
        	
        	
           
           
            
       
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            // Close the browser
//            driver.quit();
//        }
    
//}

//        try {
//            driver.get("http://localhost:4200/doctorLogin");
//            
//            // Enter email and password
//            driver.findElement(By.id("email")).sendKeys("keshav09khandelwal@gmail.com");
//            
//            driver.findElement(By.id("password")).sendKeys("@flysky123");
//          
//            // Click the login button
//            driver.findElement(By.id("loginButton")).click();
//
//
//            // Add assertions or further actions if needed
//        } catch (Exception e) {
//            fail("An exception occurred: " + e.getMessage());
//        } finally {
//            driver.quit();
//        }
//    }
//}


//package helloWorld;
//
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//public class Testseleniums {
//    
//    @Test
//    public void testCalculatorSearch() {
//        WebDriver driver = new FirefoxDriver();
//        try {
//            driver.get("https://www.calculator.net/");
//            driver.findElement(By.id("calcSearchTerm")).sendKeys("sadadad");
//            driver.findElement(By.linkText("Mortgage Calculator")).click();
//            // Add assertions or further actions if needed
////            button[@name='calcSearchTerm']
////            //span[@id="bluebtn"]
//          //a[contains(@href, 'mortgage-calculator')]
//        } catch (Exception e) {
//            fail("An exception occurred: " + e.getMessage());
//        } finally {
//            driver.quit();
//        }
//    }
//}

//driver.get("https://www.calculator.net/");
//driver.findElement(By.xpath("//input[@id='calcSearchTerm']")).sendKeys("sadadad");
//// 
// driver.findElement(By.xpath("//span[@id='bluebtn']")).click();
//// 
// driver.findElement(By.xpath("//div[@id='sciOutPut']")).click();
//// 
//// // ID Locator
// driver.findElement(By.id("calcSearchTerm")).sendKeys("abcd");
//// // Class Name Locator
// driver.findElement(By.className("homelisttile"));
////
////
//// // Tag Name Locator
// driver.findElement(By.tagName("body"));
////
//// // Link Text Locator
// driver.findElement(By.linkText("about us"));
////
////
//// // XPath Locator 
// driver.findElement(By.xpath("//a[contains(text(),'privacy policy')]"));
// driver.findElement(By.linkText("Mortgage Calculator")).click();
// driver.findElement(By.xpath("(//SPAN[@class='rbmark'])[2]")).click();

