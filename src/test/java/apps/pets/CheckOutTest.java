package apps.pets;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.petstore.*;


public class CheckOutTest extends CommonAPI {
    @Test
    public void Checkout() {
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        SignInPage SignInPage = new SignInPage(getDriver());
        BirdsPage BirdsPage = new BirdsPage(getDriver());
        CheckOutPage CheckOutPage = new CheckOutPage(getDriver());
        AddToCartPage AddToCartPage = new AddToCartPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setSignin();
        SignInPage.setUsername("TigerKing");
        SignInPage.ClearPassword();
        SignInPage.setPassword("exotic");
        SignInPage.Loginbttn();
        waitFor(3);
        CatalogPage.setBirdlink();
        waitFor(3);
        BirdsPage.setAmazonParrot();
        BirdsPage.setMaleAdultAmazonParrot();
        waitFor(3);
        BirdsPage.setAtcbutton();
        AddToCartPage.CheckOutBttn();
        CheckOutPage.setContinuebutton();
        CheckOutPage.setConfirmOrderbtn2();
        String expectedtitle = "Description";
        Assert.assertEquals(expectedtitle,CheckOutPage. description());
    }
    @Test
    public void CheckoutWithCardDropDown() {
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        SignInPage SignInPage = new SignInPage(getDriver());
        BirdsPage BirdsPage = new BirdsPage(getDriver());
        CheckOutPage CheckOutPage = new CheckOutPage(getDriver());
        AddToCartPage AddToCartPage = new AddToCartPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setSignin();
        SignInPage.setUsername("TigerKing");
        SignInPage.ClearPassword();
        SignInPage.setPassword("exotic");
        SignInPage.Loginbttn();
        CatalogPage.setBirdlink();
        BirdsPage.setAmazonParrot();
        BirdsPage.setAtcbutton1();
        AddToCartPage.CheckOutBttn();
        CheckOutPage.setCardSelection("American Express");
        CheckOutPage.setContinuebutton();
        CheckOutPage.setConfirmOrderbtn2();
        String expectedtitle = "Description";
        Assert.assertEquals(expectedtitle,CheckOutPage. description());
    }

    @Test
    public void CheckoutWithShiptodifferentAddress() {
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        SignInPage SignInPage = new SignInPage(getDriver());
        BirdsPage BirdsPage = new BirdsPage(getDriver());
        CheckOutPage CheckOutPage = new CheckOutPage(getDriver());
        AddToCartPage AddToCartPage = new AddToCartPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setSignin();
        SignInPage.setUsername("TigerKing");
        SignInPage.ClearPassword();
        SignInPage.setPassword("exotic");
        SignInPage.Loginbttn();
        CatalogPage.setBirdlink();
        BirdsPage.setAmazonParrot();
        BirdsPage.setMaleAdultAmazonParrot();
        waitFor(3);





//        BirdsPage.setAtcbutton();
//        BirdsPage.setAmazonParrot();
//        BirdsPage.setAtcbutton1();
//        AddToCartPage.CheckOutBttn();
//        CheckOutPage.setShipdiffaddy();
//        CheckOutPage.waitFor(1);
//        CheckOutPage.setContinuebutton();
//        CheckOutPage.ClearFirstName();
//        CheckOutPage.setFirstName("Donald Trump");
//        CheckOutPage.ClearLastName();
//        CheckOutPage.setLastName("Trump");
//        CheckOutPage.ClearAddress1();
//        CheckOutPage.setAddress1("123 America");
//        CheckOutPage.ClearAddress2();
//        CheckOutPage.setAddress2("apt White House");
//        CheckOutPage.ClearCity();
//        CheckOutPage.setCity("Maralago");
//        CheckOutPage.ClearState();
//        CheckOutPage.setState("FL");
//        CheckOutPage.ClearZip();
//        CheckOutPage.setZip("12345");
//        CheckOutPage.ClearCountry();
//        CheckOutPage.setCountry("USA");
//        CheckOutPage.continuebuttonshippingaddress();
//        CheckOutPage.setConfirmOrderbtn2();
//        String expectedtitle = "Description";
//        Assert.assertEquals(expectedtitle,CheckOutPage. description());
    }
}
