import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Header {

    By createButton = By.xpath(".//*[@id='create_link']");

    private final WebDriver driver;

    public Header(WebDriver driver){
        this.driver = driver;
    }

    public Header clickCreate(){
        driver.findElement(createButton).click();
        return this;
    }

    }

