package pages.petstore;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FishPage extends CommonAPI {
    private final Logger LOG= LoggerFactory.getLogger(FishPage.class);

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


    //fishtypes info

    //Angelfish
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    private WebElement angelfish;
    //TigerShark
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")
    private WebElement tigershark;
    //Koi
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[4]/td[1]/a")
    private WebElement koi;
    //Koi
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[5]/td[1]/a")
    private WebElement goldfish;

    //types of angelfish
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    private WebElement largeangelfishdesc;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement largeangelfishtitle;

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")
    private WebElement smallangelfishdesc;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement smallangelfishtitle;


    //types of Tigershark
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    private WebElement toothlesstigersharkdesc;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement toothlesstigersharktitle;

    //shark atc
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[7]/td/a")
    private WebElement atcbuttonshark;


    //types of koi
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    private WebElement spotkoidesc;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement spotkoititle;

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")
    private WebElement nonspotkoidesc;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement nonspotkoititle;

    //types of Goldfish
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    private WebElement malegoldfishdesc;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement malegoldfishtitle;

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")
    private WebElement femalegoldfishdesc;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement femalegoldfishtitle;



    public FishPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

        public void setAngelfish(){
        click(angelfish);
        LOG.info("Selecting Angel Fish was sucessful");
        }
        public void setLargeangelfishdesc() {
            click(largeangelfishdesc);
            LOG.info("Successfully was able to view Large AngelFish Description");
        }
        public void setSmallangelfishdesc() {
        click(smallangelfishdesc);
        LOG.info("Successfully was able to view SmallAngelFish Description");
         }
         public void setTigershark() {
        click(tigershark);
         LOG.info("Selecting Shark was successful");
         }
        public void setToothlesstigersharkdesc() {
        click(toothlesstigersharkdesc);
        LOG.info("Successfully was able to view Toothless Shark Description");
          }
        public void sharkatcbtn() {
        click(atcbuttonshark);
        LOG.info("Successfully Able to click on ATC Button");
    }
        public void setKoi() {
        click(koi);
        LOG.info("Selecting koi was successful");
         }
         public void setNonspotkoidesc(){
         click(nonspotkoidesc);
         LOG.info("Successfully was able to view Non Spotted Koi Description");
        }
        public void setspotkoidesc(){
        click(spotkoidesc);
        LOG.info("Successfully was able to view Spotted Koi Description");
         }
        public void setGoldfish(){
        click(goldfish);
        LOG.info("Selecting koi was successful");
        }
        public void Malegoldfishdesc(){
        click(malegoldfishdesc);
        LOG.info("Successfully was able to view Male GoldFish Description");
        }
        public void Femalegoldfishdesc(){
        click(femalegoldfishdesc);
        LOG.info("Successfully was able to view Female GoldFish Description");
        }

    public String largeangelfishtitle(){ return getElementText(largeangelfishtitle); }
    public String smallangelfishtitle(){ return getElementText(smallangelfishtitle); }
    public String toothlesstigersharktitle(){ return getElementText(toothlesstigersharktitle); }
    public String spotkoititle(){ return getElementText(spotkoititle); }
    public String nonspotkoititle(){ return getElementText(nonspotkoititle); }
    public String malegoldfishtitle(){ return getElementText(malegoldfishtitle); }
    public String femalegoldfishtitle(){ return getElementText(femalegoldfishtitle); }







}
