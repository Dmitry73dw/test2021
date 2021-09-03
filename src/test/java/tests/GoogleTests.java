package tests;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.searchPage;

public class GoogleTests {

    private static WebDriver driver;
    private static searchPage searchPage;

    @BeforeAll
    public static void init(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        searchPage = new searchPage(driver);
    }

    @Test
    public void test1() {
        driver.get("http://google.com");
       searchPage.searchInput.sendKeys("Калькулятор", Keys.ENTER);
        searchPage.openbracket.click();
        searchPage.one.click();
        searchPage.plus.click();
        searchPage.two.click();
        searchPage.closebracket.click();
        searchPage.ymnog.click();
        searchPage.tri.click();
        searchPage.minys.click();
        searchPage.fo.click();
        searchPage.zero.click();
        searchPage.delit.click();
        searchPage.fife.click();
    }
  //@AfterAll
   //public static void teardown(){
    //    driver.quit();
   // }
}
