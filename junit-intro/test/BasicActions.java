package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BasicActions {

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
    public void test() {
        driver.get(baseURL);
        driver.findElement(By.xpath("//div[@id='navbar']//a[@href='/sign_in']")).click();
        System.out.println("Clicked on login");
        driver.findElement(By.id("user_email")).clear();
        driver.findElement(By.id("user_email")).sendKeys("test@email.com");
        System.out.println("Keys to user email has been sent");
        driver.findElement(By.id("user_password")).sendKeys("test");
        System.out.println("Keys to user password has been sent");


    }

    @After
    public void tearDown() {
        driver.quit();
    }
}