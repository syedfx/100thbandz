package pages.petstore;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BirdsPage extends CommonAPI {
    private final Logger LOG= LoggerFactory.getLogger(ReptilesPage.class);

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

    //birdtype
    //Amazonparrot
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    private WebElement amazonParrot;
    //finch
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")
    private WebElement finch ;

    //parrot info
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    private WebElement maleAdultAmazonParrot;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement maleAdultAmazonParrotTitle;

    //finch info
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    private WebElement maleAdultFinch;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement maleAdultFinchTitle;


    //atcbutton parrot
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[7]/td/a")
    private WebElement atcButtonParrot;

    //atcbutton parrot1
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")
    private WebElement atcButtonParrot1;

    //description
    @FindBy(xpath = "//*[@id=\"Cart\"]/form/table/tbody/tr[1]/th[3]/b")
    private WebElement descriptionTitle;

    public BirdsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setAmazonParrot(){
        click(amazonParrot);
        LOG.info("Selecting Amazon Parrot was successful");
    }
    public void setMaleAdultAmazonParrot() {
        click(maleAdultAmazonParrot);
        LOG.info("Successfully was able to view Adult Male Amazon Parrot");
    }
    public void setFinch(){
        click(finch);
        LOG.info("Selecting Finch was successful");
    }
    public void setMaleAdultFinch(){
        click(maleAdultFinch);
        LOG.info("Successfully Male Adult Finch was successful");
    }

    public void setAtcButton(){
        click(atcButtonParrot);
        LOG.info("Successfully was able to add to cart Parrot");
    }
    public void setAtcbutton1(){
        click(atcButtonParrot1);
        LOG.info("Successfully was able to add to cart Parrot");

    }
    public String MaleAdultAmazonParrotTitle(){ return getElementText(maleAdultAmazonParrotTitle); }
    public String MaleAdultFinchTitle(){ return getElementText(maleAdultFinchTitle);}
        public String DescriptionTitle(){return getElementText(descriptionTitle);}

}

