import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest {
    @Test
        public void validRegisterTest(){
        String userEmail= RandomStringUtils.randomAlphanumeric(7) +"@testFastTrackIt.com";
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/home-decor/bed-bath.html");
      Select sortByElement= new Select(driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > div.toolbar > div.sorter > div > select")));
        sortByElement.selectByIndex(1);
        driver.get("https://fasttrackit.org/selenium-test/home-decor/electronics.html");
        Select sortByElement2= new Select(driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > div.toolbar > div.sorter > div > select")));
        sortByElement2.selectByIndex(0);
//        driver.findElement(By.cssSelector("#email")).sendKeys("razvancluj88@yahoo.com");


    }
}