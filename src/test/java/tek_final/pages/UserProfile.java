package tek_final.pages;
import org.openqa.selenium.By;
import tek_final.utilities.SeleniumUtility;

public class UserProfile {

    public static final By ACCOUNT_PROFILE = By.xpath("//button[@type='button']");
    public static final By PROFILE_INFORMATION = By.xpath("//header[text()='Profile']");
    public static final By LOGOUT_BUTTON = By.xpath("(//button[@type='button'])[3]");
}
