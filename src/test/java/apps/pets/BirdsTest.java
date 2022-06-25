package apps.pets;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.petstore.*;

public class BirdsTest extends CommonAPI {
    @Test
    public void AmazonParrotDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setBirdLink();
        BirdsPage Birdspage = new BirdsPage(getDriver());
        Birdspage.setAmazonParrot();
        Birdspage.setMaleAdultAmazonParrot();
        String expectedtitle = "Adult Male Amazon Parrot";
        Assert.assertEquals(expectedtitle,Birdspage. MaleAdultAmazonParrotTitle());
    }

    @Test
    public void FinchDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setBirdLink();
        BirdsPage Birdspage = new BirdsPage(getDriver());
        Birdspage.setFinch();
        Birdspage.setMaleAdultFinch();
        String expectedtitle = "Adult Male Finch";
        Assert.assertEquals(expectedtitle,Birdspage.MaleAdultFinchTitle());
    }
}
