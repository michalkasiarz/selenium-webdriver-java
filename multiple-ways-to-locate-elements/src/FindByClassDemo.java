package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FindByClassDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://learn.letskodeit.com/p/practice";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);

        // btn-style class1 class2
        driver.findElement(By.xpath("//*[@class='btn-style class1 class2']")).click();

    }

}
