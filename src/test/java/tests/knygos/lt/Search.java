package tests.knygos.lt;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Locators;
import tests.BaseTest;

public class Search extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.knygos.lt.Home.open();
        utils.Common.acceptCookies(Locators.KnygosLt.Home.acceptCookiesLink);
    }

    @Test
    public void testSearchField() {
        pages.knygos.lt.Home.setSearchText("Vasaros romanas");

        pages.knygos.lt.Home.clickSearchButton();

        String actualSearchMessage = pages.knygos.lt.Search.readSearchResultMessage();
        Assert.assertTrue(Integer.parseInt(actualSearchMessage) > 0);

    }

    @Test
    public void testSearchAddToCart() {
        pages.knygos.lt.Home.setSearchText("Sodo metai");

        pages.knygos.lt.Home.clickSearchButton();

        pages.knygos.lt.Search.clickToCartButton();
    }
}
