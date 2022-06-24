package apps.pets;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.petstore.CatalogPage;
import pages.petstore.LandingPage;
import pages.petstore.SignInPage;

public class SignInTest extends CommonAPI {

  //  @Test
    public void ValidLogin(){
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        SignInPage SignInPage  = new SignInPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setSignin();
        SignInPage.setUsername("TigerKing");
        SignInPage.ClearPassword();
        SignInPage.setPassword("exotic");
        SignInPage.Loginbttn();
        String expectedtitle = "Welcome Joe!";
        Assert.assertEquals(expectedtitle,SignInPage.WelcomeText());
    }
   // @Test
    public void ValidLogout(){
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        SignInPage SignInPage  = new SignInPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setSignin();
        SignInPage.setUsername("TigerKing");
        SignInPage.ClearPassword();
        SignInPage.setPassword("exotic");
        SignInPage.Loginbttn();
        CatalogPage.setSignout();
        Assert.assertTrue(CatalogPage.logoutLinkFunction());
    }

    @Test
    public void InvalidLogout(){
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        SignInPage SignInPage  = new SignInPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setSignin();
        SignInPage.setUsername("bllahaha");
        SignInPage.ClearPassword();
        SignInPage.setPassword("hfhfhfhf");
        SignInPage.Loginbttn();
        Assert.assertTrue(SignInPage.loginLinkFunction());
    }



}
