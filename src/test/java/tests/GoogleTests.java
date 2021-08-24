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
        searchPage.openbracket.sendKeys("1+5", Keys.ENTER);
    }
  // @AfterAll
 //   public static void teardown(){
  //      driver.quit();
   // }
}
