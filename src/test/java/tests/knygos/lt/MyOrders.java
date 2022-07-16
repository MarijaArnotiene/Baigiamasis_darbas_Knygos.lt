package tests.knygos.lt;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Locators;
import tests.BaseTest;

public class MyOrders extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.knygos.lt.Home.open();
        utils.Common.acceptCookies(Locators.KnygosLt.Home.acceptCookiesLink);
    }

    @Test
    public void testBuyWithoutRegistrationError() {
        pages.knygos.lt.Home.clickMyOrders();

        pages.knygos.lt.MyOrders.writeEmail("test.knygoslt1234@test.lt");

        pages.knygos.lt.MyOrders.clickBuyWithoutRegistration();

        String expectedMessage = "Toks el. pašto adresas nerastas";
        String actualMessage = pages.knygos.lt.MyOrders.readErrorText();

        Assert.assertEquals(actualMessage, expectedMessage);

    }
}

