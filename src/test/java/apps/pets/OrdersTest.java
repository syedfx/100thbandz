package apps.pets;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.petstore.*;


public class OrdersTest extends CommonAPI {
    @Test
    public void Order9072(){
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        SignInPage SignInPage  = new SignInPage(getDriver());
        MyAccountPage MyAccountPage = new MyAccountPage(getDriver());
        MyOrdersPage MyOrdersPage = new MyOrdersPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setSignIn();
        SignInPage.setUsername("TigerKing");
        SignInPage.clearPassword();
        SignInPage.setPassword("exotic");
        SignInPage.loginBttn();
        CatalogPage.setMyAccount();
        MyAccountPage.clickMyOrders();
        MyOrdersPage.order9072();
        String expectedtitle = "Order #9072 2022/06/09 12:00:00";
        Assert.assertEquals(expectedtitle,MyOrdersPage.orderNumberDetails());
    }

    @Test
    public void Order9073(){
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        SignInPage SignInPage  = new SignInPage(getDriver());
        MyAccountPage MyAccountPage = new MyAccountPage(getDriver());
        MyOrdersPage  MyOrdersPage = new MyOrdersPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setSignIn();
        SignInPage.setUsername("TigerKing");
        SignInPage.clearPassword();
        SignInPage.setPassword("exotic");
        SignInPage.loginBttn();
        CatalogPage.setMyAccount();
        MyAccountPage.clickMyOrders();
        MyOrdersPage.order9073();
        String expectedtitle = "Order #9073 2022/06/09 12:00:00";
        Assert.assertEquals(expectedtitle,MyOrdersPage.orderNumberDetails());
    }
    @Test
    public void Order9074(){
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        SignInPage SignInPage  = new SignInPage(getDriver());
        MyAccountPage MyAccountPage = new MyAccountPage(getDriver());
        MyOrdersPage  MyOrdersPage = new MyOrdersPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setSignIn();
        SignInPage.setUsername("TigerKing");
        SignInPage.clearPassword();
        SignInPage.setPassword("exotic");
        SignInPage.loginBttn();
        CatalogPage.setMyAccount();
        MyAccountPage.clickMyOrders();
        MyOrdersPage.order9074();
        String expectedtitle = "Adult Male Amazon Parrot";
        Assert.assertEquals(expectedtitle,MyOrdersPage.orderDescriptionDetails());

    }
    @Test
    public void Order9078(){
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        SignInPage SignInPage  = new SignInPage(getDriver());
        MyAccountPage MyAccountPage = new MyAccountPage(getDriver());
        MyOrdersPage  MyOrdersPage = new MyOrdersPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setSignIn();
        SignInPage.setUsername("TigerKing");
        SignInPage.clearPassword();
        SignInPage.setPassword("exotic");
        SignInPage.loginBttn();
        CatalogPage.setMyAccount();
        MyAccountPage.clickMyOrders();
        MyOrdersPage.order9078();
        String expectedtitle = "Total: $193.50";
        Assert.assertEquals(expectedtitle,MyOrdersPage.orderTotal());

    }
    @Test
    public void Order9079(){
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        SignInPage SignInPage  = new SignInPage(getDriver());
        MyAccountPage MyAccountPage = new MyAccountPage(getDriver());
        MyOrdersPage  MyOrdersPage = new MyOrdersPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setSignIn();
        SignInPage.setUsername("TigerKing");
        SignInPage.clearPassword();
        SignInPage.setPassword("exotic");
        SignInPage.loginBttn();
        CatalogPage.setMyAccount();
        MyAccountPage.clickMyOrders();
        MyOrdersPage.order9079();
        String expectedtitle = "UPS";
        Assert.assertEquals(expectedtitle,MyOrdersPage.shippingProvider());
    }

    @Test
    public void Order85940(){
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        SignInPage SignInPage  = new SignInPage(getDriver());
        MyAccountPage MyAccountPage = new MyAccountPage(getDriver());
        MyOrdersPage  MyOrdersPage = new MyOrdersPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setSignIn();
        SignInPage.setUsername("TigerKing");
        SignInPage.clearPassword();
        SignInPage.setPassword("exotic");
        SignInPage.loginBttn();
        CatalogPage.setMyAccount();
        MyAccountPage.clickMyOrders();
        MyOrdersPage.Order85940();
        String expectedtitle = "Shipping Address";
        Assert.assertEquals(expectedtitle,MyOrdersPage.shippingAddress());
    }
    @Test
    public void Order87422(){
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        SignInPage SignInPage  = new SignInPage(getDriver());
        MyAccountPage MyAccountPage = new MyAccountPage(getDriver());
        MyOrdersPage  MyOrdersPage = new MyOrdersPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setSignIn();
        SignInPage.setUsername("TigerKing");
        SignInPage.clearPassword();
        SignInPage.setPassword("exotic");
        SignInPage.loginBttn();
        CatalogPage.setMyAccount();
        MyAccountPage.clickMyOrders();
        MyOrdersPage.Order87422();
        String expectedtitle = "Billing Address";
        Assert.assertEquals(expectedtitle,MyOrdersPage.billingAddress());

    }
    @Test
    public void Order219319(){
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        SignInPage SignInPage  = new SignInPage(getDriver());
        MyAccountPage MyAccountPage = new MyAccountPage(getDriver());
        MyOrdersPage  MyOrdersPage = new MyOrdersPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setSignIn();
        SignInPage.setUsername("TigerKing");
        SignInPage.clearPassword();
        SignInPage.setPassword("exotic");
        SignInPage.loginBttn();
        CatalogPage.setMyAccount();
        MyAccountPage.clickMyOrders();
        MyOrdersPage.Order219319();
        String expectedtitle = "Payment Details";
        Assert.assertEquals(expectedtitle,MyOrdersPage.paymentDetails());

    }
    @Test
    public void Order219350(){
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        SignInPage SignInPage  = new SignInPage(getDriver());
        MyAccountPage MyAccountPage = new MyAccountPage(getDriver());
        MyOrdersPage  MyOrdersPage = new MyOrdersPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setSignIn();
        SignInPage.setUsername("TigerKing");
        SignInPage.clearPassword();
        SignInPage.setPassword("exotic");
        SignInPage.loginBttn();
        CatalogPage.setMyAccount();
        MyAccountPage.clickMyOrders();
        MyOrdersPage.Order219350();
        String expectedtitle = "Order #219350 2022/06/18 12:00:00";
        Assert.assertEquals(expectedtitle,MyOrdersPage.orderNumberDetails());

    }
}
