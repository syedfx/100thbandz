package pages.petstore;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyAccountPage extends CommonAPI {
    private final Logger LOG= LoggerFactory.getLogger(MyAccountPage.class);

    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[2]/td[2]/select")
    private WebElement faveCategory;

    //userinformation
    //new password



    @FindBy(xpath = "//*[@id=\"stripes--1784875822\"]")
    private WebElement newPassword;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table[1]/tbody/tr[3]/td[2]/input")
    private WebElement repeatNewPassword;

    //account information
    @FindBy(css = "input[name='account.firstName')")
    private WebElement firstName;
    @FindBy(css = "input[name='account.lastName')")
    private WebElement lastName;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[3]/td[2]/input")
    private WebElement email;
    @FindBy(xpath= "//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[4]/td[2]/input")
    private WebElement phone;

    @FindBy(xpath = "input[name='account.address1")
    private WebElement address1;
    @FindBy(css = "input[name='account.address2')")
    private WebElement address2;
    @FindBy(css = "input[name='account.city')")
    private WebElement city;
    @FindBy(css = "input[name='account.state')")
    private WebElement state;
    @FindBy(css = "input[name='account.zip')")
    private WebElement zipcode;
    @FindBy(css = "input[name='account.country')")
    private WebElement country;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/input")
    private WebElement saveAccountBtn;


    //my fave categories
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[2]/td[2]/select")
    private WebElement listDown;

    @FindBy(xpath = " //*[@id=\"Catalog\"]/form/table[3]/tbody/tr[2]/td[2]/select/option[1]")
    private WebElement favFish;
    @FindBy(xpath = " //*[@id=\"Catalog\"]/form/table[3]/tbody/tr[2]/td[2]/select/option[2]")
    private WebElement favDog;
    @FindBy(xpath = " //*[@id=\"Catalog\"]/form/table[3]/tbody/tr[2]/td[2]/select/option[3]")
    private WebElement favReptiles;
    @FindBy(xpath = " //*[@id=\"Catalog\"]/form/table[3]/tbody/tr[2]/td[2]/select/option[4]")
    private WebElement favCat;
    @FindBy(xpath = " //*[@id=\"Catalog\"]/form/table[3]/tbody/tr[2]/td[2]/select/option[5]")
    private WebElement favBird;

    //my Orders
    @FindBy(xpath = "//*[@id=\"Catalog\"]/a")
    private WebElement myOrders;

    //assertions xpath favorite category my account
    @FindBy(xpath = "//td[contains(text(),'Favourite Category:')]")
    private WebElement favouriteCategoryText;


    public MyAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void newPassword(String item){
        type(newPassword,item);
        LOG.info("Successfully able to type in new password");
    }
    public void newRepeatpassword(String item){
        type(repeatNewPassword,item);
        LOG.info("Successfully able to type in new password again");
    }
    public void firstName(){
        click(firstName);
        LOG.info("successfully clicked inside First Name Field");
    }
    public void updateName(String item){
        type(firstName,item);
        LOG.info("Successfully able to update firstname");
    }
    public void clearName(){
        clear(firstName);
        LOG.info("successfully cleared first name field");
    }
    public void lastName(){
        click(lastName);
        LOG.info("successfully clicked inside Last Name Field");
    }

    public void updateLastName(String item){
        type(lastName,item);
        LOG.info("Successfully able to update last name");
    }
    public void clearLastName(){
        clear(lastName);
        LOG.info("successfully cleared last name");
    }
    public void email(){
        click(email);
        LOG.info("successfully clicked inside Email Field");
    }
    public void updateEmail(String item){
        type(email,item);
        LOG.info("Successfully able to update email");
    }
    public void clearEmail(){
        clear(email);
        LOG.info("successfully cleared email field");
    }
    public void clearPhone(){
        clear(phone);
        LOG.info("successfully cleared phone field");
    }

    public void updatePhone(String item){
        type(phone,item);
        LOG.info("Successfully able to update phone number");
    }
    public void phone(){
        click(phone);
        LOG.info("successfully clicked in phone field");
    }
    public void address1(){
        click(address1);
        LOG.info("successfully clicked inside Address field");
    }
    public void updateAddress1(String item){
        type(address1,item);
        LOG.info("Successfully able to type in update Address 1 field");
    }
    public void clearAddress1(){
        clear(address1);
        LOG.info("successfully cleared Address 1 field");
    }
    public void address2(){
        click(address2);
        LOG.info("successfully clicked inside of Address 2");
    }
    public void updateAddress2(String item){
        type(address2,item);
        LOG.info("Successfully able to update Address 2");
    }
    public void clearAddress2(){
        clear(address2);
        LOG.info("successfully cleared Address 2");
    }
    public void city(){
        click(city);
        LOG.info("successfully clicked inside of city Field");
    }
    public void updateCity(String item){
        type(city,item);
        LOG.info("Successfully able to update city");
    }
    public void clearCity(){
        clear(city);
        LOG.info("successfully cleared city field");
    }
    public void state(){
        click(state);
        LOG.info("successfully clicked inside State field");
    }
    public void updateState(String item){
        type(state,item);
        LOG.info("Successfully able to update State field");
    }
    public void clearState(){
        clear(state);
        LOG.info("successfully cleared State field");
    }
    public void zipcode(){
        click(zipcode);
        LOG.info("successfully clicked inside zipcode");
    }
    public void updateZip(String item){
        type(zipcode,item);
        LOG.info("Successfully able to update zipcode");
    }
    public void clearZip(){
        clear(zipcode);
        LOG.info("successfully cleared zipcode");
    }
    public void country(){
        click(country);
        LOG.info("successfully clicked inside Country Field");
    }
    public void updateCountry(String item){
        type(country,item);
        LOG.info("Successfully able to update country");
    }
    public void clearCountry(){
        clear(country);
        LOG.info("successfully cleared country field");
    }
    public void clickMyOrders(){
        click(myOrders);
        LOG.info("Successfully able to to click on My Orders");
    }

    public void favoriteCategories(){
        click(listDown);
        LOG.info("Successfully able to click from listdown");
    }
    public void faveFish(){
        click(favFish);
        LOG.info("Successfully able to select Fish from Favorite Category");
    }
    public void faveDog(){
        click(favDog);
        LOG.info("Successfully able to select Dog from Favorite Category");
    }
    public void faveReptiles(){
        click(favReptiles);
        LOG.info("Successfully able to select Reptiles from Favorite Category");
    }

    public void faveBird(){
        click(favBird);
        LOG.info("Successfully able to select Birds from Favorite Category");
    }
    public void faveCat(){
        click(favCat);
        LOG.info("Successfully able to select Birds from Favorite Category");
    }

    public void saveAccountInfoBttn(){
        click(saveAccountBtn);
        LOG.info("Successfully able to Save Account information");
    }

    public void setFaveCategory (String input) {
        selectFromDropdown(faveCategory, input);
        LOG.info("successfully was able to sort through dropdown");
    }

    public void newPassWordField(){
        click(newPassword);
        LOG.info("Successfully able to Save Account information");
    }

    public void repeatPassWordField(){
        click(repeatNewPassword);
        LOG.info("Successfully able to type in repeatpassword");
    }

    public String favouriteCategoryText(){ return getElementText(favouriteCategoryText); }
    public boolean saveAccountButtonFunction(){ return saveAccountBtn.isEnabled();}



}
