package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bymyself2 {

    @Test


    public void MailAvtoma() throws InterruptedException {
        try {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.youtube.com/");
            Thread.sleep(2000);
            driver.findElement(By.id("search")).sendKeys("Vite nado vuyti" + Keys.ENTER);
            Thread.sleep(2000);
            driver.findElement(By.linkText("ESTRADARADA - Вите Надо Выйти (Official Music Video)")).click();
            Thread.sleep(10000);//
            //driver.findElement(By.className("class")).click();
            //Thread.sleep(2000);
//style-scope ytd-video-renderer

            driver.close();

        } catch(Exception e) {
            System.out.println("Try something different");
        }

    }
}


