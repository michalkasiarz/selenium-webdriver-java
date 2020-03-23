package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class XPathSiblingNodes {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        String baseURL = "https://learn.letskodeit.com/p/practice";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);

        WebElement price = driver.findElement(By.xpath("//td[text()='Python Programming Language']//following-sibling::td"));
        // printing price of the book "Python Programming Language" to the console
        System.out.println(price.getText());


    }

}
