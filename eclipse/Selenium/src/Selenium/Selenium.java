package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium {

	    public static void main(String[] args) {

	        WebDriver driver = new FirefoxDriver();
	        driver.get("https://www.calculator.net/");

	        WebElement searchTerm = driver.findElement(By.id("calcSearchTerm"));
	        // Perform actions on the element here...

	        // After you are done, you should close the WebDriver
	        driver.quit();
	    }
	}

}
