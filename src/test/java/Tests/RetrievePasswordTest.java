package Tests;

import Base.BaseTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RetrievePasswordTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://the-internet.herokuapp.com/");
    }

    @Test
    public void userCannotRetrievePassword() {
        String homePageUrl = driver.getCurrentUrl();
        homepagePage.clickOnForgotPasswordPageLink();
        Assert.assertNotEquals(driver.getCurrentUrl(), homePageUrl);
        forgotPasswordPage.inputEmail("example@nonemail.com");
        forgotPasswordPage.clickOnRetrievePasswordButton();
        Assert.assertTrue(internalServerErrorPage.getErrorMessage().isDisplayed());

        boolean isPresent = false;

        try {
            isPresent = driver.findElement(By.id("form_submit")).isDisplayed();
        } catch (Exception e) {

        }

        Assert.assertFalse(isPresent);
    }

}
