package pages.petstore;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DogsPage extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(FishPage.class);
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
    //cats
    @FindBy(xpath = "//*[@id=\"QuickLinks\"]/a[4]/img")
    private WebElement catBar;
    //birds
    @FindBy(xpath = "//*[@id=\"QuickLinks\"]/a[5]/img")
    private WebElement birdsBar;

    //dogtypes info
    //bulldog
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    private WebElement bullDog;
    //poodle
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")
    private WebElement poodle;
    //dalmation
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[4]/td[1]/a")
    private WebElement dalmation;
    //golden
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[5]/td[1]/a")
    private WebElement golden;
    //labrador
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[6]/td[1]/a")
    private WebElement labrador;
    //chihuahua
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[7]/td[1]/a")
    private WebElement chihuahua;

    //types of bulldog
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    private WebElement maleBulldog;
    //assertion for maleBulldog
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement maleBulldogTitle;

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")
    private WebElement femaleBulldog;
    //assertion for femaleBulldog
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement femaleBulldogTitle;

    //types of poodle
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    private WebElement malePoodle;
    //assertion for poodle
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement poodleDogTitle;

    //types of dalmation
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    private WebElement nonSpotDalmation;
    //assertion
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement spotlessDalmationTitle;

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")
    private WebElement spottedDalmation;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement spottedDalmationTitle;

    //types of Golden Retriever
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    private WebElement femaleGolden;
    //assertion
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement goldenDogTitle;

    //types of Labrador Retriever
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    private WebElement adultMaleLabrador;

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")
    private WebElement adultFemaleLabrador;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement adultFemaleLabraDogTitle;

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[4]/td[1]/a")
    private WebElement rareMaleLabrador;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement rareMaleDogTitle;

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[5]/td[1]/a")
    private WebElement rareFemaleLabrador;

    //types of Chihuahua
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    private WebElement maleChihuahua;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement maleChihuahuaTitle;

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")
    private WebElement femaleChihuahua;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement femaleChihuahuaTitle;



    //bulldogatc
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[7]/td/a")
    private WebElement maleBullDogAtc;


    public DogsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void bullDogs(){
        click(bullDog);
        LOG.info("Selecting Bulldog was successful");
    }
    public void maleAdultBullDog() {
        click(maleBulldog);
        LOG.info("Successfully was able to view Male Adult BullDog Description");
    }
    public void femalePuppyBullDog() {
        click(femaleBulldog);
        LOG.info("Successfully was able to view Female Puppy BullDog Description");
    }
    public void poodle() {
        click(poodle);
        LOG.info("Selecting Poodle was successful");
    }
    public void malePuppyPoodle() {
        click(malePoodle);
        LOG.info("Successfully was able to view Male Puppy Poodle Description");
    }
    public void dalmation() {
        click(dalmation);
        LOG.info("Selecting Dalmation was successful");
    }
    public void maleDalmation(){
        click(nonSpotDalmation);
        LOG.info("Successfully was able to view Spotless Male Puppy Dalmation Description");
    }
    public void femaleDalmation(){
        click(spottedDalmation);
        LOG.info("Successfully was able to view Spotless Male Puppy Dalmation Description");
    }
    public void goldenRetriever(){
        click(golden);
        LOG.info("Selecting GoldenRetriever was successful");
    }
    public void femaleGolden(){
        click(femaleGolden);
        LOG.info("Successfully was able to view Adult Female Golden Retriever");
    }
    public void labradorRetriever(){
        click(labrador);
        LOG.info("Selecting Labrador Retriever was successful");
    }
    public void adultMaleRetriever(){
        click(adultMaleLabrador);
        LOG.info("Successfully was able to view Adult Male Labrador Retriever");
    }
    public void adultFemaleRetriever(){
        click(adultFemaleLabrador);
        LOG.info("Successfully was able to view Adult Female Labrador Retriever");
    }

    public void rareMaleLabrador(){
        click(rareMaleLabrador);
        LOG.info("Successfully was able to view Rare Adult Male Labrador Retriever");
    }

    public void rareFemaleLabrador(){
        click(rareFemaleLabrador);
        LOG.info("Successfully was able to view Rare Adult Female Labrador Retriever");
    }
    public void chihuahua(){
        click(chihuahua);
        LOG.info("Selecting Chihuahua was successful");
    }
    public void  maleChihuahua(){
        click(maleChihuahua);
        LOG.info("Successfully was able to view Adult Male Chohuahua");
    }
    public void  femaleChihuahua(){
        click(femaleChihuahua);
        LOG.info("Successfully was able to view Adult Male Chohuahua");
    }
    public void  atcMaleBulldog(){
        click(maleBullDogAtc);
        LOG.info("Successfully was able to click on Add to cart Male Adult BullDog");
    }

    //assertion method
    public String maleBulldogTitle(){ return getElementText(maleBulldogTitle);
    }
    public String femaleBulldogTitle(){return getElementText(femaleBulldogTitle);}
    public String poodleDogTitle(){return getElementText(poodleDogTitle);}
    public String spotlessDalmationTitle(){return getElementText(spotlessDalmationTitle);}
    public String spottedDalmationTitle(){return getElementText(spottedDalmationTitle);}
    public String goldenDogTitle(){return getElementText(goldenDogTitle);}
    public String rareMaledogTitle(){return getElementText(rareMaleDogTitle);}
    public String adultFemaleLabradogTitle(){return getElementText(adultFemaleLabraDogTitle);}
    public String maleChihuahuaTitle(){return getElementText(maleChihuahuaTitle);}
    public String femaleChihuahuaTitle(){return getElementText(femaleChihuahuaTitle);}










}
