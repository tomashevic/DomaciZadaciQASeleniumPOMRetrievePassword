package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomepagePage extends BaseTest {

    WebDriver driver;

    WebElement forgotPasswordPageLink;


    public HomepagePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getForgotPasswordPageLink() {
        return driver.findElement(By.linkText("Forgot Password"));
    }

    public void clickOnForgotPasswordPageLink() {
        getForgotPasswordPageLink().click();

    }
}
