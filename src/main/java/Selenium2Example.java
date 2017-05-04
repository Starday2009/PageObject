import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;

public class Selenium2Example {
        LoginPage loginPage;
        WebDriver driver;
        Header header;
        TaskPage taskPage;
        @BeforeTest
                public void before() {
            System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            capabilities.setCapability("marionette", true);

            driver = new FirefoxDriver(capabilities);
            loginPage = new LoginPage(driver);
            header = new Header(driver);
            taskPage = new TaskPage(driver);
        }

        @Test(groups = {"functest", "login"})
        public void login() throws InterruptedException {
            loginPage.open();
            loginPage.typeUsername("oksana.gorbachenko.2009");
            loginPage.typePassword("123456qwerty");
            loginPage.clickOnLogin();
            Thread.sleep(4000);
            //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
            header.clickSearch();
            header.typeFind("QAAUT-60");
            Thread.sleep(4000);
            taskPage.clickAddSub();
            Thread.sleep(3000);
            taskPage.typeSummary("Oks sub task");
            taskPage.clickAssign();
            taskPage.clickSubmit();
            Thread.sleep(5000);

        }
     // @AfterTest
            //  public void after(){ driver.quit();}
}