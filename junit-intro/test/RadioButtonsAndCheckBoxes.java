package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class RadioButtonsAndCheckBoxes {

    WebDriver driver;
    String baseURL;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseURL = "https://letskodeit.teachable.com/pages/practice";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseURL);
    }

    @Test
    public void test() throws InterruptedException {
        WebElement bmwRadioBtn = driver.findElement(By.id("bmwradio"));
        // clicking or BMW radio button
        bmwRadioBtn.click();

        Thread.sleep(2000);

        WebElement benzRadioBtn = driver.findElement(By.id("benzradio"));
        // clicking on Benz radio button
        benzRadioBtn.click();

        Thread.sleep(2000);

        WebElement hondaRadiobtn = driver.findElement(By.id("hondaradio"));
        // clicking on Honda radio button
        hondaRadiobtn.click();
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}

