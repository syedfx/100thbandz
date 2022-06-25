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
        CatalogPage.setSignIn();
        SignInPage.setUsername("TigerKing");
        SignInPage.clearPassword();
        SignInPage.setPassword("exotic");
        SignInPage.loginBttn();
        CatalogPage.setBirdLink();
        BirdsPage.setAmazonParrot();
        BirdsPage.setMaleAdultAmazonParrot();
        BirdsPage.setAtcButton();
        AddToCartPage.CheckOutBttn();
        CheckOutPage.setContinueButton();
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
        CatalogPage.setSignIn();
        SignInPage.setUsername("TigerKing");
        SignInPage.clearPassword();
        SignInPage.setPassword("exotic");
        SignInPage.loginBttn();
        CatalogPage.setBirdLink();
        BirdsPage.setAmazonParrot();
        BirdsPage.setAtcbutton1();
        AddToCartPage.CheckOutBttn();
        CheckOutPage.setCardSelection("American Express");
        CheckOutPage.setContinueButton();
        CheckOutPage.setConfirmOrderbtn2();
        String expectedtitle = "Description";
        Assert.assertEquals(expectedtitle,CheckOutPage. description());
    }

    @Test
    public void CheckoutWithShipToDifferentAddress() {
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        SignInPage SignInPage = new SignInPage(getDriver());
        BirdsPage BirdsPage = new BirdsPage(getDriver());
        CheckOutPage CheckOutPage = new CheckOutPage(getDriver());
        AddToCartPage AddToCartPage = new AddToCartPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setSignIn();
        SignInPage.setUsername("TigerKing");
        SignInPage.clearPassword();
        SignInPage.setPassword("exotic");
        SignInPage.loginBttn();
        CatalogPage.setBirdLink();
        BirdsPage.setAmazonParrot();
        BirdsPage.setMaleAdultAmazonParrot();
        BirdsPage.setAtcButton();
        AddToCartPage.CheckOutBttn();
          waitFor(5);
      CheckOutPage.setShipdiffaddy();
        CheckOutPage.waitFor(1);
        CheckOutPage.setContinueButton();
        CheckOutPage.ClearFirstName();
        CheckOutPage.setFirstName("Donald Trump");
        CheckOutPage.ClearLastName();
        CheckOutPage.setLastName("Trump");
        CheckOutPage.ClearAddress1();
        CheckOutPage.setAddress1("123 America");
        CheckOutPage.ClearAddress2();
        CheckOutPage.setAddress2("apt White House");
        CheckOutPage.ClearCity();
        CheckOutPage.setCity("Maralago");
        CheckOutPage.ClearState();
        CheckOutPage.setState("FL");
        CheckOutPage.ClearZip();
        CheckOutPage.setZip("12345");
        CheckOutPage.ClearCountry();
        CheckOutPage.setCountry("USA");
        CheckOutPage.continueButtonShippingAddress();
        CheckOutPage.setConfirmOrderbtn2();
        String expectedtitle = "Description";
        Assert.assertEquals(expectedtitle,CheckOutPage. description());
    }
}
