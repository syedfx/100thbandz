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
    private WebElement fishLink;
    @FindBy(xpath = "//*[@id=\"SidebarContent\"]/a[2]")
    private WebElement dogLink;
    @FindBy(xpath = "//*[@id=\"SidebarContent\"]/a[3]")
    private WebElement catsLink;
    @FindBy(xpath = "//*[@id=\"SidebarContent\"]/a[4]")
    private WebElement reptilesLink;
    @FindBy(xpath = "//*[@id=\"SidebarContent\"]/a[5]")
    private WebElement birdLink;
    @FindBy(xpath = "//*[@id=\"PoweredBy\"]/a")
    private WebElement blogLink;


    //cart, signin,help, signout, my account
    @FindBy(xpath = "//*[@id=\"MenuContent\"]/a[1]")
    private WebElement cart;
    @FindBy(xpath = "//*[@id=\"Cart\"]/h2")
    private WebElement cartTitle;

    @FindBy(xpath = "//*[@id=\"MenuContent\"]/a[2]")
    private WebElement signIn;
    @FindBy(xpath = "//*[@id=\"MenuContent\"]/a[3]")
    private WebElement help;
    @FindBy(xpath = "//*[@id=\"MenuContent\"]/a[2]")
    private WebElement signOut;
    @FindBy(xpath = "//*[@id=\"MenuContent\"]/a[3]")
    private WebElement myAccount;

    //search
    @FindBy(xpath = "//*[@id=\"SearchContent\"]/form/input[1]")
    private WebElement searchField;
    @FindBy(xpath = "//*[@id=\"SearchContent\"]/form/input[2]")
    private WebElement searchButton;
    //returntomainmenu
    @FindBy(xpath = "//*[@id=\"BackLink\"]/a")
    private WebElement returnMainMenu;

    //bloglocators
    @FindBy(xpath = "//*[@id=\"Blog1\"]/div[1]/div[1]/div/div/div/div[3]/div[1]/div/a[1]")
    private WebElement emailButton;
    @FindBy(xpath = "//*[@id=\"Blog1\"]/div[1]/div[1]/div/div/div/h3/a")
    private WebElement releaseLink;
    //blogheader
    @FindBy(xpath = "//*[@id=\"headingText\"]/span")
    private WebElement SignInTitle;
    @FindBy(xpath = "//*[@id=\"Blog1\"]/div[1]/div/div/div/div[1]/h3")
    private WebElement ReleaseTitle;

    //locatorstext searchtest
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[3]")
    private WebElement bullDogText;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[3]")
    private WebElement snakeText;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[3]")
    private WebElement fishText;





    public CatalogPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setReleaselink(){
            click(releaseLink);
            LOG.info("click to enter on Release link was succesful");
    }
    public void setBlogLink(){
        click(blogLink);
        LOG.info("Click on Blog link was successful");
    }

    public void setEmailButton(){
        click(emailButton);
        LOG.info("Click on email button was successful");
    }
    public void setReturnMainMenu(){
        click(returnMainMenu);
        LOG.info("Click on Return to main menu was successful");
    }
    public void clearField(){
        clear(searchField);
        LOG.info("successfully was able to clear search field");
    }

    public void setFishLink(){
        click(fishLink);
        LOG.info("Click on Fish Link was successful");

    }
    public void setSignIn(){
        click(signIn);
        LOG.info("Click on Sign in Link was successful");
    }

    public void setSignOut(){
        click(signOut);
        LOG.info("Successfully able to logout");
    }

    public void setMyAccount(){
        click(myAccount);
        LOG.info("Successfully able to access my account");
    }
    public void setDogLink(){
        click(dogLink);
        LOG.info("Click on Dogs Link was successful");
    }
    public void setCatsLink(){
        click(catsLink);
        LOG.info("Click on Cats Link was successful");
    }
    public void setReptilesLink(){
        click(reptilesLink);
        LOG.info("Click on Reptiles Link was successful");
    }
    public void setBirdLink(){
        click(birdLink);
        LOG.info("Click on Bird Link was successful");
    }
    public void enterSearch(String item){
        type(searchField,item);
        LOG.info("Successfully able to type in search field");
    }
    public void setSearchButton(){
        click(searchButton);
        LOG.info("Successfully able to click on Search");
    }
    public void setCart(){
        click(cart);
        LOG.info("Successfully able to click on cart button");
    }
    public String SignInTitle(){ return getElementText(SignInTitle);
    }
    public String ReleaseTitle(){return getElementText(ReleaseTitle);}
    public String bulldogText(){ return getElementText(bullDogText); }
    public String snakeText(){ return getElementText(snakeText); }
    public String fishText(){ return getElementText(fishText); }


    public void typeAndSearch(String text){
      typeAndEnter(searchField, text);
        LOG.info("Successfully able to type " + text + " and search");
    }

    public boolean logoutLinkFunction(){ return signOut.isEnabled();}
    public String cartTitle(){ return getElementText(cartTitle); }
    public boolean emailButtonFunction(){ return emailButton.isEnabled();}
    public boolean searchFieldBttnFunction(){ return searchButton.isEnabled();}
}