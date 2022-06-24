package apps.pets;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.petstore.*;


public class CartTest extends CommonAPI {

       @Test
    public void Cart() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setCart();
        CatalogPage.cartTitle();
           String expectedtitle = "Shopping Cart";
        Assert.assertEquals(expectedtitle,CatalogPage.cartTitle());
    }
     @Test
    public void TigerSharkCarted() {
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        FishPage FishPage = new FishPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setFishlink();
        FishPage.setTigershark();
        FishPage.setToothlesstigersharkdesc();
        FishPage.sharkatcbtn();
        String expectedtitle = "Description";
        Assert.assertEquals(expectedtitle, FishPage.descriptionTitle());
    }

     @Test
     public void UpdateSharkQtyCart() {
          LandingPage LandingPage = new LandingPage(getDriver());
          CatalogPage CatalogPage = new CatalogPage(getDriver());
          FishPage FishPage = new FishPage(getDriver());
          AddToCartPage AddToCartPage = new AddToCartPage(getDriver());
          LandingPage.clickLink();
          CatalogPage.setFishlink();
          FishPage.setTigershark();
          FishPage.setToothlesstigersharkdesc();
          FishPage.sharkatcbtn();
          AddToCartPage.clearfield();
          AddToCartPage.updateQuantity("2");
          AddToCartPage.UpdateCartBtn();
          Assert.assertTrue(AddToCartPage.updatecartbuttonFunction());


  }
    @Test
    public void ParrotCarted() {
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        BirdsPage BirdsPage = new BirdsPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setBirdlink();
        BirdsPage.setAmazonParrot();
        BirdsPage.setMaleAdultAmazonParrot();
        BirdsPage.setAtcbutton();
         String expectedtitle = "Description";
         Assert.assertEquals(expectedtitle, BirdsPage.DescriptionTitle());
    }

    @Test
    public void UpdateParrotQtyCart() {
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        BirdsPage BirdsPage = new BirdsPage(getDriver());
        AddToCartPage AddToCartPage = new AddToCartPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setBirdlink();
        BirdsPage.setAmazonParrot();
        BirdsPage.setMaleAdultAmazonParrot();
        BirdsPage.setAtcbutton();
        AddToCartPage.clearfield();
        AddToCartPage.updateQuantity("3");
        AddToCartPage.UpdateCartBtn();
        AddToCartPage.UpdateCartBtn();
        Assert.assertTrue(AddToCartPage.updatecartbuttonFunction());
  }
    @Test
    public void PersianCatCarted() {
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatsPage CatsPage = new CatsPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setCatslink();
        CatsPage.setPersian();
        CatsPage.femalepersian();
        CatsPage.setAtcfemalepersian();
    }

      @Test
    public void UpdatePersianCatQty() {
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatsPage CatsPage = new CatsPage(getDriver());
        AddToCartPage AddToCartPage = new AddToCartPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setCatslink();
        CatsPage.setPersian();
        CatsPage.femalepersian();
        CatsPage.setAtcfemalepersian();
        AddToCartPage.clearfield();
        AddToCartPage.updateQuantity("3");
           AddToCartPage.UpdateCartBtn();
           Assert.assertTrue(AddToCartPage.updatecartbuttonFunction());
    }

        @Test
        public void BullDogCarted() {
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        DogsPage DogsPage = new DogsPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setDoglink();
        DogsPage.Bulldogs();
        DogsPage.MaleAdultBullDog();
        DogsPage.atcMaleBulldog();
    }

        @Test
        public void UpdateMaleBullDogQty() {
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        DogsPage DogsPage = new DogsPage(getDriver());
        AddToCartPage AddToCartPage = new AddToCartPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setDoglink();
        DogsPage.Bulldogs();
        DogsPage.MaleAdultBullDog();
        DogsPage.atcMaleBulldog();
        AddToCartPage.clearfield();
        AddToCartPage.updateQuantity("3");
        AddToCartPage.UpdateCartBtn();
          AddToCartPage.UpdateCartBtn();
          AddToCartPage.UpdateCartBtn();
          Assert.assertTrue(AddToCartPage.updatecartbuttonFunction());
   }
    @Test
         public void RattleSnakeCarted() {
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        ReptilesPage ReptilesPage = new ReptilesPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setReptileslink();
        ReptilesPage.setRattlesnake();
        ReptilesPage.setVenomsnake();
        ReptilesPage.atcVenomlessSnake();
    }
    @Test
    public void UpdateVenomlessSnakeQty() {
            LandingPage LandingPage = new LandingPage(getDriver());
            CatalogPage CatalogPage = new CatalogPage(getDriver());
            ReptilesPage ReptilesPage = new ReptilesPage(getDriver());
            AddToCartPage AddToCartPage = new AddToCartPage(getDriver());
            LandingPage.clickLink();
            CatalogPage.setReptileslink();
            ReptilesPage.setRattlesnake();
            ReptilesPage.setVenomsnake();
            ReptilesPage.atcVenomlessSnake();
            AddToCartPage.clearfield();
            AddToCartPage.updateQuantity("3");
            AddToCartPage.UpdateCartBtn();
          Assert.assertTrue(AddToCartPage.updatecartbuttonFunction());
    }
    @Test
    public void LoggedinSharkCart(){
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        SignInPage SignInPage = new SignInPage(getDriver());
        FishPage FishPage = new FishPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setSignin();
        SignInPage.setUsername("Tester");
        SignInPage.ClearPassword();
        SignInPage.setPassword("12345");
        SignInPage.Loginbttn();
        CatalogPage.setFishlink();
        FishPage.setTigershark();
        FishPage.setToothlesstigersharkdesc();
        FishPage.sharkatcbtn();
    }
    @Test
        public void LoggedinParrotCart(){
            LandingPage LandingPage = new LandingPage(getDriver());
            CatalogPage CatalogPage = new CatalogPage(getDriver());
            SignInPage SignInPage = new SignInPage(getDriver());
            BirdsPage BirdsPage = new BirdsPage(getDriver());
            LandingPage.clickLink();
            CatalogPage.setSignin();
            SignInPage.setUsername("Tester");
            SignInPage.ClearPassword();
            SignInPage.setPassword("12345");
            SignInPage.Loginbttn();
            CatalogPage.setBirdlink();
            BirdsPage.setAmazonParrot();
            BirdsPage.setMaleAdultAmazonParrot();
            BirdsPage.setAtcbutton();
        }
    @Test
    public void LoggedinPersianCatCarted(){
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        SignInPage SignInPage = new SignInPage(getDriver());
        CatsPage CatsPage = new CatsPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setSignin();
        SignInPage.setUsername("Tester");
        SignInPage.ClearPassword();
        SignInPage.setPassword("12345");
        SignInPage.Loginbttn();
        CatalogPage.setCatslink();
        CatsPage.setPersian();
        CatsPage.femalepersian();
        CatsPage.setAtcfemalepersian();
    }
    @Test
    public void LoggedinBullDogCarted(){
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        SignInPage SignInPage = new SignInPage(getDriver());
        DogsPage DogsPage = new DogsPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setSignin();
        SignInPage.setUsername("Tester");
        SignInPage.ClearPassword();
        SignInPage.setPassword("12345");
        SignInPage.Loginbttn();
        CatalogPage.setDoglink();
        DogsPage.Bulldogs();
        DogsPage.MaleAdultBullDog();
        DogsPage.atcMaleBulldog();
    }
    @Test
    public void LoggedinRattleSnakeCarted(){
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        SignInPage SignInPage = new SignInPage(getDriver());
        ReptilesPage ReptilesPage = new ReptilesPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setSignin();
        SignInPage.setUsername("Tester");
        SignInPage.ClearPassword();
        SignInPage.setPassword("12345");
        SignInPage.Loginbttn();
        CatalogPage.setReptileslink();
        ReptilesPage.setRattlesnake();
        ReptilesPage.setVenomsnake();
        ReptilesPage.atcVenomlessSnake();
       }
          @Test
          public void removeSharkFromCart(){
               LandingPage LandingPage = new LandingPage(getDriver());
               CatalogPage CatalogPage = new CatalogPage(getDriver());
               FishPage FishPage = new FishPage(getDriver());
               AddToCartPage AddToCartPage = new AddToCartPage(getDriver());
               LandingPage.clickLink();
               CatalogPage.setFishlink();
               FishPage.setTigershark();
               FishPage.setToothlesstigersharkdesc();
               FishPage.sharkatcbtn();
               AddToCartPage.clearfield();
               AddToCartPage.updateQuantity("2");
               AddToCartPage.UpdateCartBtn();
               AddToCartPage.removeButtonFunction();
               Assert.assertTrue(AddToCartPage.removeButtonFunction());
          }
           @Test
          public void removePersianCatCart(){
                LandingPage LandingPage = new LandingPage(getDriver());
                CatalogPage CatalogPage = new CatalogPage(getDriver());
                CatsPage CatsPage = new CatsPage(getDriver());
                AddToCartPage AddToCartPage = new AddToCartPage(getDriver());
                LandingPage.clickLink();
                CatalogPage.setCatslink();
                CatsPage.setPersian();
                CatsPage.femalepersian();
                CatsPage.setAtcfemalepersian();
                AddToCartPage.clearfield();
                AddToCartPage.updateQuantity("3");
                AddToCartPage.UpdateCartBtn();
                AddToCartPage.removeButtonFunction();
                Assert.assertTrue(AddToCartPage.removeButtonFunction());
           }

     @Test
     public void removeBulldogCart(){
          LandingPage LandingPage = new LandingPage(getDriver());
          CatalogPage CatalogPage = new CatalogPage(getDriver());
          DogsPage DogsPage = new DogsPage(getDriver());
          AddToCartPage AddToCartPage = new AddToCartPage(getDriver());
          LandingPage.clickLink();
          CatalogPage.setDoglink();
          DogsPage.Bulldogs();
          DogsPage.MaleAdultBullDog();
          DogsPage.atcMaleBulldog();
          AddToCartPage.clearfield();
          AddToCartPage.updateQuantity("3");
          AddToCartPage.UpdateCartBtn();
          AddToCartPage.removeButtonFunction();
          Assert.assertTrue(AddToCartPage.removeButtonFunction());
     }
     @Test
     public void RemoveVenomlessSnakeQty() {
          LandingPage LandingPage = new LandingPage(getDriver());
          CatalogPage CatalogPage = new CatalogPage(getDriver());
          ReptilesPage ReptilesPage = new ReptilesPage(getDriver());
          AddToCartPage AddToCartPage = new AddToCartPage(getDriver());
          LandingPage.clickLink();
          CatalogPage.setReptileslink();
          ReptilesPage.setRattlesnake();
          ReptilesPage.setVenomsnake();
          ReptilesPage.atcVenomlessSnake();
          AddToCartPage.clearfield();
          AddToCartPage.updateQuantity("3");
          AddToCartPage.UpdateCartBtn();
          AddToCartPage.removeButtonFunction();
          Assert.assertTrue(AddToCartPage.removeButtonFunction());
     }
     }

