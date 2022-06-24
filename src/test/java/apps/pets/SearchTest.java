package apps.pets;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.petstore.*;
import utility.ExcelReader;

import java.util.List;

public class SearchTest extends CommonAPI {

    @Test
    public void SearchInvaliditem() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.entersearch("zebra");
        waitFor(2);
        CatalogPage.setSearchbutton();

    }

    @Test
    public void SearchValiditem() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.entersearch("Bulldog");
        waitFor(2);
        CatalogPage.setSearchbutton();
        String expectedtitle = "Bulldog";
        Assert.assertEquals(expectedtitle, CatalogPage.bulldogText());
    }

    @Test
    public void SearchSnake() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.entersearch("snake");
        waitFor(2);
        CatalogPage.setSearchbutton();
        String expectedtitle = "Rattlesnake";
        Assert.assertEquals(expectedtitle, CatalogPage.snakeText());
    }

    @Test
    public void Searchmultiplepets() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.entersearch("snake");
        waitFor(5);
        CatalogPage.setSearchbutton();
        waitFor(5);
        CatalogPage.setReturnmainmenu();
        waitFor(5);
        CatalogPage.clearfield();
        waitFor(4);
        CatalogPage.entersearch("fish");
        waitFor(5);
        CatalogPage.setSearchbutton();
        String expectedtitle = "Goldfish";
        Assert.assertEquals(expectedtitle, CatalogPage.fishText());
    }

    @Test
    public void searchMultiplePetsWithExcel() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        ExcelReader excelReader = new ExcelReader(currentDir +"/data/SearchPets.xlsx");
        List<String> pets = excelReader.getEntireColumnForGivenHeader("Sheet1", "Pets");
        for (String pet : pets) {
            CatalogPage.typeAndSearch(pet);
            waitFor(3);
            CatalogPage.clearfield();
            waitFor(3);
        }

    }

}
