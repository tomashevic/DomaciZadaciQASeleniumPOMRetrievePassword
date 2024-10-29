package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPasswordPage extends BaseTest {

    WebDriver driver;

    WebElement emailField;

    WebElement retrievePasswordButton;


    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getEmailField() {
        return driver.findElement(By.id("email"));
    }

    public WebElement getRetrievePasswordButton() {
        return driver.findElement(By.id("form_submit"));
    }

    public void inputEmail(String email) {
        getEmailField().clear();
        getEmailField().sendKeys(email);
    }

    public void clickOnRetrievePasswordButton() {
        getRetrievePasswordButton().click();

    }

}
