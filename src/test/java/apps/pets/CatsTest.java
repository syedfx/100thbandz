package apps.pets;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.petstore.*;


public class CatsTest extends CommonAPI {

    @Test
    public void TailessManxCatDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setCatslink();
        CatsPage CatsPage = new CatsPage(getDriver());
        CatsPage.setManx();
        CatsPage.setTaillessManx();
        String expectedtitle = "Tailless Manx";
        Assert.assertEquals(expectedtitle,CatsPage.TailessmanxTitle());
    }
    @Test
    public void WithTailManxCatDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setCatslink();
        CatsPage CatsPage = new CatsPage(getDriver());
        CatsPage.setManx();
        CatsPage.setTailmanx();
        String expectedtitle = "With tail Manx";
        Assert.assertEquals(expectedtitle,CatsPage. TailManxTitle());
    }
    @Test
    public void FemalePersianCatDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setCatslink();
        CatsPage CatsPage = new CatsPage(getDriver());
        CatsPage.setPersian();
        CatsPage.femalepersian();
        String expectedtitle = "Adult Female Persian";
        Assert.assertEquals(expectedtitle,CatsPage. FemalepersianTitle());
    }
    @Test
    public void MalePersianCatDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setCatslink();
        CatsPage CatsPage = new CatsPage(getDriver());
        CatsPage.setPersian();
        CatsPage.setMalepersian();
        String expectedtitle = "Adult Male Persian";
        Assert.assertEquals(expectedtitle,CatsPage. MalePersianTitle());
    }
}
