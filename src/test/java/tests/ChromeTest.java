/*package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {
@Test
   try{ public void testPartialLink()throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        //by.linktest
        //by.PartialText
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Search")).click();
        String expectedTitle="Google Search - Discover How Google Search Works";
        Assert.assertTrue(driver.getTitle().contains(expectedTitle));

        driver.close();

    }
    @Test
    public void testSearch()throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);

        driver.findElement(By.name("q")).sendKeys("Australia"+ Keys.ENTER);

        Thread.sleep(2000);
        Assert.assertTrue(driver.getTitle().contains("Australia"));
        driver.close();
    }
    @Test
    public void GamburgerButton()throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);
        driver.findElement(By.id("nav-hamburger-menu")).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.id("hmenu-customer-name")).isDisplayed());
        Thread.sleep(2000);
        driver.close();
    }
    @Test
    public void SeliniumPractice()throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.practiceselenium.com/");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Let's Talk Tea")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("name")).sendKeys("Bota");
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("mikluha-08@mail.ru");
        Thread.sleep(2000);
        driver.findElement(By.name("subject")).sendKeys("BLA");
        Thread.sleep(2000);
        driver.findElement(By.name("message")).sendKeys("BLABLABLA");
        Thread.sleep(2000);
        driver.findElement(By.className("form-submit")).click();
        Thread.sleep(2000);



        driver.close();
    }


    /* @Test
    public void SeliniumPractice()throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.expedia.com/");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Let's Talk Tea")).click();
        Thread.sleep(2000);
        driver.findElement(ByXPath("name")).sendKeys("Bota");
        Thread.sleep(2000);
        driver.findElement(ByXPath("email")).sendKeys("mikluha-08@mail.ru");
        Thread.sleep(2000);
        driver.findElement(ByXpath("subject")).sendKeys("BLA");
        Thread.sleep(2000);
        driver.findElement(ByXPath("message")).sendKeys("BLABLABLA");
        Thread.sleep(2000);
        driver.findElement(By.className("form-submit")).click();
        Thread.sleep(2000);

}catch()exe e

        driver.close();*/



