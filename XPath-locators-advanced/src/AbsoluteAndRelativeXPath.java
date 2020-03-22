package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AbsoluteAndRelativeXPath {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        String baseURL = "https://learn.letskodeit.com/";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);

        driver.findElement(By.xpath("//div[@class='homepage-hero']//a[text()='Enroll now']")).click();


    }

}
