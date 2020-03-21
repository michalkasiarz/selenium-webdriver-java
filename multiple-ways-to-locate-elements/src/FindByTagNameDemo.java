package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FindByTagNameDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        String baseURL = "http://help.websiteos.com/websiteos/example_of_a_simple_html_page.htm";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);

        WebElement text = driver.findElement(By.tagName("h1"));

        // prints text to the console
        System.out.println(text.getText());

    }

}
