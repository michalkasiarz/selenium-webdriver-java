package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WorkingWithTheElementsList {

    WebDriver driver;
    String baseURL;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseURL = "https://letskodeit.teachable.com/pages/practice";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseURL);
    }

    @Test
    public void test() throws InterruptedException {

        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[contains(@type, 'radio') and contains(@name, 'cars')]"));
        int size = radioButtons.size();
        boolean isChecked = false;

        // goes through every element of the list
        for (int i = 0; i < size; i++) {

            // checking if a button is selected
            isChecked = radioButtons.get(i).isSelected();

            if (isChecked) {
                // clicking of button if not selected
                radioButtons.get(i).click();
                Thread.sleep(2000);
            }

        }
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}

