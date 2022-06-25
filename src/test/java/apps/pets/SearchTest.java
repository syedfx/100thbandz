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
        CatalogPage.enterSearch("zebra");
        waitFor(2);
        CatalogPage.setSearchButton();
        Assert.assertTrue(CatalogPage.searchFieldBttnFunction());

    }

    @Test
    public void SearchValiditem() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.enterSearch("Bulldog");
        waitFor(2);
        CatalogPage.setSearchButton();
        String expectedtitle = "Bulldog";
        Assert.assertEquals(expectedtitle, CatalogPage.bulldogText());
    }

    @Test
    public void SearchSnake() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.enterSearch("snake");
        waitFor(2);
        CatalogPage.setSearchButton();
        String expectedtitle = "Rattlesnake";
        Assert.assertEquals(expectedtitle, CatalogPage.snakeText());
    }

    @Test
    public void Searchmultiplepets() {
        LandingPage LandingPage = new LandingPage(getDriver());
        LandingPage.clickLink();
        CatalogPage CatalogPage = new CatalogPage(getDriver());
        CatalogPage.enterSearch("snake");
        waitFor(5);
        CatalogPage.setSearchButton();
        waitFor(5);
        CatalogPage.setReturnMainMenu();
        waitFor(5);
        CatalogPage.clearField();
        waitFor(4);
        CatalogPage.enterSearch("fish");
        waitFor(5);
        CatalogPage.setSearchButton();
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
            CatalogPage.clearField();
            waitFor(3);
        }

    }

}
