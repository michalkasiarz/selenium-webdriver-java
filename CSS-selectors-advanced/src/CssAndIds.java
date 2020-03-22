package src;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;


public class CssAndIds {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        String baseURL = "https://learn.letskodeit.com/p/practice";

        driver.manage().window().setSize(new Dimension(600, 400));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);
        WebElement hoverElement = null;
        WebElement top = null;

        // TO DO:
        // try-catch code refactoring

        try {
            hoverElement = driver.findElement(By.cssSelector("button[class='dropbtn']"));
            System.out.println("Button \"Mouse Hover\" found...");
        } catch (NoSuchElementException e) {
            System.out.println("Button \"Mouse Hover\" NOT found");
        }

        try {
            top = driver.findElement(By.cssSelector("#block-1069048 > div > div > div > div:nth-child(7) > div > fieldset > div > div > a:nth-child(1)"));
            System.out.println("# top element found...");
        } catch (NoSuchElementException e) {
            System.out.println("# top NOT found");
        }

        Actions builder = new Actions(driver);
        builder.moveToElement(hoverElement).perform();
        builder.moveToElement(top).perform();
        try {
            top.click();
            System.out.println("Clicked on top!");
        } catch (Exception e) {
            System.out.println("Didn't click!");
        }


    }

}
