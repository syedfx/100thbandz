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
    private WebElement fishbar;
    //dogs
    @FindBy(xpath = "//*[@id=\"QuickLinks\"]/a[2]/img")
    private WebElement dogbar;
    //reptiles
    @FindBy(xpath = "//*[@id=\"QuickLinks\"]/a[4]/img")
    private WebElement repbar;
    //dogs
    @FindBy(xpath = "//*[@id=\"QuickLinks\"]/a[4]/img")
    private WebElement catbar;
    @FindBy(xpath = "//*[@id=\"QuickLinks\"]/a[5]/img")
    private WebElement birdsbar;

    //quantity field
    @FindBy(xpath = "//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[5]/input")
    private WebElement qauntity;

    //updatecart
    @FindBy(xpath = "//*[@id=\"Cart\"]/form/table/tbody/tr[3]/td[1]/input")
    private WebElement updatecartbutton;

    //remove
    @FindBy(xpath = "//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[8]/a")
    private WebElement removebutton;

    //returnmainmenu
    @FindBy(xpath = "//*[@id=\"BackLink\"]/a")
    private WebElement returnmainmenu;

    //checkoutbbtn
    @FindBy(xpath = "//*[@id=\"Cart\"]/a")
    private WebElement checkoutbttn;

    public AddToCartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setReturnmainmenu(){
        click(returnmainmenu);
        LOG.info("Click on Return to main menu was successful");
    }
    public void clearfield(){
        clear(qauntity);
        LOG.info("successfully was able to clear search field");
    }

    public void updateQuantity(String item){
        type(qauntity,item);
        LOG.info("Successfully able to update quantity");
    }

    public void UpdateCartBtn(){
        click(updatecartbutton);
        LOG.info("Successfully able to update cart for total");
    }

    public void CheckOutBttn(){
        click(checkoutbttn);
        LOG.info("Successfully able to click on checkout bttn");
    }


}
