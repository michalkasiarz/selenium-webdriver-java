package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropdownElements {

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
    public void selectingElementsForLoop() throws InterruptedException {

        // finds dropdown element
        WebElement element = driver.findElement(By.id("carselect"));
        // creates Select object with previously found dropdown list as a parameter
        Select sel = new Select(element);
        // creates list of web elements
        List<WebElement> elements = sel.getOptions();

        // for loop for every element in the web elements list
        for (int i = 0; i < elements.size(); i++) {

            System.out.println("Number of elements to go: " + (elements.size() - i) + ".");
            sel.selectByIndex(i);
            System.out.println("Selected element with index " + i + ".");
            Thread.sleep(3000);
        }
    }

    @Test
    public void selectingElementsByMethod() throws InterruptedException {
        WebElement element = driver.findElement(By.id("carselect"));
        Select sel = new Select(element);
        Thread.sleep(2000);

        sel.selectByVisibleText("Benz");
        sel.selectByVisibleText("BMW");
        sel.selectByVisibleText("Honda");

    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}

