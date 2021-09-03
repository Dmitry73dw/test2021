package tests;



import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.searchPage;

import static org.junit.jupiter.api.Assertions.assertEquals;


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
        searchPage.ravno.click();
        assertEquals("1", searchPage.getSearchresalt());
        assertEquals("(1 + 2) × 3 - 40 ÷ 5 =", searchPage.getSearchmemory());
    }
    @Test
    public void test2() {
        driver.get("http://google.com");
        searchPage.searchInput.sendKeys("Калькулятор", Keys.ENTER);
        searchPage.six.click();
        searchPage.delit.click();
        searchPage.zero.click();
        searchPage.ravno.click();
        assertEquals("Infinity", searchPage.getSearchresalt());
        assertEquals("6 ÷ 0 =", searchPage.getSearchmemory());
    }
    @Test
    public void test3() {
        driver.get("http://google.com");
        searchPage.searchInput.sendKeys("Калькулятор", Keys.ENTER);
        searchPage.sin.click();
        searchPage.ravno.click();
        assertEquals("Error", searchPage.getSearchresalt());
        assertEquals("sin() =", searchPage.getSearchmemory());
    }
  @AfterAll
   public static void teardown(){
        driver.quit();
    }
}
