package src;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class XPathCustomizedTrainingIE {

    public static void main(String[] args) {

        DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
        caps.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
        caps.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
        caps.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, false);
        caps.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
        caps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
        caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);

        InternetExplorerDriver driver = new InternetExplorerDriver(caps);

        String baseURL = "https://www.google.com";
        driver.get(baseURL);
        driver.findElementByXPath("//input[@class='gLFyf gsfi']").sendKeys("pogoda na dzisiaj stanisław górny");
        driver.findElementByXPath("//div[3]/center/input[@value='Szukaj w Google']").click();



    }

}
