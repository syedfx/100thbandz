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
        CatalogPage.setSignin();
        SignInPage.setUsername("TigerKing");
        SignInPage.ClearPassword();
        SignInPage.setPassword("exotic");
        SignInPage.Loginbttn();
        CatalogPage.setMyaccount();
        MyAccountPage.FavoriteCategories();
        MyAccountPage.FaveBird();
        MyAccountPage.SaveAccountInfoBttn();
        Assert.assertTrue(MyAccountPage.saveAccountButtonFunction());
    }

   @Test
    public void FavoriteCategoryFish(){
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        SignInPage SignInPage  = new SignInPage(getDriver());
        MyAccountPage MyAccountPage = new MyAccountPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setSignin();
        SignInPage.setUsername("TigerKing");
        SignInPage.ClearPassword();
        SignInPage.setPassword("exotic");
        SignInPage.Loginbttn();
        CatalogPage.setMyaccount();
        MyAccountPage.setFaveCategory("FISH");
        MyAccountPage.FaveFish();
        MyAccountPage.SaveAccountInfoBttn();
       Assert.assertTrue(MyAccountPage.saveAccountButtonFunction());

    }
   @Test
    public void FavoriteCategoryDog(){
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        SignInPage SignInPage  = new SignInPage(getDriver());
        MyAccountPage MyAccountPage = new MyAccountPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setSignin();
        SignInPage.setUsername("TigerKing");
        SignInPage.ClearPassword();
        SignInPage.setPassword("exotic");
        SignInPage.Loginbttn();
        CatalogPage.setMyaccount();
        MyAccountPage.FavoriteCategories();
        MyAccountPage.FaveDog();
        MyAccountPage.SaveAccountInfoBttn();
       Assert.assertTrue(MyAccountPage.saveAccountButtonFunction());
    }
    @Test
    public void FavoriteCategoryReptiles(){
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        SignInPage SignInPage  = new SignInPage(getDriver());
        MyAccountPage MyAccountPage = new MyAccountPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setSignin();
        SignInPage.setUsername("TigerKing");
        SignInPage.ClearPassword();
        SignInPage.setPassword("exotic");
        SignInPage.Loginbttn();
        CatalogPage.setMyaccount();
        MyAccountPage.FavoriteCategories();
        MyAccountPage.FaveReptiles();
        MyAccountPage.SaveAccountInfoBttn();
        Assert.assertTrue(MyAccountPage.saveAccountButtonFunction());
    }
    @Test
    public void FavoriteCategoryCat(){
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        SignInPage SignInPage  = new SignInPage(getDriver());
        MyAccountPage MyAccountPage = new MyAccountPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setSignin();
        SignInPage.setUsername("TigerKing");
        SignInPage.ClearPassword();
        SignInPage.setPassword("exotic");
        SignInPage.Loginbttn();
        CatalogPage.setMyaccount();
        MyAccountPage.FavoriteCategories();
        MyAccountPage.FaveCat();
        MyAccountPage.SaveAccountInfoBttn();
        Assert.assertTrue(MyAccountPage.saveAccountButtonFunction());
  }
    @Test
    public void UpdateAccountPhoneNumber(){
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        SignInPage SignInPage  = new SignInPage(getDriver());
        MyAccountPage MyAccountPage = new MyAccountPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setSignin();
        SignInPage.setUsername("TigerKing");
        SignInPage.ClearPassword();
        SignInPage.setPassword("exotic");
        SignInPage.Loginbttn();
        waitFor(3);
        CatalogPage.setMyaccount();
        waitFor(3);
        MyAccountPage.Phone();
        MyAccountPage.ClearPhone();
        waitFor(5);
        MyAccountPage.UpdatePhone("111-111-1111");
        waitFor(5);
        MyAccountPage.SaveAccountInfoBttn();
        Assert.assertTrue(MyAccountPage.saveAccountButtonFunction());
    }
    @Test
    public void UpdatepassWord(){
            LandingPage LandingPage = new LandingPage(getDriver());
            CatalogPage CatalogPage = new CatalogPage(getDriver());
            SignInPage  SignInPage  = new SignInPage(getDriver());
            MyAccountPage MyAccountPage = new MyAccountPage(getDriver());
            LandingPage.clickLink();
            CatalogPage.setSignin();
            SignInPage.setUsername("Tester1");
            SignInPage.ClearPassword();
            SignInPage.setPassword("123456");
            SignInPage.Loginbttn();
            CatalogPage.setMyaccount();
            MyAccountPage.ClearEmail();
            MyAccountPage.updateEmail("CaroleBaskin@gmail.com");
            MyAccountPage.SaveAccountInfoBttn();
            Assert.assertTrue(MyAccountPage.saveAccountButtonFunction());

    }

}
