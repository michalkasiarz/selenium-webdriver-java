import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IEDriverWindows {

    public static void main(String[] args) {

        // driver is set at Path environment variable

        DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
        caps.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
        caps.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
        caps.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, false);
        caps.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
        caps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
        caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);

        WebDriver driver = new InternetExplorerDriver(caps);

        String baseURL = "https://www.google.com";
        driver.get(baseURL);
        WebElement textarea = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
        textarea.sendKeys("How to learn testing");
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
    }


}
