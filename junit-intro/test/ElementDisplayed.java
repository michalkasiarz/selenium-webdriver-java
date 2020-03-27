package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ElementDisplayed {

    WebDriver driver;
    String letKodeURL;
    String expediaURL;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        letKodeURL = "http://letskodeit.teachable.com/pages/practice";
        expediaURL = "http://www.expedia.com";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(letKodeURL);
    }

    @Test
    public void testLetsKodeIt() throws InterruptedException {
        driver.get(letKodeURL);

    }

    @Test
    public void testExpedia() throws InterruptedException {
        driver.get(expediaURL);
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}