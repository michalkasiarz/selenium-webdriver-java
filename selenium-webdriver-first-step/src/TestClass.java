import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClass {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\libs\\gecko-driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String baseURL = "http://redape-recipes.online/";
        driver.get(baseURL);
        driver.findElement(By.xpath("//*[@id=\"sidebar-collapse\"]")).click();
        driver.findElement(By.xpath("//div[@id='mCSB_1_container']/ul//a[@href='/login']")).click();
        WebElement email = driver.findElement(By.cssSelector("input#email"));
        WebElement pass = driver.findElement(By.cssSelector("input#password"));
        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        email.click();
        email.sendKeys("test@test.com");
        pass.click();
        pass.sendKeys("test@test224");
        login.click();
        driver.findElement(By.xpath("//*[@id=\"sidebar-collapse\"]")).click();
    }
}
