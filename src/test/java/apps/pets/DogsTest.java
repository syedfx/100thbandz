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
        CatalogPage.setDogLink();
        DogsPage DogsPage = new DogsPage(getDriver());
        DogsPage.bullDogs();
        DogsPage.maleAdultBullDog();
        String expectedtitle ="Male Adult Bulldog";
        Assert.assertEquals(expectedtitle,DogsPage.maleBulldogTitle());
    }

    @Test
    public void FemalePuppyBulldogDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setDogLink();
        DogsPage DogsPage = new DogsPage(getDriver());
        DogsPage.bullDogs();
        DogsPage.femalePuppyBullDog();
        String expectedtitle ="Female Puppy Bulldog";
        Assert.assertEquals(expectedtitle,DogsPage.femaleBulldogTitle());
    }
        @Test
         public void PoodleDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setDogLink();
        DogsPage DogsPage = new DogsPage(getDriver());
        DogsPage.poodle();
        DogsPage.malePuppyPoodle();
        String expectedtitle = "Male Puppy Poodle";
        Assert.assertEquals(expectedtitle,DogsPage.poodleDogTitle());
    }

    @Test
    public void SpotlessDalmationDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setDogLink();
        DogsPage DogsPage = new DogsPage(getDriver());
        DogsPage.dalmation();
        DogsPage.maleDalmation();
        String expectedtitle = "Spotless Male Puppy Dalmation";
        Assert.assertEquals(expectedtitle,DogsPage.spotlessDalmationTitle());
    }

    @Test
    public void SpottedDalmationDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setDogLink();
        DogsPage DogsPage = new DogsPage(getDriver());
        DogsPage.dalmation();
        DogsPage.femaleDalmation();
          String expectedtitle = "Spotted Adult Female Dalmation";
          Assert.assertEquals(expectedtitle,DogsPage.spottedDalmationTitle());
    }
    @Test
    public void GoldenRetrieverDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setDogLink();
        DogsPage DogsPage = new DogsPage(getDriver());
        DogsPage.goldenRetriever();
        DogsPage.femaleGolden();
        String expectedtitle = "Adult Female Golden Retriever";
        Assert.assertEquals(expectedtitle,DogsPage.goldenDogTitle());
    }
    @Test
    public void AdultMaleLabradorRetrieverDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setDogLink();
        DogsPage DogsPage = new DogsPage(getDriver());
        DogsPage.labradorRetriever();
        DogsPage.rareMaleLabrador();
        String expectedtitle = "Adult Male Labrador Retriever";
        Assert.assertEquals(expectedtitle,DogsPage.rareMaledogTitle());
    }
        @Test
        public void AdultFemaleLabradorRetrieverDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setDogLink();
        DogsPage DogsPage = new DogsPage(getDriver());
        DogsPage.labradorRetriever();
        DogsPage.rareFemaleLabrador();
          String expectedtitle = "Adult Female Labrador Retriever";
          Assert.assertEquals(expectedtitle,DogsPage.adultFemaleLabradogTitle());
    }

        @Test
        public void AdultFemaleChihuahuaDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setDogLink();
        DogsPage DogsPage = new DogsPage(getDriver());
        DogsPage.chihuahua();
        DogsPage.femaleChihuahua();
        String expectedtitle = "Adult Female Chihuahua";
        Assert.assertEquals(expectedtitle,DogsPage. femaleChihuahuaTitle());
    }

        @Test
        public void AdultMaleChihuahuaDesc() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.setDogLink();
        DogsPage DogsPage = new DogsPage(getDriver());
        DogsPage.chihuahua();
        DogsPage.maleChihuahua();
        String expectedtitle = "Adult Male Chihuahua";
        Assert.assertEquals(expectedtitle,DogsPage. maleChihuahuaTitle());
    }


}
