package pages.petstore;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CheckOutPage extends CommonAPI {


    private final Logger LOG= LoggerFactory.getLogger(CheckOutPage.class);


    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table/tbody/tr[2]/td[2]/select")
    private WebElement CardSelection;

//continuebutton to go to paymentdetails
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/input")
    private WebElement continuebutton;

    //confirmbutton to complete order
    @FindBy(xpath = "//*[@id=\"Catalog\"]/a")
    private WebElement confirmOrderbtn2;

    //click button shiptodifferent address
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table/tbody/tr[14]/td/input")
    private WebElement shipdiffaddy;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/input")
    private WebElement continuebuttonshippingaddress;



    //ShippingAddressForm
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table/tbody/tr[2]/td[2]/input")
    private WebElement firstNameshipdiffaddy;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table/tbody/tr[3]/td[2]/input")
    private WebElement lastNameshipdiffaddy;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table/tbody/tr[4]/td[2]/input")
    private WebElement address1shipdiffaddy;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table/tbody/tr[5]/td[2]/input")
    private WebElement address2shipdiffaddy;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table/tbody/tr[6]/td[2]/input")
    private WebElement cityshipdiffaddy;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table/tbody/tr[7]/td[2]/input")
    private WebElement statediffaddy;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table/tbody/tr[8]/td[2]/input")
    private WebElement zipcodediffaddy;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table/tbody/tr[9]/td[2]/input")
    private WebElement countrydiffaddy;

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[26]/td/table/tbody/tr[1]/th[2]")
    private WebElement description;




    public CheckOutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);}

    public void setContinuebutton(){
        click(continuebutton);
        LOG.info("Click on continue button was successful");
    }

    public void setCardSelection (String input) {
        selectFromDropdown(CardSelection, input);
        LOG.info("successfully was able to sort through dropdown");
    }
    public void setConfirmOrderbtn2(){
        click(confirmOrderbtn2);
        LOG.info("Click on confirm order button was successful");
    }

    public void setShipdiffaddy(){
        click(shipdiffaddy);
        LOG.info("Click on Ship to Different Address successful");
    }
//shipping address methods

    public void ClearFirstName(){
        clear(firstNameshipdiffaddy);
        LOG.info("successfully cleared First Name field");
    }
    public void setFirstName(String item) {
        type(firstNameshipdiffaddy, item);
        LOG.info("successfully was able to type in First Name");
    }
    public void ClearLastName(){
        clear(lastNameshipdiffaddy);
        LOG.info("successfully cleared Last Name field");
    }
    public void setLastName(String item) {
        type(lastNameshipdiffaddy, item);
        LOG.info("successfully was able to type in LastName");
    }
    public void ClearAddress1(){
        clear(address1shipdiffaddy);
        LOG.info("successfully cleared Address1 field");
    }
    public void setAddress1(String item) {
        type(address1shipdiffaddy, item);
        LOG.info("successfully was able to type in Address1");
    }
    public void ClearAddress2(){
        clear(address2shipdiffaddy);
        LOG.info("successfully cleared Address2");
    }
    public void setAddress2(String item) {
        type(address2shipdiffaddy, item);
        LOG.info("successfully was able to type in Address2");
    }
    public void ClearCity(){
        clear(cityshipdiffaddy);
        LOG.info("successfully cleared City field");
    }
    public void setCity(String item) {
        type(cityshipdiffaddy, item);
        LOG.info("successfully was able to type in City field");
    }
    public void ClearState(){
        clear(statediffaddy);
        LOG.info("successfully cleared State field");
    }
    public void setState(String item) {
        type(statediffaddy, item);
        LOG.info("successfully was able to type in State field");
    }
    public void ClearZip(){
        clear(zipcodediffaddy);
        LOG.info("successfully cleared Zipcode field");
    }
    public void setZip(String item) {
        type(zipcodediffaddy, item);
        LOG.info("successfully was able to type in Zipcode field");
    }
    public void ClearCountry(){
        clear(zipcodediffaddy);
        LOG.info("successfully cleared Country field");
    }
    public void setCountry(String item) {
        type(zipcodediffaddy, item);
        LOG.info("successfully was able to type in Country field");
    }
    public void continuebuttonshippingaddress(){
        click(continuebuttonshippingaddress);
        LOG.info("Click on second Ship to Different Address successful");
    }


    public boolean orderFunction(){ return confirmOrderbtn2.isEnabled(); }
    public String description(){ return getElementText(description); }

}
