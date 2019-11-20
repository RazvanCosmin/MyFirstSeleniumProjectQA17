import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginText {


    private WebDriver driver;

    @Before
    public void iniDriver(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();


    }

    @Test
    public void validLoginTest() {

        driver.get("https://www.airsoft-cluj.ro/");
        WebElement loginButton = driver.findElement(By.cssSelector("#header-account > ul > li:nth-child(1) > a"));
        driver.findElement(By.cssSelector("#email")).sendKeys("razvancluj88@yahoo.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("aladinn");
        loginButton.click();
        WebElement welcomeMessageElement = driver.findElement(By.cssSelector("#maincontent > div.columns > div.column.main > div.block.block-dashboard-info > div.block-title > strong"));
        Assert.assertEquals(welcomeMessageElement.getText(), "Contul meu");
    }
        @After
         public void closeDriver(){
     driver.quit();
        }
    }


