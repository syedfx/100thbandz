package apps.pets;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.petstore.*;


public class AccountsTest extends CommonAPI {
    @Test
    public void FavoriteCategoryBirds(){
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        SignInPage SignInPage  = new SignInPage(getDriver());
        MyAccountPage MyAccountPage = new MyAccountPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setSignIn();
        SignInPage.setUsername("TigerKing");
        SignInPage.clearPassword();
        SignInPage.setPassword("exotic");
        SignInPage.loginBttn();
        CatalogPage.setMyAccount();
        MyAccountPage.favoriteCategories();
        MyAccountPage.faveBird();
        MyAccountPage.saveAccountInfoBttn();
        Assert.assertTrue(MyAccountPage.saveAccountButtonFunction());
    }

   @Test
    public void FavoriteCategoryFish(){
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        SignInPage SignInPage  = new SignInPage(getDriver());
        MyAccountPage MyAccountPage = new MyAccountPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setSignIn();
        SignInPage.setUsername("TigerKing");
        SignInPage.clearPassword();
        SignInPage.setPassword("exotic");
        SignInPage.loginBttn();
        CatalogPage.setMyAccount();
        MyAccountPage.setFaveCategory("FISH");
        MyAccountPage.faveFish();
        MyAccountPage.saveAccountInfoBttn();
       Assert.assertTrue(MyAccountPage.saveAccountButtonFunction());

    }
   @Test
    public void FavoriteCategoryDog(){
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        SignInPage SignInPage  = new SignInPage(getDriver());
        MyAccountPage MyAccountPage = new MyAccountPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setSignIn();
        SignInPage.setUsername("TigerKing");
        SignInPage.clearPassword();
        SignInPage.setPassword("exotic");
        SignInPage.loginBttn();
        CatalogPage.setMyAccount();
        MyAccountPage.favoriteCategories();
        MyAccountPage.faveDog();
        MyAccountPage.saveAccountInfoBttn();
       Assert.assertTrue(MyAccountPage.saveAccountButtonFunction());
    }
    @Test
    public void FavoriteCategoryReptiles(){
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        SignInPage SignInPage  = new SignInPage(getDriver());
        MyAccountPage MyAccountPage = new MyAccountPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setSignIn();
        SignInPage.setUsername("TigerKing");
        SignInPage.clearPassword();
        SignInPage.setPassword("exotic");
        SignInPage.loginBttn();
        CatalogPage.setMyAccount();
        MyAccountPage.favoriteCategories();
        MyAccountPage.faveReptiles();
        MyAccountPage.saveAccountInfoBttn();
        Assert.assertTrue(MyAccountPage.saveAccountButtonFunction());
    }
    @Test
    public void FavoriteCategoryCat(){
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        SignInPage SignInPage  = new SignInPage(getDriver());
        MyAccountPage MyAccountPage = new MyAccountPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setSignIn();
        SignInPage.setUsername("TigerKing");
        SignInPage.clearPassword();
        SignInPage.setPassword("exotic");
        SignInPage.loginBttn();
        CatalogPage.setMyAccount();
        MyAccountPage.favoriteCategories();
        MyAccountPage.faveCat();
        MyAccountPage.saveAccountInfoBttn();
        Assert.assertTrue(MyAccountPage.saveAccountButtonFunction());
  }
    @Test
    public void UpdateAccountPhoneNumber(){
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        SignInPage SignInPage  = new SignInPage(getDriver());
        MyAccountPage MyAccountPage = new MyAccountPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setSignIn();
        SignInPage.setUsername("TigerKing");
        SignInPage.clearPassword();
        SignInPage.setPassword("exotic");
        SignInPage.loginBttn();
        waitFor(3);
        CatalogPage.setMyAccount();
        waitFor(3);
        MyAccountPage.phone();
        MyAccountPage.clearPhone();
        waitFor(5);
        MyAccountPage.updatePhone("111-111-1111");
        waitFor(5);
        MyAccountPage.saveAccountInfoBttn();
        Assert.assertTrue(MyAccountPage.saveAccountButtonFunction());
    }
    @Test
    public void UpdatepassWord(){
            LandingPage LandingPage = new LandingPage(getDriver());
            CatalogPage CatalogPage = new CatalogPage(getDriver());
            SignInPage  SignInPage  = new SignInPage(getDriver());
            MyAccountPage MyAccountPage = new MyAccountPage(getDriver());
            LandingPage.clickLink();
            CatalogPage.setSignIn();
            SignInPage.setUsername("Tester1");
            SignInPage.clearPassword();
            SignInPage.setPassword("123456");
            SignInPage.loginBttn();
            CatalogPage.setMyAccount();
            MyAccountPage.clearEmail();
            MyAccountPage.updateEmail("CaroleBaskin@gmail.com");
            MyAccountPage.saveAccountInfoBttn();
            Assert.assertTrue(MyAccountPage.saveAccountButtonFunction());

    }

}
