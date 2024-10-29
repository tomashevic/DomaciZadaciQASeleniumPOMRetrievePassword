package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InternalServerErrorPage extends BaseTest {

    WebDriver driver;

    WebElement errorMessage;


    public InternalServerErrorPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getErrorMessage() {
        return driver.findElement(By.xpath("/html/body/h1"));
    }

}
