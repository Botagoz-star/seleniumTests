package tests;

    import io.github.bonigarcia.wdm.WebDriverManager;
    import org.junit.Test;
    import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    /**
     * @author Nils Schuette via frontendtest.org
     */
    public class catchRe {
        /**
         * @param
         * @throws InterruptedException
         */

        @Test
        public void testGoogle() throws InterruptedException {
            // Telling the system where to find the chrome driver
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            // Open the Chrome browser

            // Maximize the browser window
            driver.manage().window().maximize();

            if (testWordpresslogin()) {
                System.out.println("Test Wordpress Login: Passed");
            } else {
                System.out.println("Test Wordpress Login: Failed");

            }

            // Close the browser and WebDriver
            driver.close();
            driver.quit();
        }
        @Test
        private static boolean testWordpresslogin() {
            try {
                WebDriverManager.chromedriver().setup();
                WebDriver driver = new ChromeDriver();
                // Open google.com
                driver.navigate().to("https://www.YOUR-SITE.org/wp-admin/");

                // Type in the username
                driver.findElement(By.id("user_login")).sendKeys("YOUR_USERNAME");

                // Type in the password
                driver.findElement(By.id("user_pass")).sendKeys("YOUR_PASSWORD");

                // Click the Submit button
                driver.findElement(By.id("wp-submit")).click();

                // Wait a little bit (7000 milliseconds)
                Thread.sleep(7000);

                // Check whether the h1 equals “Dashboard”
                if (driver.findElement(By.tagName("h1")).getText()
                        .equals("Dashboard")) {
                    return true;
                } else {
                    return false;
                }

                // If anything goes wrong, return false.
            } catch (final Exception e) {
                System.out.println(e.getClass().toString());
                return false;
            }
        }
    }
