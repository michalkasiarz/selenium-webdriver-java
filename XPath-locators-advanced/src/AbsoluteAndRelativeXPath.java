package src;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AbsoluteAndRelativeXPath {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        String baseURL = "https://learn.letskodeit.com/p/practice";

        driver.manage().window().setSize(new Dimension(600, 400));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);


    }

}
