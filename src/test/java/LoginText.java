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
        driver.findElement(By.cssSelector("#search"));
        driver.findElement(By.cssSelector("#shopping-cart-table > tbody > tr.item-actions > td > div > a.action.action-delete > span"));
        driver.findElement(By.cssSelector("#sorter"));
        driver.findElement(By.cssSelector("body"));
        driver.findElement(By.cssSelector("#maincontent > div.columns > div.column.main > div:nth-child(3) > h2"));
        new AssertionError(equals("loginButton"));
        driver.findElement(By.cssSelector("body > div.page-wrapper > div.footer-container.page-footer > div > div > div.footer-primary-container.section-container > div > div > div.clearfix > div:nth-child(3) > div > div > div > div:nth-child(4) > p > a"));
        driver.findElement(By.cssSelector("body"));
        driver.findElement(By.cssSelector("#top > div > div.header-top-container > div > div > div.left-column > div:nth-child(1) > a:nth-child(2)"));

    }
        @After
         public void closeDriver(){
     driver.quit();
        }
    }


