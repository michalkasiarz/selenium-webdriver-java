package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ElementDisplayed {

    WebDriver driver;
    String baseURL;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        baseURL = "http://letskodeit.teachable.com/";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseURL);
    }

    @Test
    public void test() {


    }

    @After
    public void tearDown() {
        driver.quit();
    }
}