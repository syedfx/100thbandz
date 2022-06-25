package pages.petstore;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class FishPage extends CommonAPI {
    private final Logger LOG= LoggerFactory.getLogger(FishPage.class);

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
    //dog
    @FindBy(xpath = "//*[@id=\"QuickLinks\"]/a[4]/img")
    private WebElement catBar;
    @FindBy(xpath = "//*[@id=\"QuickLinks\"]/a[5]/img")
    private WebElement birdsBar;


    //fishtypes info

    //Angelfish
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    private WebElement angelFish;
    //TigerShark
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")
    private WebElement tigerShark;
    //Koi
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[4]/td[1]/a")
    private WebElement koi;
    //Koi
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[5]/td[1]/a")
    private WebElement goldFish;

    //types of angelfish
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    private WebElement largeAngelFishDesc;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement largeAngelFishTitle;

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")
    private WebElement smallAngelFishDesc;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement smallAngelFishTitle;


    //types of Tigershark
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    private WebElement toothlessTigerSharkDesc;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement toothlessTigerSharkTitle;

    //shark atc
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[7]/td/a")
    private WebElement atcButtonShark;


    //types of koi
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    private WebElement spotKoiDesc;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement spotKoiTitle;

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")
    private WebElement nonSpotKoiDesc;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement nonSpotKoiTitle;

    //types of Goldfish
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    private WebElement maleGoldFishDesc;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement maleGoldFishTitle;

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")
    private WebElement femaleGoldFishDesc;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement femaleGoldFishTitle;

   // ATCbutton for assertion after you click on pet description and add to cart
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[7]/td/a")
    private WebElement addToCartFishDesc;

    // Assertions for Description
    @FindBy(xpath = "//*[@id=\"Cart\"]/form/table/tbody/tr[1]/th[3]/b")
    private WebElement descriptionTitle;



    public FishPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

        public void setAngelfish(){
        click(angelFish);
        LOG.info("Selecting Angel Fish was sucessful");
        }
        public void setLargeAngelFishDesc() {
            click(largeAngelFishDesc);
            LOG.info("Successfully was able to view Large AngelFish Description");
        }
        public void setSmallAngelFishDesc() {
        click(smallAngelFishDesc);
        LOG.info("Successfully was able to view SmallAngelFish Description");
         }
         public void setTigerShark() {
        click(tigerShark);
         LOG.info("Selecting Shark was successful");
         }
        public void setToothlessTigerSharkDesc() {
        click(toothlessTigerSharkDesc);
        LOG.info("Successfully was able to view Toothless Shark Description");
          }
        public void sharkAtcBtn() {
        click(atcButtonShark);
        LOG.info("Successfully Able to click on ATC Button");
    }
        public void setKoi() {
        click(koi);
        LOG.info("Selecting koi was successful");
         }
         public void setNonspotKoiDesc(){
         click(nonSpotKoiDesc);
         LOG.info("Successfully was able to view Non Spotted Koi Description");
        }
        public void setSpotKoiDesc(){
        click(spotKoiDesc);
        LOG.info("Successfully was able to view Spotted Koi Description");
         }
        public void setGoldFish(){
        click(goldFish);
        LOG.info("Selecting koi was successful");
        }
        public void maleGoldFishDesc(){
        click(maleGoldFishDesc);
        LOG.info("Successfully was able to view Male GoldFish Description");
        }
        public void femaleGoldFishDesc(){
        click(femaleGoldFishDesc);
        LOG.info("Successfully was able to view Female GoldFish Description");
        }

    public String largeAngelFishTitle(){ return getElementText(largeAngelFishTitle); }
    public String smallAngelFishTitle(){ return getElementText(smallAngelFishTitle); }
    public String toothlessTigerSharkTitle(){ return getElementText(toothlessTigerSharkTitle); }
    public String spotKoiTitle(){ return getElementText(spotKoiTitle); }
    public String nonSpotKoiTitle(){ return getElementText(nonSpotKoiTitle); }
    public String maleGoldFishTitle(){ return getElementText(maleGoldFishTitle); }
    public String femaleGoldFishTitle(){ return getElementText(femaleGoldFishTitle); }
    public String descriptionTitle(){ return getElementText(descriptionTitle); }


    public boolean addToCartFishDescFunction(){ return addToCartFishDesc.isEnabled();}








}
