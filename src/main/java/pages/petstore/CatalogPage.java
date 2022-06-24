package pages.petstore;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CatalogPage extends CommonAPI {
    private final Logger LOG=LoggerFactory.getLogger(CatalogPage.class);

    @FindBy(xpath = "a[href='actions/Catalog.action']")
    private WebElement cataloglink;


    //sidelinks
    @FindBy(xpath = "//*[@id=\"SidebarContent\"]/a[1]")
    private WebElement fishlink;
    @FindBy(xpath = "//*[@id=\"SidebarContent\"]/a[2]")
    private WebElement doglink;
    @FindBy(xpath = "//*[@id=\"SidebarContent\"]/a[3]")
    private WebElement catslink;
    @FindBy(xpath = "//*[@id=\"SidebarContent\"]/a[4]")
    private WebElement reptileslink;
    @FindBy(xpath = "//*[@id=\"SidebarContent\"]/a[5]")
    private WebElement birdlink;
    @FindBy(xpath = "//*[@id=\"PoweredBy\"]/a")
    private WebElement bloglink;


    //cart, signin,help, signout, my account
    @FindBy(xpath = "//*[@id=\"MenuContent\"]/a[1]")
    private WebElement cart;
    @FindBy(xpath = "//*[@id=\"MenuContent\"]/a[2]")
    private WebElement signin;
    @FindBy(xpath = "//*[@id=\"MenuContent\"]/a[3]")
    private WebElement help;
    @FindBy(xpath = "//*[@id=\"MenuContent\"]/a[2]")
    private WebElement signout;
    @FindBy(xpath = "//*[@id=\"MenuContent\"]/a[3]")
    private WebElement myaccount;

    //search
    @FindBy(xpath = "//*[@id=\"SearchContent\"]/form/input[1]")
    private WebElement searchfield;
    @FindBy(xpath = "//*[@id=\"SearchContent\"]/form/input[2]")
    private WebElement searchbutton;
    //returntomainmenu
    @FindBy(xpath = "//*[@id=\"BackLink\"]/a")
    private WebElement returnmainmenu;

    //bloglocators
    @FindBy(xpath = "//*[@id=\"Blog1\"]/div[1]/div[1]/div/div/div/div[3]/div[1]/div/a[1]")
    private WebElement emailbutton;
    @FindBy(xpath = "//*[@id=\"Blog1\"]/div[1]/div[1]/div/div/div/h3/a")
    private WebElement releaselink;
    //blogheader
    @FindBy(xpath = "//*[@id=\"headingText\"]/span")
    private WebElement SignInTitle;
    @FindBy(xpath = "//*[@id=\"Blog1\"]/div[1]/div/div/div/div[1]/h3")
    private WebElement ReleaseTitle;

    //locatorstext searchtest
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[3]")
    private WebElement bulldogText;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[3]")
    private WebElement snakeText;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[3]")
    private WebElement fishText;





    public CatalogPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setReleaselink(){
            click(releaselink);
            LOG.info("click to enter on Release link was succesful");
    }
    public void setBloglink(){
        click(bloglink);
        LOG.info("Click on Blog link was successful");
    }

    public void setEmailbutton(){
        click(emailbutton);
        LOG.info("Click on email button was successful");
    }
    public void setReturnmainmenu(){
        click(returnmainmenu);
        LOG.info("Click on Return to main menu was successful");
    }
    public void clearfield(){
        clear(searchfield);
        LOG.info("successfully was able to clear search field");
    }

    public void setFishlink(){
        click(fishlink);
        LOG.info("Click on Fish Link was successful");

    }
    public void setSignin(){
        click(signin);
        LOG.info("Click on Sign in Link was successful");
    }

    public void setSignout(){
        click(signin);
        LOG.info("Successfully able to logout");
    }

    public void setMyaccount(){
        click(myaccount);
        LOG.info("Successfully able to access my account");
    }
    public void setDoglink(){
        click(doglink);
        LOG.info("Click on Dogs Link was successful");
    }
    public void setCatslink(){
        click(catslink);
        LOG.info("Click on Cats Link was successful");
    }
    public void setReptileslink(){
        click(reptileslink);
        LOG.info("Click on Reptiles Link was successful");
    }
    public void setBirdlink(){
        click(birdlink);
        LOG.info("Click on Bird Link was successful");
    }
    public void entersearch(String item){
        type(searchfield,item);
        LOG.info("Successfully able to type in search field");
    }
    public void setSearchbutton(){
        click(searchbutton);
        LOG.info("Successfully able to click on Search");
    }
    public void setCart(){
        click(cart);
        LOG.info("Successfully able to click on cart button");
    }
    public String SignInTitle(){ return getElementText(SignInTitle);
    }
    public String ReleaseTitle(){return getElementText(ReleaseTitle);}
    public String bulldogText(){ return getElementText(bulldogText); }
    public String snakeText(){ return getElementText(snakeText); }
    public String fishText(){ return getElementText(fishText); }


    public void typeAndSearch(String text){
      typeAndEnter(searchfield, text);
        LOG.info("Successfully able to type " + text + " and search");
    }

}