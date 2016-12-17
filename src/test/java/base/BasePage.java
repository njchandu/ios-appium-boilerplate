package base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;

/**
 * Created by chandanjavaregowda on 17/12/16.
 */
public class BasePage {
    protected AndroidDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = (AndroidDriver) driver;
    }
}
