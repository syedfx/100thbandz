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
    private WebElement FaveCategory;

    //userinformation
    //new password



    @FindBy(xpath = "//*[@id=\"stripes--1784875822\"]")
    private WebElement newpassword;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table[1]/tbody/tr[3]/td[2]/input")
    private WebElement repeatnewpassword;

    //account information
    @FindBy(css = "input[name='account.firstName')")
    private WebElement firstname;
    @FindBy(css = "input[name='account.lastName')")
    private WebElement lastname;
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
    private WebElement saveaccountbtn;


    //my fave categories
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[2]/td[2]/select")
    private WebElement listdown;

    @FindBy(xpath = " //*[@id=\"Catalog\"]/form/table[3]/tbody/tr[2]/td[2]/select/option[1]")
    private WebElement favfish;
    @FindBy(xpath = " //*[@id=\"Catalog\"]/form/table[3]/tbody/tr[2]/td[2]/select/option[2]")
    private WebElement favdog;
    @FindBy(xpath = " //*[@id=\"Catalog\"]/form/table[3]/tbody/tr[2]/td[2]/select/option[3]")
    private WebElement favreptiles;
    @FindBy(xpath = " //*[@id=\"Catalog\"]/form/table[3]/tbody/tr[2]/td[2]/select/option[4]")
    private WebElement favcat;
    @FindBy(xpath = " //*[@id=\"Catalog\"]/form/table[3]/tbody/tr[2]/td[2]/select/option[5]")
    private WebElement favbird;

    //my Orders
    @FindBy(xpath = "//*[@id=\"Catalog\"]/a")
    private WebElement myorders;

    //assertions xpath favorite category my account
    @FindBy(xpath = "//td[contains(text(),'Favourite Category:')]")
    private WebElement favouritecategorytext;


    public MyAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void newpassword(String item){
        type(newpassword,item);
        LOG.info("Successfully able to type in new password");
    }
    public void newrepeatpassword(String item){
        type(repeatnewpassword,item);
        LOG.info("Successfully able to type in new password again");
    }
    public void FirstName(){
        click(firstname);
        LOG.info("successfully clicked inside First Name Field");
    }
    public void updatename(String item){
        type(firstname,item);
        LOG.info("Successfully able to update firstname");
    }
    public void ClearName(){
        clear(firstname);
        LOG.info("successfully cleared first name field");
    }
    public void LastName(){
        click(lastname);
        LOG.info("successfully clicked inside Last Name Field");
    }

    public void updatelastname(String item){
        type(lastname,item);
        LOG.info("Successfully able to update last name");
    }
    public void Clearlastname(){
        clear(lastname);
        LOG.info("successfully cleared last name");
    }
    public void Email(){
        click(email);
        LOG.info("successfully clicked inside Email Field");
    }
    public void updateEmail(String item){
        type(email,item);
        LOG.info("Successfully able to update email");
    }
    public void ClearEmail(){
        clear(email);
        LOG.info("successfully cleared email field");
    }
    public void ClearPhone(){
        clear(phone);
        LOG.info("successfully cleared phone field");
    }

    public void UpdatePhone(String item){
        type(phone,item);
        LOG.info("Successfully able to update phone number");
    }
    public void Phone(){
        click(phone);
        LOG.info("successfully clicked in phone field");
    }
    public void Address1(){
        click(address1);
        LOG.info("successfully clicked inside Address field");
    }
    public void UpdateAddress1(String item){
        type(address1,item);
        LOG.info("Successfully able to update Address 1");
    }
    public void ClearAddress1(){
        clear(address1);
        LOG.info("successfully cleared Address 1");
    }
    public void Address2(){
        click(address2);
        LOG.info("successfully clicked inside Address 2");
    }
    public void UpdateAddress2(String item){
        type(address2,item);
        LOG.info("Successfully able to update Address 2");
    }
    public void ClearAddress2(){
        clear(address2);
        LOG.info("successfully cleared Address 2");
    }
    public void City(){
        click(city);
        LOG.info("successfully clicked inside city Field");
    }
    public void UpdateCity(String item){
        type(city,item);
        LOG.info("Successfully able to update city");
    }
    public void ClearCity(){
        clear(city);
        LOG.info("successfully cleared city");
    }
    public void State(){
        click(state);
        LOG.info("successfully clicked inside State field");
    }
    public void UpdateState(String item){
        type(state,item);
        LOG.info("Successfully able to update State");
    }
    public void ClearState(){
        clear(state);
        LOG.info("successfully cleared State");
    }
    public void Zipcode(){
        click(zipcode);
        LOG.info("successfully clicked inside zipcode");
    }
    public void UpdateZip(String item){
        type(zipcode,item);
        LOG.info("Successfully able to update zipcode");
    }
    public void ClearZip(){
        clear(zipcode);
        LOG.info("successfully cleared zipcode");
    }
    public void Country(){
        click(country);
        LOG.info("successfully clicked inside Country Field");
    }
    public void UpdateCountry(String item){
        type(country,item);
        LOG.info("Successfully able to update country");
    }
    public void ClearCountry(){
        clear(country);
        LOG.info("successfully cleared country field");
    }
    public void ClickMyOrders(){
        click(myorders);
        LOG.info("Successfully able to to click on My Orders");
    }

    public void FavoriteCategories(){
        click(listdown);
        LOG.info("Successfully able to click from listdown");
    }
    public void FaveFish(){
        click(favfish);
        LOG.info("Successfully able to select Fish from Favorite Category");
    }
    public void FaveDog(){
        click(favdog);
        LOG.info("Successfully able to select Dog from Favorite Category");
    }
    public void FaveReptiles(){
        click(favreptiles);
        LOG.info("Successfully able to select Reptiles from Favorite Category");
    }

    public void FaveBird(){
        click(favbird);
        LOG.info("Successfully able to select Birds from Favorite Category");
    }
    public void FaveCat(){
        click(favcat);
        LOG.info("Successfully able to select Birds from Favorite Category");
    }

    public void SaveAccountInfoBttn(){
        click(saveaccountbtn);
        LOG.info("Successfully able to Save Account information");
    }

    public void setFaveCategory (String input) {
        selectFromDropdown(FaveCategory, input);
        LOG.info("successfully was able to sort through dropdown");
    }

    public void newPassWordField(){
        click(newpassword);
        LOG.info("Successfully able to Save Account information");
    }

    public void RepeatPassWordField(){
        click(repeatnewpassword);
        LOG.info("Successfully able to Save Account information");
    }

    public String favouritecategorytext(){ return getElementText(favouritecategorytext); }
    public boolean saveAccountButtonFunction(){ return saveaccountbtn.isEnabled();}



}
