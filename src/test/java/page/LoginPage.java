package page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.At;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@At("https://www.linkedin.com/login")
public class LoginPage extends PageObject {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "")
    private WebElement userEmailField;

    @FindBy(xpath = "")
    private WebElement userPasswordField;

    @FindBy(xpath = "")
    private WebElement signInButton;


    public void login (String userEmail, String userPassword) {

    }

}
