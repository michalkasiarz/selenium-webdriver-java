package src;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FindByNameDemo {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        String baseURL = "https://learn.letskodeit.com/p/practice";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);

        driver.findElement(By.name("enter-name")).sendKeys("Automation");
    }
}
