package apps.pets;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.petstore.*;

public class DogsTest extends CommonAPI {

    @Test
    public void MaleAdultBulldogDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setDoglink();
        DogsPage DogsPage = new DogsPage(getDriver());
        DogsPage.Bulldogs();
        DogsPage.MaleAdultBullDog();
        String expectedtitle ="Male Adult Bulldog";
        Assert.assertEquals(expectedtitle,DogsPage.MaleBullDogTitle());
    }

    @Test
    public void FemalePuppyBulldogDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setDoglink();
        DogsPage DogsPage = new DogsPage(getDriver());
        DogsPage.Bulldogs();
        DogsPage.FemalePuppyBullDog();
        String expectedtitle ="Female Puppy Bulldog";
        Assert.assertEquals(expectedtitle,DogsPage.Femalebulldogtitle());
    }
        @Test
         public void PoodleDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setDoglink();
        DogsPage DogsPage = new DogsPage(getDriver());
        DogsPage.Poodle();
        DogsPage.MalePuppyPoodle();
        String expectedtitle = "Male Puppy Poodle";
        Assert.assertEquals(expectedtitle,DogsPage.Poodledogtitle());
    }

    @Test
    public void SpotlessDalmationDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setDoglink();
        DogsPage DogsPage = new DogsPage(getDriver());
        DogsPage.Dalmation();
        DogsPage.MaleDalmation();
        String expectedtitle = "Spotless Male Puppy Dalmation";
        Assert.assertEquals(expectedtitle,DogsPage.SpotlessDalmationtitle());
    }

    @Test
    public void SpottedDalmationDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setDoglink();
        DogsPage DogsPage = new DogsPage(getDriver());
        DogsPage.Dalmation();
        DogsPage.FemaleDalmation();
          String expectedtitle = "Spotted Adult Female Dalmation";
          Assert.assertEquals(expectedtitle,DogsPage.SpottedDalmationtitle());
    }
    @Test
    public void GoldenRetrieverDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setDoglink();
        DogsPage DogsPage = new DogsPage(getDriver());
        DogsPage.GoldenRetriever();
        DogsPage.FemaleGolden();
        String expectedtitle = "Adult Female Golden Retriever";
        Assert.assertEquals(expectedtitle,DogsPage.Goldendogtitle());
    }
    @Test
    public void AdultMaleLabradorRetrieverDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setDoglink();
        DogsPage DogsPage = new DogsPage(getDriver());
        DogsPage.LabradorRetriever();
        DogsPage.RareMaleLabrador();
        String expectedtitle = "Adult Male Labrador Retriever";
        Assert.assertEquals(expectedtitle,DogsPage.RareMaledogtitle());
    }
        @Test
        public void AdultFemaleLabradorRetrieverDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setDoglink();
        DogsPage DogsPage = new DogsPage(getDriver());
        DogsPage.LabradorRetriever();
        DogsPage.RareFemaleLabrador();
          String expectedtitle = "Adult Female Labrador Retriever";
          Assert.assertEquals(expectedtitle,DogsPage.AdultFemaleLabradogtitle());
    }

        @Test
        public void AdultFemaleChihuahuaDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setDoglink();
        DogsPage DogsPage = new DogsPage(getDriver());
        DogsPage.Chihuahua();
        DogsPage.FemaleChihuahua();
        String expectedtitle = "Adult Female Chihuahua";
        Assert.assertEquals(expectedtitle,DogsPage. FemaleChihuahuaTitle());
    }

        @Test
        public void AdultMaleChihuahuaDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setDoglink();
        DogsPage DogsPage = new DogsPage(getDriver());
        DogsPage.Chihuahua();
        DogsPage.MaleChihuahua();
        String expectedtitle = "Adult Male Chihuahua";
        Assert.assertEquals(expectedtitle,DogsPage. MaleChihuahuaTitle());
    }


}
