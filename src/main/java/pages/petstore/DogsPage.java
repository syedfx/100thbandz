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
    private WebElement fishbar;
    //dogs
    @FindBy(xpath = "//*[@id=\"QuickLinks\"]/a[2]/img")
    private WebElement dogbar;
    //reptiles
    @FindBy(xpath = "//*[@id=\"QuickLinks\"]/a[4]/img")
    private WebElement repbar;
    //cats
    @FindBy(xpath = "//*[@id=\"QuickLinks\"]/a[4]/img")
    private WebElement catbar;
    //birds
    @FindBy(xpath = "//*[@id=\"QuickLinks\"]/a[5]/img")
    private WebElement birdsbar;

    //dogtypes info
    //bulldog
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    private WebElement bulldog;
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
    private WebElement malebulldog;
    //assertion for malebulldog
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement Malebulldogtitle;

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")
    private WebElement femalebulldog;
    //assertion for femalebulldog
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement Femalebulldogtitle;

    //types of poodle
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    private WebElement malepoodle;
    //assertion for poodle
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement Poodledogtitle;

    //types of dalmation
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    private WebElement nonspotdalmation;
    //assertion
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement SpotlessDalmationtitle;

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")
    private WebElement spotteddalmation;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement SpottedDalmationtitle;

    //types of Golden Retriever
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    private WebElement femalegolden;
    //assertion
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement Goldendogtitle;

    //types of Labrador Retriever
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    private WebElement adultmalelabrador;

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")
    private WebElement adultfemalelabrador;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement AdultFemaleLabradogtitle;

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[4]/td[1]/a")
    private WebElement raremalelabrador;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement RareMaledogtitle;

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[5]/td[1]/a")
    private WebElement rarefemalelabrador;

    //types of Chihuahua
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    private WebElement malechihuahua;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement MaleChihuahuaTitle;

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")
    private WebElement femalechihuahua;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement FemaleChihuahuaTitle;



    //bulldogatc
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[7]/td/a")
    private WebElement Malebulldogatc;


    public DogsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void Bulldogs(){
        click(bulldog);
        LOG.info("Selecting Angel Fish was successful");
    }
    public void MaleAdultBullDog() {
        click(malebulldog);
        LOG.info("Successfully was able to view Male Adult BullDog Description");
    }
    public void FemalePuppyBullDog() {
        click(femalebulldog);
        LOG.info("Successfully was able to view Female Puppy BullDog Description");
    }
    public void Poodle() {
        click(poodle);
        LOG.info("Selecting Poodle was successful");
    }
    public void MalePuppyPoodle() {
        click(malepoodle);
        LOG.info("Successfully was able to view Male Puppy Poodle Description");
    }
    public void Dalmation() {
        click(dalmation);
        LOG.info("Selecting Dalmation was successful");
    }
    public void MaleDalmation(){
        click(nonspotdalmation);
        LOG.info("Successfully was able to view Spotless Male Puppy Dalmation Description");
    }
    public void FemaleDalmation(){
        click(spotteddalmation);
        LOG.info("Successfully was able to view Spotless Male Puppy Dalmation Description");
    }
    public void GoldenRetriever(){
        click(golden);
        LOG.info("Selecting GoldenRetriever was successful");
    }
    public void FemaleGolden(){
        click(femalegolden);
        LOG.info("Successfully was able to view Adult Female Golden Retriever");
    }
    public void LabradorRetriever(){
        click(labrador);
        LOG.info("Selecting Labrador Retriever was successful");
    }
    public void AdultMaleRetriever(){
        click(adultmalelabrador);
        LOG.info("Successfully was able to view Adult Male Labrador Retriever");
    }
    public void AdultFemaleRetriever(){
        click(adultfemalelabrador);
        LOG.info("Successfully was able to view Adult Female Labrador Retriever");
    }

    public void RareMaleLabrador(){
        click(raremalelabrador);
        LOG.info("Successfully was able to view Rare Adult Male Labrador Retriever");
    }


    public void RareFemaleLabrador(){
        click(rarefemalelabrador);
        LOG.info("Successfully was able to view Rare Adult Female Labrador Retriever");
    }
    public void Chihuahua(){
        click(chihuahua);
        LOG.info("Selecting Chihuahua was successful");
    }
    public void  MaleChihuahua(){
        click(malechihuahua);
        LOG.info("Successfully was able to view Adult Male Chohuahua");
    }
    public void  FemaleChihuahua(){
        click(femalechihuahua);
        LOG.info("Successfully was able to view Adult Male Chohuahua");
    }
    public void  atcMaleBulldog(){
        click(Malebulldogatc);
        LOG.info("Successfully was able to click on Add to cart Male Adult BullDog");
    }

    //assertion method
    public String MaleBullDogTitle(){ return getElementText(Malebulldogtitle);
    }
    public String Femalebulldogtitle(){return getElementText(Femalebulldogtitle);}
    public String Poodledogtitle(){return getElementText(Poodledogtitle);}
    public String SpotlessDalmationtitle(){return getElementText(SpotlessDalmationtitle);}
    public String SpottedDalmationtitle(){return getElementText(SpottedDalmationtitle);}
    public String Goldendogtitle(){return getElementText(Goldendogtitle);}
    public String RareMaledogtitle(){return getElementText(RareMaledogtitle);}
    public String AdultFemaleLabradogtitle(){return getElementText(AdultFemaleLabradogtitle);}
    public String MaleChihuahuaTitle(){return getElementText(MaleChihuahuaTitle);}
    public String FemaleChihuahuaTitle(){return getElementText(FemaleChihuahuaTitle);}










}
