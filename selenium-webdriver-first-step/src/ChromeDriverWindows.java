import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverWindows {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\libs\\chrome-driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://www.google.com";
        driver.get(baseURL);
        WebElement userInput = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
        userInput.click();
        userInput.sendKeys("Jak uczyć się testowania");
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();

    }

}
