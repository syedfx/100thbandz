package pages.petstore;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class RegistrationPage extends CommonAPI {
    private final Logger LOG= LoggerFactory.getLogger(RegistrationPage.class);

    // registration login
    @FindBy(xpath = "//input[@name='username']")
    private WebElement username;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;
    @FindBy(xpath = "//input[@name='repeatedPassword']")
    private WebElement repeatpassword;

    //account information login
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[1]/td[2]/input")
    private WebElement firstname;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[2]/td[2]/input")
    private WebElement lastname;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[3]/td[2]/input")
    private WebElement email;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[4]/td[2]/input")
    private WebElement phone;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[5]/td[2]/input")
    private WebElement address1;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[6]/td[2]/input")
    private WebElement address2;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[7]/td[2]/input")
    private WebElement city;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[8]/td[2]/input")
    private WebElement state;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[9]/td[2]/input")
    private WebElement zipcode;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[10]/td[2]/input")
    private WebElement country;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/input")
    private WebElement saveaccountbtn;

    //assertions xpaths
    @FindBy(xpath = "//h3[contains(text(),'Profile Information')]")
    private WebElement Profiletext;
    @FindBy(xpath = "//h3[contains(text(),'Profile Information')]")
    private WebElement Errortext;



    public RegistrationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setUsername(String item){
        type(username,item);
        LOG.info("Successfully was able to be in username field");
    }
    public void setPassword(String item){
        type(password,item);
        LOG.info("Successfully was able to be in password field");
    }
    public void setRepeatpassword(String item){
        type(repeatpassword,item);
        LOG.info("Successfully was able to be in Repeat PW field");
    }
    public void setFirstname(String item){
        type(firstname,item);
        LOG.info("Successfully was able to be in First Name field");
    }
    public void setLastname(String item){
        type(lastname,item);
        LOG.info("Successfully was able to be in Last Name field");
    }
    public void setEmail(String item){
        type(email,item);
        LOG.info("Successfully was able to be in email field");
    }
    public void setPhone(String item){
        type(phone,item);
        LOG.info("Successfully was able to be in Phone field");
    }
    public void setAddress1(String item){
        type(address1,item);
        LOG.info("Successfully was able to be in address1 field");
    }
    public void setAddress2(String item){
        type(address2,item);
        LOG.info("Successfully was able to be in address2 field");
    }
    public void setCity(String item){
        type(city,item);
        LOG.info("Successfully was able to be in city field");
    }
    public void setState(String item){
        type(state,item);
        LOG.info("Successfully was able to be in state field");
    }
    public void setZipcode(String item){
        type(zipcode,item);
        LOG.info("Successfully was able to be in zipcode field");
    }
    public void setCountry(String item){
        type(country,item);
        LOG.info("Successfully was able to be in Country field");
    }
    public void setSaveaccountbtn(){
        click(saveaccountbtn);
        LOG.info("Successfully was to click on Save Account Information");
    }

    public String Profiletext(){ return getElementText(Profiletext); }
    public String Errortext(){ return getElementText(Errortext); }
    public boolean saveAccountButtonFunction(){ return saveaccountbtn.isEnabled();}



}
