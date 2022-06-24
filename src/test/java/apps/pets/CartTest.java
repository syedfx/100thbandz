package apps.pets;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.petstore.*;


public class CartTest extends CommonAPI {

       @Test
    public void Cart() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setCart();
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
        AddToCartPage.updateQuantity("3");
        AddToCartPage.UpdateCartBtn();

    }
    @Test
    public void ParrotCarted() {
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        BirdsPage BirdsPage = new BirdsPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setBirdlink();
        BirdsPage.setAmazonParrot();
        waitFor(5);
        BirdsPage.setMaleAdultAmazonParrot();
        waitFor(10);
        BirdsPage.setAtcbutton();
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
        waitFor(2);
        AddToCartPage.clearfield();
        waitFor(2);
        AddToCartPage.updateQuantity("3");
        waitFor(2);
        AddToCartPage.UpdateCartBtn();
        waitFor(2);
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
        waitFor(2);
        AddToCartPage.clearfield();
        waitFor(2);
        AddToCartPage.updateQuantity("3");
        waitFor(2);
        AddToCartPage.UpdateCartBtn();
        waitFor(2);
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
        waitFor(3);
        AddToCartPage.clearfield();
        waitFor(3);
        AddToCartPage.updateQuantity("3");
        waitFor(2);
        AddToCartPage.UpdateCartBtn();
        waitFor(2);
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
            waitFor(3);
            AddToCartPage.clearfield();
            waitFor(3);
            AddToCartPage.updateQuantity("3");
            waitFor(2);
            AddToCartPage.UpdateCartBtn();
            waitFor(2);
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



}
