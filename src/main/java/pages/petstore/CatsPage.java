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
    private WebElement fishBar;
    //dogs
    @FindBy(xpath = "//*[@id=\"QuickLinks\"]/a[2]/img")
    private WebElement dogBar;
    //reptiles
    @FindBy(xpath = "//*[@id=\"QuickLinks\"]/a[4]/img")
    private WebElement repBar;
    //dogs
    @FindBy(xpath = "//*[@id=\"QuickLinks\"]/a[4]/img")
    private WebElement catBar;
    @FindBy(xpath = "//*[@id=\"QuickLinks\"]/a[5]/img")
    private WebElement birdsBar;

    //Catstype info
    //Manx
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    private WebElement manx;
    //persian
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")
    private WebElement setPersian;

    //types of Manx
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    private WebElement tailessManx;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement tailessManxTitle;


    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")
    private WebElement tailManx;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement tailManxTitle;

    //types of Persian
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    private WebElement femalePersian;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement femalePersianTitle;

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")
    private WebElement malePersian;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement malePersianTitle;

    //atcpersian
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[7]/td/a")
    private WebElement atcFemalePersian;

    public CatsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setManx(){
        click(manx);
        LOG.info("Selecting Manx Cat was successful");
    }
    public void setTaillessManx() {
        click(tailessManx);
        LOG.info("Successfully was able to view Tailess Manx Cat");
    }
    public void setTailmanx() {
        click(tailManx);
        LOG.info("Successfully was able to click on with tail Manx Cat");
    }

    public void setPersian() {
        click(setPersian);
        LOG.info("Successfully was able to click on Persian Cats");
    }

    public void setMalepersian() {
        click(malePersian);
        LOG.info("Successfully was able to click Adult male persian cat");
    }
    public void femalepersian(){
        click(femalePersian);
        LOG.info("Successfully was able to click on Adult Female persian cat");
    }
    public void setAtcfemalepersian(){
        click(atcFemalePersian);
        LOG.info("Successfully was able to click on Add to Cart for Adult Female persian cat");
    }
    public String tailessManxTitle(){ return getElementText(tailessManxTitle); }
    public String tailManxTitle(){ return getElementText(tailManxTitle); }
    public String femalePersianTitle(){ return getElementText(femalePersianTitle); }
    public String malePersianTitle(){ return getElementText(malePersianTitle); }


}
