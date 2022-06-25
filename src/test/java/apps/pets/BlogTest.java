package apps.pets;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.petstore.*;


public class BlogTest extends CommonAPI {
    @Test
    public void newtab() {
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setBlogLink();
        CatalogPage.setEmailButton();
        Assert.assertTrue(CatalogPage.emailButtonFunction());

    }
    @Test
    public void Release() {
        LandingPage LandingPage = new LandingPage(getDriver());
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        LandingPage.clickLink();
        CatalogPage.setBlogLink();
        CatalogPage.setReleaselink();
        String expectedtitle = "MyBatis 3.5.10 released!";
        Assert.assertEquals(expectedtitle,CatalogPage.ReleaseTitle());
    }
}
