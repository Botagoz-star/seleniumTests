package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;


public class MailAvtomaOwnWork {
    @Test

    public void MailAvtoma() throws InterruptedException {
          try{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("bell song lyrics" + Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.className("LC20lb")).click();
        driver.findElement(By.linkText("Bell song - Lyrics")).click();
        Thread.sleep(2000);
        driver.close();
         }catch (Exception e) {
        System.out.println("Next time");

        }
    }
}


