package apps.pets;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.petstore.CatalogPage;
import pages.petstore.LandingPage;
import pages.petstore.SignInPage;

public class SignInTest extends CommonAPI {

     @Test
    public void ValidLogin(){
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        SignInPage SignInPage  = new SignInPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setSignIn();
        SignInPage.setUsername("TigerKing");
        SignInPage.clearPassword();
        SignInPage.setPassword("exotic");
        SignInPage.loginBttn();
        String expectedtitle = "Welcome Joe!";
        Assert.assertEquals(expectedtitle,SignInPage.welcomeText());
    }
    @Test
    public void ValidLogout(){
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        SignInPage SignInPage  = new SignInPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setSignIn();
        SignInPage.setUsername("TigerKing");
        SignInPage.clearPassword();
        SignInPage.setPassword("exotic");
        SignInPage.loginBttn();
        CatalogPage.setSignOut();
        Assert.assertTrue(CatalogPage.logoutLinkFunction());
    }

    @Test
    public void InvalidLogout(){
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        SignInPage SignInPage  = new SignInPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setSignIn();
        SignInPage.setUsername("bllahaha");
        SignInPage.clearPassword();
        SignInPage.setPassword("hfhfhfhf");
        SignInPage.loginBttn();
        Assert.assertTrue(SignInPage.loginLinkFunction());
    }

    @Test
    public void ValidLoginSyed(){
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        SignInPage SignInPage  = new SignInPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setSignIn();
        SignInPage.setUsername("syedfx");
        SignInPage.clearPassword();
        SignInPage.setPassword("Risat456");
        SignInPage.loginBttn();
        String expectedtitle = "Welcome Syed!";
        Assert.assertEquals(expectedtitle,SignInPage.welcomeText());
    }

    @Test
    public void ValidLoginSyedLogOut(){
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        SignInPage SignInPage  = new SignInPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setSignIn();
        SignInPage.setUsername("syedfx");
        SignInPage.clearPassword();
        SignInPage.setPassword("Risat456");
        SignInPage.loginBttn();
        CatalogPage.setSignOut();
        Assert.assertTrue(CatalogPage.logoutLinkFunction());

    }



}
