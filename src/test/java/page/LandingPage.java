package page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.linkedin.com")
public class LandingPage extends PageObject {

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnButtonWithText(String buttonText) {
        WebElement button = getDriver().findElement(By.xpath(String.format("//a[text()='%s']", buttonText)));
        button.click();
    }
}
