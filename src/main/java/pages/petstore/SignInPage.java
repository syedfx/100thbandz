package pages.petstore;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SignInPage extends CommonAPI {

    private final Logger LOG= LoggerFactory.getLogger(SignInPage.class);

    @FindBy(css = "input[name='username']")
    private WebElement username;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/p[2]/input[2]")
    private WebElement password;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/input")
    private WebElement loginbutton;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/a")
    private WebElement registernow;
    @FindBy(xpath = "//*[@id=\"LogoContent\"]/a/img")
    private WebElement returntohomeimg;
    @FindBy(xpath = "//li[contains(text(),'Signon failed.')]")
    private WebElement Invalidtext;

    @FindBy(xpath = "//div[@id='WelcomeContent']")
    private WebElement WelcomeText;


    public SignInPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void setRegisternow(){
        click(registernow);
        LOG.info("Click on register now Link was successful");
    }

    public void setUsername(String item) {
        type(username, item);
        LOG.info("successfully was able to type in username");
    }

    public void ClearPassword(){
        clear(password);
        LOG.info("successfully cleared pw field");
    }

    public void setPassword(String item){
        type(password,item);
        LOG.info("successfully was able to type in password");
    }
    public void Loginbttn(){
        click(loginbutton);
        LOG.info("Click on Login button was successful");
    }

    public String Invalidtext(){ return getElementText(Invalidtext); }
    public String WelcomeText(){ return getElementText(WelcomeText); }





}
