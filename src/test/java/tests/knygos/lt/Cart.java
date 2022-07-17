package tests.knygos.lt;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Locators;
import tests.BaseTest;

public class Cart extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.knygos.lt.Home.open();
        utils.Common.acceptCookies(Locators.KnygosLt.Home.acceptCookiesLink);
    }

    @Test
    public void testEmptyCart() {
        pages.knygos.lt.Home.clickCart();

        String expectedMessage = "Jūsų prekių krepšelis tuščias.";
        String actualMessage = pages.knygos.lt.Cart.readEmptyCartMessage();

        Assert.assertEquals(actualMessage, expectedMessage);

        pages.knygos.lt.Cart.clickChooseItemButton();
    }

    @Test
    public void testFailEmptyCart() {
        pages.knygos.lt.Home.clickCart();

        String expectedMessage = "Jūsų prekių krepšelis.";
        String actualMessage = pages.knygos.lt.Cart.readEmptyCartMessage();

        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @AfterMethod
    public void testsComplete()
    {
        System.out.println("All tests for Cart are complete.");
    }

}
