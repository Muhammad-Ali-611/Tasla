package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AccountPage  (String username, String password){

        WebElement loginField = driver.findElement(By.id("loginField"));
        loginField.clear();
        loginField.sendKeys(username);

        // Fill out the password field. The locator we're using is "By.id", and we should
        // have it defined elsewhere in the class.
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.clear();
        passwordField.sendKeys(password);

        // Click the login button, which happens to have the id "submit".
        driver.findElement(By.id("submit")).

        // Create and return a new instance of the AccountPage (via the built-in Selenium
        // PageFactory).
        return PageFactory.newInstance(AccountPage.class);
    }

