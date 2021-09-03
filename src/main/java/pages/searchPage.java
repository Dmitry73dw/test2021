package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import static org.openqa.selenium.support.PageFactory.initElements;

public class searchPage {

    @FindBy (css = "input.gLFyf.gsfi")
    public WebElement searchInput;


    @FindBy (css = "div[jsname=j93WEe]")
    public WebElement openbracket ;

    @FindBy (css = "div[jsname=N10B9]")
    public WebElement one;

    @FindBy (css = "div[jsname=XSr6wc]")
    public WebElement plus;

    @FindBy (css = "div[jsname=lVjWed]")
    public WebElement two;

    @FindBy (css = "div[jsname=qCp9A]")
    public WebElement closebracket;

    @FindBy (css = "div[jsname=YovRWb]")
    public WebElement ymnog;

    @FindBy (css = "div[jsname=KN1kY]")
    public WebElement tri;

    @FindBy (css = "div[jsname=pPHzQc]")
    public WebElement minys;

    @FindBy (css = "div[jsname=xAP7E]")
    public WebElement fo;

    @FindBy (css = "div[jsname=bkEvMb]")
    public WebElement zero;

    @FindBy (css = "div[jsname=WxTTNd]")
    public WebElement delit;

    @FindBy (css = "div[jsname=Ax5wH]")
    public WebElement fife;

    @FindBy (css = "div[jsname=Pt8tGc]")
    public WebElement ravno;

    @FindBy (css = "div[jsname=abcgof]")
    public WebElement six;

    @FindBy (css = "div[jsname=aN1RFf]")
    public WebElement sin;


    @FindBy (css = "#cwos.qv3Wpe")
    private WebElement searchresalt;

    @FindBy (css = "span.vUGUtc")
    private WebElement searchmemory;

    public String getSearchresalt(){
      return   searchresalt.getText();
    }
    public String getSearchmemory(){
        return   searchmemory.getText();
    }

    public searchPage(WebDriver driver) {
        initElements(driver, this);
    }
}
