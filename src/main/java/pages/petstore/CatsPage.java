package pages.petstore;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CatsPage extends CommonAPI {
    private final Logger LOG= LoggerFactory.getLogger(CatsPage.class);

    //menu bar
    //fish
    @FindBy(xpath = "//*[@id=\"QuickLinks\"]/a[1]/img")
    private WebElement fishbar;
    //dogs
    @FindBy(xpath = "//*[@id=\"QuickLinks\"]/a[2]/img")
    private WebElement dogbar;
    //reptiles
    @FindBy(xpath = "//*[@id=\"QuickLinks\"]/a[4]/img")
    private WebElement repbar;
    //dogs
    @FindBy(xpath = "//*[@id=\"QuickLinks\"]/a[4]/img")
    private WebElement catbar;
    @FindBy(xpath = "//*[@id=\"QuickLinks\"]/a[5]/img")
    private WebElement birdsbar;

    //Catstype info
    //Manx
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    private WebElement manx;
    //persian
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")
    private WebElement setPersian;

    //types of Manx
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    private WebElement tailessmanx;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement TailessmanxTitle;


    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")
    private WebElement tailmanx;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement TailManxTitle;

    //types of Persian
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    private WebElement femalepersian;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement FemalepersianTitle;

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")
    private WebElement malepersian;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement MalePersianTitle;

    //atcpersian
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[7]/td/a")
    private WebElement atcfemalepersian;

    public CatsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setManx(){
        click(manx);
        LOG.info("Selecting Manx Cat was successful");
    }
    public void setTaillessManx() {
        click(tailessmanx);
        LOG.info("Successfully was able to view Tailess Manx Cat");
    }
    public void setTailmanx() {
        click(tailmanx);
        LOG.info("Successfully was able to click on with tail Manx Cat");
    }

    public void setPersian() {
        click(setPersian);
        LOG.info("Successfully was able to click on Persian Cats");
    }

    public void setMalepersian() {
        click(malepersian);
        LOG.info("Successfully was able to click Adult male persian cat");
    }
    public void femalepersian(){
        click(femalepersian);
        LOG.info("Successfully was able to click on Adult Female persian cat");
    }
    public void setAtcfemalepersian(){
        click(atcfemalepersian);
        LOG.info("Successfully was able to click on Add to Cart for Adult Female persian cat");
    }
    public String TailessmanxTitle(){ return getElementText(TailessmanxTitle); }
    public String TailManxTitle(){ return getElementText(TailManxTitle); }
    public String FemalepersianTitle(){ return getElementText(FemalepersianTitle); }
    public String MalePersianTitle(){ return getElementText(MalePersianTitle); }


}
