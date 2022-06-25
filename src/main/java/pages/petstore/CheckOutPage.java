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
    private WebElement cardSelection;

//continuebutton to go to paymentdetails
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/input")
    private WebElement continueButton;

    //confirmbutton to complete order
    @FindBy(xpath = "//*[@id=\"Catalog\"]/a")
    private WebElement confirmOrderBtn2;

    //click button shipToDifferent address
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table/tbody/tr[14]/td/input")
    private WebElement shipDiffAddy;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/input")
    private WebElement continueButtonShippingAddress;



    //ShippingAddressForm
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table/tbody/tr[2]/td[2]/input")
    private WebElement firstNameShipDiffAddy;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table/tbody/tr[3]/td[2]/input")
    private WebElement lastNameShipDiffAddy;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table/tbody/tr[4]/td[2]/input")
    private WebElement address1ShipDiffAddy;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table/tbody/tr[5]/td[2]/input")
    private WebElement address2ShipDiffAddy;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table/tbody/tr[6]/td[2]/input")
    private WebElement cityShipDiffAddy;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table/tbody/tr[7]/td[2]/input")
    private WebElement stateDiffAddy;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table/tbody/tr[8]/td[2]/input")
    private WebElement zipcodeDiffAddy;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table/tbody/tr[9]/td[2]/input")
    private WebElement countryDiffAddy;

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[26]/td/table/tbody/tr[1]/th[2]")
    private WebElement description;




    public CheckOutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);}

    public void setContinueButton(){
        click(continueButton);
        LOG.info("Click on continue button was successful");
    }

    public void setCardSelection (String input) {
        selectFromDropdown(cardSelection, input);
        LOG.info("successfully was able to sort through dropdown");
    }
    public void setConfirmOrderbtn2(){
        click(confirmOrderBtn2);
        LOG.info("Click on confirm order button was successful");
    }

    public void setShipdiffaddy(){
        click(shipDiffAddy);
        LOG.info("Click on Ship to Different Address successful");
    }
//shipping address methods

    public void ClearFirstName(){
        clear(firstNameShipDiffAddy);
        LOG.info("successfully cleared First Name field");
    }
    public void setFirstName(String item) {
        type(firstNameShipDiffAddy, item);
        LOG.info("successfully was able to type in First Name");
    }
    public void ClearLastName(){
        clear(lastNameShipDiffAddy);
        LOG.info("successfully cleared Last Name field");
    }
    public void setLastName(String item) {
        type(lastNameShipDiffAddy, item);
        LOG.info("successfully was able to type in LastName");
    }
    public void ClearAddress1(){
        clear(address1ShipDiffAddy);
        LOG.info("successfully cleared Address1 field");
    }
    public void setAddress1(String item) {
        type(address1ShipDiffAddy, item);
        LOG.info("successfully was able to type in Address1");
    }
    public void ClearAddress2(){
        clear(address2ShipDiffAddy);
        LOG.info("successfully cleared Address2");
    }
    public void setAddress2(String item) {
        type(address2ShipDiffAddy, item);
        LOG.info("successfully was able to type in Address2");
    }
    public void ClearCity(){
        clear(cityShipDiffAddy);
        LOG.info("successfully cleared City field");
    }
    public void setCity(String item) {
        type(cityShipDiffAddy, item);
        LOG.info("successfully was able to type in City field");
    }
    public void ClearState(){
        clear(stateDiffAddy);
        LOG.info("successfully cleared State field");
    }
    public void setState(String item) {
        type(stateDiffAddy, item);
        LOG.info("successfully was able to type in State field");
    }
    public void ClearZip(){
        clear(zipcodeDiffAddy);
        LOG.info("successfully cleared Zipcode field");
    }
    public void setZip(String item) {
        type(zipcodeDiffAddy, item);
        LOG.info("successfully was able to type in Zipcode field");
    }
    public void ClearCountry(){
        clear(zipcodeDiffAddy);
        LOG.info("successfully cleared Country field");
    }
    public void setCountry(String item) {
        type(zipcodeDiffAddy, item);
        LOG.info("successfully was able to type in Country field");
    }
    public void continueButtonShippingAddress(){
        click(continueButtonShippingAddress);
        LOG.info("Click on second Ship to Different Address successful");
    }


    public boolean orderFunction(){ return confirmOrderBtn2.isEnabled(); }
    public String description(){ return getElementText(description); }

}
