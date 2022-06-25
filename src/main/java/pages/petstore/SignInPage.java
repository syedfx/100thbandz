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
    private WebElement loginButton;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/a")
    private WebElement registerNow;
    @FindBy(xpath = "//*[@id=\"LogoContent\"]/a/img")
    private WebElement returnToHomeImg;
    @FindBy(xpath = "//li[contains(text(),'Signon failed.')]")
    private WebElement invalidText;

    @FindBy(xpath = "//div[@id='WelcomeContent']")
    private WebElement welcomeText;


    public SignInPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void setRegisterNow(){
        click(registerNow);
        LOG.info("Click on register now Link was successful");
    }

    public void setUsername(String item) {
        type(username, item);
        LOG.info("successfully was able to type in username");
    }

    public void clearPassword(){
        clear(password);
        LOG.info("successfully cleared password field");
    }

    public void setPassword(String item){
        type(password,item);
        LOG.info("successfully was able to type in password");
    }
    public void loginBttn(){
        click(loginButton);
        LOG.info("Click on Login button was successful");
    }

    public String invalidText(){ return getElementText(invalidText); }
    public String welcomeText(){ return getElementText(welcomeText); }
    public boolean loginLinkFunction(){ return loginButton.isEnabled();}






}
