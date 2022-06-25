package pages.petstore;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddToCartPage extends CommonAPI {

    private final Logger LOG= LoggerFactory.getLogger(AddToCartPage.class);

    //menu bar
    //fish
    @FindBy(xpath = "//*[@id=\"QuickLinks\"]/a[1]/img")
    private WebElement fishBar;
    //dogs
    @FindBy(xpath = "//*[@id=\"QuickLinks\"]/a[2]/img")
    private WebElement dogBar;
    //reptiles
    @FindBy(xpath = "//*[@id=\"QuickLinks\"]/a[4]/img")
    private WebElement repBar;
    //dogs
    @FindBy(xpath = "//*[@id=\"QuickLinks\"]/a[4]/img")
    private WebElement catBar;
    @FindBy(xpath = "//*[@id=\"QuickLinks\"]/a[5]/img")
    private WebElement birdsBar;

    //quantity field
    @FindBy(xpath = "//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[5]/input")
    private WebElement qauntity;

    //updatecart
    @FindBy(xpath = "//*[@id=\"Cart\"]/form/table/tbody/tr[3]/td[1]/input")
    private WebElement updateCartButton;


    //remove
    @FindBy(xpath = "//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[8]/a")
    private WebElement removeButton;

    //returnmainmenu
    @FindBy(xpath = "//*[@id=\"BackLink\"]/a")
    private WebElement returnMainMenu;

    //checkOutbbtn
    @FindBy(xpath = "//*[@id=\"Cart\"]/a")
    private WebElement checkOutBttn;

    //updateCart
    @FindBy(xpath = "//*[@id=\"Cart\"]/a")
    private WebElement checkoutBttnCart;

    public AddToCartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setReturnMainMenu(){
        click(returnMainMenu);
        LOG.info("Click on Return to main menu was successful");
    }
    public void clearField(){
        clear(qauntity);
        LOG.info("successfully was able to clear search field");
    }

    public void updateQuantity(String item){
        type(qauntity,item);
        LOG.info("Successfully able to update quantity");
    }

    public void UpdateCartBtn(){
        click(updateCartButton);
        LOG.info("Successfully able to update cart for total");
    }

    public void CheckOutBttn(){
        click(checkOutBttn);
        LOG.info("Successfully able to click on checkout bttn");
    }

    public void CheckOutBttnCart(){
        click(checkOutBttn);
        LOG.info("Successfully able to click on checkout bttn");
    }

    public boolean updatecartbuttonFunction(){ return updateCartButton.isEnabled();}
    public boolean removeButtonFunction(){ return removeButton.isEnabled();}


}
