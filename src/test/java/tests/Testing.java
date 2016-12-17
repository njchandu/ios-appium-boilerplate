package tests;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.TestListener;

/**
 * Created by chandanjavaregowda on 21/10/16.
 */
@Listeners({TestListener.class})
public class Testing extends BaseTest {
    public static WebDriver driver;

    @Test
    public void example(String fromLocation, String toLocation, String emailAddress) throws Exception {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.searchFor("");
    }
}