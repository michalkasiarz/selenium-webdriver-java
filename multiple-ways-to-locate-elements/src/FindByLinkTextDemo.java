package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FindByLinkTextDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        String baseURL = "https://learn.letskodeit.com/p/practice";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);

        driver.findElement(By.linkText("Login")).click();
        Thread.sleep(3000);

        driver.findElement(By.partialLinkText("Forg")).click();
        Thread.sleep(3000);
        driver.close();
}

}
