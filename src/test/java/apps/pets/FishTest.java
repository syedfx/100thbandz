package apps.pets;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.petstore.*;


public class FishTest extends CommonAPI {

    @Test
    public void largeAngelfishDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setFishLink();
        FishPage FishPage = new FishPage(getDriver());
        FishPage.setAngelfish();
        FishPage.setLargeAngelFishDesc();
        String expectedtitle = "Large Angelfish";
        Assert.assertEquals(expectedtitle,FishPage.largeAngelFishTitle());
    }

    @Test
    public void smallAngelfishDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setFishLink();
        FishPage FishPage = new FishPage(getDriver());
        FishPage.setAngelfish();
        FishPage.setSmallAngelFishDesc();
        String expectedtitle = "Small Angelfish";
        Assert.assertEquals(expectedtitle,FishPage. smallAngelFishTitle());
    }

    @Test
    public void SharkDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setFishLink();
        FishPage FishPage = new FishPage(getDriver());
        FishPage.setTigerShark();
        FishPage.setToothlessTigerSharkDesc();
        String expectedTitle = "Toothless Tiger Shark";
        Assert.assertEquals(expectedTitle,FishPage. toothlessTigerSharkTitle());
    }

    @Test
    public void SpottedKoiDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setFishLink();
        FishPage FishPage = new FishPage(getDriver());
        FishPage.setKoi();
        FishPage.setSpotKoiDesc();
        String expectedtitle = "Spotted Koi";
        Assert.assertEquals(expectedtitle,FishPage.spotKoiTitle());
    }

    @Test
    public void NonSpottedKoiDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setFishLink();
        FishPage FishPage = new FishPage(getDriver());
        FishPage.setKoi();
        FishPage.setNonspotKoiDesc();
        String expectedtitle = "Spotless Koi";
        Assert.assertEquals(expectedtitle,FishPage. nonSpotKoiTitle());
    }
    @Test
    public void MaleGoldFishDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setFishLink();
        FishPage FishPage = new FishPage(getDriver());
        FishPage.setGoldFish();
        FishPage.maleGoldFishDesc();
        String expectedtitle = "Adult Male Goldfish";
        Assert.assertEquals(expectedtitle,FishPage. maleGoldFishTitle());

         }
        @Test
         public void FemaleGoldFishDesc() {
            LandingPage LandingPage = new LandingPage(getDriver());
            LandingPage.clickLink();
            CatalogPage CatalogPage = new CatalogPage(getDriver());
            CatalogPage.setFishLink();
            FishPage FishPage = new FishPage(getDriver());
            FishPage.setGoldFish();
            FishPage.femaleGoldFishDesc();
            String expectedtitle = "Adult Female Goldfish";
            Assert.assertEquals(expectedtitle, FishPage.maleGoldFishTitle());
        }
}
