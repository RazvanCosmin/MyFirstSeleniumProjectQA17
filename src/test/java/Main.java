import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

////////////////////
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.close();


        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver2 = new ChromeDriver();
        driver2.get("https://www.airsoft-cluj.ro/");
        driver2.get("#header-account > ul > li:nth-child(4) > a");
        driver2.get("#maincontent > div.columns > div > div.product-view.product-columns-wrapper > div.product-img-column.grid12-4.no-left-gutter.product.media > div.product.media > div.gallery-placeholder > div.fotorama-item.fotorama.fotorama1574099484699 > div.fotorama__wrap.fotorama__wrap--css3.fotorama__wrap--slide.fotorama__wrap--toggle-arrows.fotorama__wrap--css2.fotorama__wrap--no-captions.fotorama__wrap--no-shadows.fotorama__wrap--no-controls > div.fotorama__stage > div.fotorama__stage__shaft.fotorama__grab > div.fotorama__stage__frame.fotorama__active.fotorama_vertical_ratio.fotorama__loaded.fotorama__loaded--img > img");
        driver2.get("#header-account > ul > li:nth-child(4) > a");
        driver2.get("#header-account > ul > li.authorization-link > a");
        driver2.get("#login-form > fieldset");
        driver2.get("#header-account > ul > li:nth-child(1) > a");
                driver2.close();

    }
}


