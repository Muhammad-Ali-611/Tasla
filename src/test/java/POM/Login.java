package POM;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    @Test
    public void TestLogin(){

        WebDriver driver = new ChromeDriver();
        System.setProperty("WebDriver.ChromeDriver" , "C:\\Users\\chma6\\Links\\Tasla\\driver\\chromedriver.exe");
           driver.get("https://www.google.com/");
           driver.get("https://www.tesla.com/");
           driver.get("https://auth.tesla.com/login");
           driver.findElement(By.linkText("Create an account")).click();
           driver.findElement(By.name("first_name")).sendKeys("Muhammad");
           driver.findElement(By.name("last_name")).sendKeys("ALi");
           driver.findElement(By.name("email")).sendKeys("chma616@gmail.com");
           driver.findElement(By.name("password")).sendKeys("Alidhoom3756");
           driver.findElement(By.name("password_confirm")).sendKeys("Alidhoom3756");
           driver.findElement(By.name("recaptcha-anchor")).click();
           driver.findElement(By.id("submit-form")).submit();

    }
}
