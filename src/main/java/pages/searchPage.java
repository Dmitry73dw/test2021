package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import static org.openqa.selenium.support.PageFactory.initElements;

public class searchPage {

    @FindBy (css = "input.gLFyf.gsfi")
    public WebElement searchInput;

    @FindBy (css = "div.BRpYC div.TIGsTb")
    public WebElement openbracket ;


    public searchPage(WebDriver driver) {
        initElements(driver, this);
    }
}
