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
        CatalogPage.setFishlink();
        FishPage FishPage = new FishPage(getDriver());
        FishPage.setAngelfish();
        FishPage.setLargeangelfishdesc();
        String expectedtitle = "Large Angelfish";
        Assert.assertEquals(expectedtitle,FishPage.largeangelfishtitle());
    }

    @Test
    public void smallAngelfishDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setFishlink();
        FishPage FishPage = new FishPage(getDriver());
        FishPage.setAngelfish();
        FishPage.setSmallangelfishdesc();
        String expectedtitle = "Small Angelfish";
        Assert.assertEquals(expectedtitle,FishPage. smallangelfishtitle());
    }

    @Test
    public void SharkDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setFishlink();
        FishPage FishPage = new FishPage(getDriver());
        FishPage.setTigershark();
        FishPage.setToothlesstigersharkdesc();
        String expectedtitle = "Toothless Tiger Shark";
        Assert.assertEquals(expectedtitle,FishPage. toothlesstigersharktitle());
    }

    @Test
    public void SpottedKoiDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setFishlink();
        FishPage FishPage = new FishPage(getDriver());
        FishPage.setKoi();
        FishPage.setspotkoidesc();
        String expectedtitle = "Spotted Koi";
        Assert.assertEquals(expectedtitle,FishPage.spotkoititle());
    }

    @Test
    public void NonSpottedKoiDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setFishlink();
        FishPage FishPage = new FishPage(getDriver());
        FishPage.setKoi();
        FishPage.setNonspotkoidesc();
        String expectedtitle = "Spotless Koi";
        Assert.assertEquals(expectedtitle,FishPage. nonspotkoititle());
    }
    @Test
    public void MaleGoldFishDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setFishlink();
        FishPage FishPage = new FishPage(getDriver());
        FishPage.setGoldfish();
        FishPage.Malegoldfishdesc();
        String expectedtitle = "Adult Male Goldfish";
        Assert.assertEquals(expectedtitle,FishPage. malegoldfishtitle());

         }
        @Test
         public void FemaleGoldFishDesc() {
            LandingPage LandingPage = new LandingPage(getDriver());
            LandingPage.clickLink();
            CatalogPage CatalogPage = new CatalogPage(getDriver());
            CatalogPage.setFishlink();
            FishPage FishPage = new FishPage(getDriver());
            FishPage.setGoldfish();
            FishPage.Femalegoldfishdesc();
            String expectedtitle = "Adult Female Goldfish";
            Assert.assertEquals(expectedtitle, FishPage.malegoldfishtitle());
        }
}
