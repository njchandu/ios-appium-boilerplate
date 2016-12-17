package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by chandanjavaregowda on 17/12/16.
 */
public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "")
    private WebElement searchBox;

    @Step("Search for {0}")
    public HomePage searchFor(String keyword) {
        return this;
    }
}
