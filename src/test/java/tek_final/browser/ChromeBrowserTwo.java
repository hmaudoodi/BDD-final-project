package tek_final.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import tek_final.base.BaseSteps;

public class ChromeBrowserTwo extends BaseSteps {
    @Override
    public WebDriver openBrowser(boolean isHeadless) {
        ChromeOptions options = new ChromeOptions();
        if (isHeadless) options.addArguments("--headless");
        return new ChromeDriver(options);

    }
}
