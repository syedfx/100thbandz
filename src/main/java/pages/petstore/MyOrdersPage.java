package pages.petstore;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyOrdersPage extends CommonAPI {
    private final Logger LOG= LoggerFactory.getLogger(MyAccountPage.class);

    //Order ID
    @FindBy(xpath = "//*[@id=\"Content\"]/table/tbody/tr[2]/td[1]/a")
    private WebElement order9072;
    @FindBy(xpath = "//*[@id=\"Content\"]/table/tbody/tr[3]/td[1]/a")
    private WebElement order9073;
    @FindBy(xpath = "//*[@id=\"Content\"]/table/tbody/tr[4]/td[1]/a")
    private WebElement order9074;
    @FindBy(xpath = "//*[@id=\"Content\"]/table/tbody/tr[5]/td[1]/a")
    private WebElement order9078;
    @FindBy(xpath = "//*[@id=\"Content\"]/table/tbody/tr[6]/td[1]/a")
    private WebElement order9079;
    @FindBy(xpath = "//*[@id=\"Content\"]/table/tbody/tr[7]/td[1]/a")
    private WebElement order85940;
    @FindBy(xpath = "//*[@id=\"Content\"]/table/tbody/tr[8]/td[1]/a")
    private WebElement order87422;
    @FindBy(xpath = "//*[@id=\"Content\"]/table/tbody/tr[9]/td[1]/a")
    private WebElement order219319;
    @FindBy(xpath = "//*[@id=\"Content\"]/table/tbody/tr[10]/td[1]/a")
    private WebElement order219350;


    //assertions xpath
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[1]/th")
    private WebElement orderNumberDetails;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[26]/td/table/tbody/tr[2]/td[2]")
    private WebElement orderDescriptionDetails;
    @FindBy (xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[26]/td/table/tbody/tr[3]/th")
    private WebElement orderTotal;
    @FindBy (xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[24]/td[2]")
    private WebElement shippingProvider;
    @FindBy (xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[15]/th")
    private WebElement shippingAddress;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[6]/th")
    private WebElement billingAddress;
    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/th")
    private WebElement paymentDetails;

    public MyOrdersPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void order9072(){
        click(order9072);
        LOG.info("successfully viewed OrderID 9072 details");
    }

    public void order9073(){
        click(order9073);
        LOG.info("successfully viewed OrderID9073 details ");
    }

    public void order9074(){
        click(order9074);
        LOG.info("successfully viewed OrderID9074 details");
    }
    public void order9078(){
        click(order9078);
        LOG.info("successfully viewed OrderID9078 details");
    }
    public void order9079(){
        click(order9079);
        LOG.info("successfully viewed OrderID9079 details");
    }
    public void Order85940(){
        click(order85940);
        LOG.info("successfully viewed OrderID85940 details");
    }
    public void Order87422(){
        click(order87422);
        LOG.info("successfully viewed OrderID87422 details");
    }
    public void Order219319(){
        click(order219319);
        LOG.info("successfully viewed OrderID 219319 details");
    }
    public void Order219350(){
        click(order219350);
        LOG.info("successfully viewed OrderID 219350 details");
    }


   public String orderNumberDetails(){ return getElementText(orderNumberDetails); }
    public String orderDescriptionDetails(){ return getElementText(orderDescriptionDetails); }
    public String orderTotal(){ return getElementText(orderTotal); }
    public String shippingProvider(){ return getElementText(shippingProvider);}
    public String shippingAddress(){ return getElementText(shippingAddress); }
    public String billingAddress(){ return getElementText(billingAddress); }
    public String paymentDetails(){ return getElementText(paymentDetails); }




}
