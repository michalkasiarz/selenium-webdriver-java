package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class NavigatingBetweenPages {

    WebDriver driver;
    String baseURL;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        baseURL = "http://letskodeit.teachable.com/";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void test() throws InterruptedException {
        driver.get(baseURL);
        String title = driver.getTitle();
        System.out.println("Title: " + title);

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);

        String urlToNavigate = "https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";
        driver.navigate().to(urlToNavigate);

        currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL is: " + currentUrl);

        Thread.sleep(2000);

        driver.navigate().back();
        System.out.println("Navigate back...");

        currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL is: " + currentUrl);

        Thread.sleep(2000);

        driver.navigate().forward();
        System.out.println("Navigate forward");

        currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL is: " + currentUrl);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
