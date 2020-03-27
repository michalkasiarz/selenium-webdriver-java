package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class MultipleSelect {

    WebDriver driver;
    String baseURL;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseURL = "https://letskodeit.teachable.com/pages/practice";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1000, 800));
        driver.get(baseURL);
    }

    @Test
    public void test() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//select[contains(@name, 'multiple')]"));
        Select sel = new Select(element);

        Thread.sleep(2000);

        System.out.println("Selecting Orange...");
        sel.selectByVisibleText("Orange");
        Thread.sleep(2000);
        System.out.println("Selecting Peach...");
        sel.selectByValue("peach");
        Thread.sleep(2000);
        System.out.println("Deselecting Orange...");
        sel.deselectByIndex(1);
        Thread.sleep(2000);
        System.out.println("Selecting Apple...");
        sel.selectByValue("apple");
        Thread.sleep(2000);
        System.out.println("Deselecting Peach...");
        sel.deselectByVisibleText("Peach");
        Thread.sleep(2000);
        System.out.println("Selecting both Orange and Peach");
        sel.selectByValue("orange");
        sel.selectByValue("peach");
        Thread.sleep(2000);
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}

