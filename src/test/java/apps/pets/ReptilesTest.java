package apps.pets;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.petstore.*;


public class ReptilesTest extends CommonAPI {
    @Test
    public void VenomlessRattlesnakeDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setReptilesLink();
        ReptilesPage ReptilesPage = new ReptilesPage(getDriver());
        ReptilesPage.setRattleSnake();
        ReptilesPage.setVenomSnake();
        String expectedtitle = "Venomless Rattlesnake";
        Assert.assertEquals(expectedtitle,ReptilesPage. VenomSnakeTitle());
    }
    @Test
    public void RattlelessRattlesnakeDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setReptilesLink();
        ReptilesPage ReptilesPage = new ReptilesPage(getDriver());
        ReptilesPage.setRattleSnake();
        ReptilesPage.setNonrattlesnake();
        String expectedtitle = "Rattleless Rattlesnake";
        Assert.assertEquals(expectedtitle,ReptilesPage. NonRattleSnakeTitle());

    }
    @Test
    public void GreenIguanaDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setReptilesLink();
        ReptilesPage ReptilesPage = new ReptilesPage(getDriver());
        ReptilesPage.setIguana();
        ReptilesPage.setGreeniguana();
        String expectedtitle = "Green Adult Iguana";
        Assert.assertEquals(expectedtitle,ReptilesPage. GreenIguanaTitle());

    }
}