package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(letKodeURL);
    }

    @Test
    public void testLetsKodeIt() throws InterruptedException {
        driver.get(letKodeURL);

        WebElement textBox = driver.findElement(By.id("displayed-text"));
        System.out.println("Textbox displayed? " + textBox.isDisplayed());

        Thread.sleep(3000);

        // hide-button
        WebElement hideButton = driver.findElement(By.id("hide-textbox"));
        hideButton.click();
        System.out.println("Clicked on hide button");
        System.out.println("Textbox displayed? " + textBox.isDisplayed());

        Thread.sleep(3000);

        // show-textbox
        WebElement showButton = driver.findElement(By.id("show-textbox"));
        showButton.click();
        System.out.println("Clicked on show button");
        System.out.println("Textbox displayed? " + textBox.isDisplayed());

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