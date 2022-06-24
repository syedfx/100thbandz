package pages.petstore;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ReptilesPage extends CommonAPI {
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

    //Reptiles info
    //Rattlesnake
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    private WebElement rattlesnake;
    //Iguana
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")
    private WebElement iguana ;

    //types of Rattlesnakes
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    private WebElement venomsnake;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement VenomSnakeTitle;

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")
    private WebElement nonrattlesnake;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement NonRattleSnakeTitle;


    //types of Iguana
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")
    private WebElement greeniguana;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td/b/font")
    private WebElement GreenIguanaTitle;

    //atcvenomlessrattlesnake
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[7]/td/a")
    private WebElement atcVenomlesssnake;

    public ReptilesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setRattlesnake(){
        click(rattlesnake);
        LOG.info("Selecting Manx Cat was successful");
    }
    public void setVenomsnake() {
        click(venomsnake);
        LOG.info("Successfully was able to view Venomless snake");
    }
    public void setNonrattlesnake() {
        click(nonrattlesnake);
        LOG.info("Successfully was able to click on rattleless Rattlesnake");
    }
    public void setIguana(){
        click(iguana);
        LOG.info("Selecting Iguana was successful");
    }
    public void setGreeniguana() {
        click(greeniguana);
        LOG.info("Successfully was able to view Green Iguana");
    }
    public void atcVenomlessSnake() {
        click(atcVenomlesssnake);
        LOG.info("Successfully was able to click on ATC button");
    }
    public String VenomSnakeTitle(){ return getElementText(VenomSnakeTitle);
    }
    public String NonRattleSnakeTitle(){ return getElementText(NonRattleSnakeTitle);
    }
    public String GreenIguanaTitle(){ return getElementText(GreenIguanaTitle);
    }


}
