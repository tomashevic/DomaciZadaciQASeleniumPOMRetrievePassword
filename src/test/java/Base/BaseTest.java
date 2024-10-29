package Base;

import Pages.ForgotPasswordPage;
import Pages.HomepagePage;
import Pages.InternalServerErrorPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;

    public HomepagePage homepagePage;

    public ForgotPasswordPage forgotPasswordPage;

    public InternalServerErrorPage internalServerErrorPage;


    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        homepagePage = new HomepagePage(driver);
        forgotPasswordPage = new ForgotPasswordPage(driver);
        internalServerErrorPage = new InternalServerErrorPage(driver);

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
