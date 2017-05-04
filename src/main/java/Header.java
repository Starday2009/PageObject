import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Header {

    By createButton = By.xpath(".//*[@id='create_link']");
    By dashBoards = By.xpath(".//*[@id='home_link']");
    By projects = By.xpath(".//*[@id='browse_link']");
    By issues = By.xpath(".//*[@id='find_link']");
    By boards = By.xpath(".//*[@id='find_link']");
    By testRail = By.xpath(".//*[@id='menu']");
    By burgerMenu =By.xpath(".//*[@id='header']/nav/div/div[1]/a");
    By search = By.xpath(".//*[@id='quickSearchInput']");

    private final WebDriver driver;

    public Header(WebDriver driver){
        this.driver = driver;
    }

    public Header clickCreate(){
        driver.findElement(createButton).click();
        return this;
    }

    public Header clickdashBoards(){
        driver.findElement(dashBoards).click();
        return this;
    }
    public Header clickprojects(){
        driver.findElement(projects).click();
        return this;
    }
    public Header clickissues(){
        driver.findElement(issues).click();
        return this;
    }
    public Header clickboards(){
        driver.findElement(boards).click();
        return this;
    }
    public Header clicktestRail(){
        driver.findElement(testRail).click();
        return this;
    }
    public Header clickburgerMenu(){
        driver.findElement(burgerMenu).click();
        return this;
    }
    public Header clickSearch(){
        driver.findElement(search).click();
        return this;
    }
    public Header typeFind(String find){
        WebElement element = driver.findElement(search);
        element.sendKeys(find);
        element.submit();
      //  driver.findElement(search).sendKeys(find);
        return this;
    }



    }

