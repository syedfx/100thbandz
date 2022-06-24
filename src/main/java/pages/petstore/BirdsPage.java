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
    private WebElement MaleAdultAmazonParrotTitle;

    //finch info
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    private WebElement maleAdultFinch;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement MaleAdultFinchTitle;


    //atcbutton parrot
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[7]/td/a")
    private WebElement atcbuttonparrot;

    //atcbutton parrot1
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")
    private WebElement atcbuttonparrot1;

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

    public void setAtcbutton(){
        click(atcbuttonparrot);
        LOG.info("Successfully was able to add to cart Parrot");
    }
    public void setAtcbutton1(){
        click(atcbuttonparrot1);
        LOG.info("Successfully was able to add to cart Parrot");

    }
    public String MaleAdultAmazonParrotTitle(){ return getElementText(MaleAdultAmazonParrotTitle); }
    public String MaleAdultFinchTitle(){ return getElementText(MaleAdultFinchTitle);
    }


}
