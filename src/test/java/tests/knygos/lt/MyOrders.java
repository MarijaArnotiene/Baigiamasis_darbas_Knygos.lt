package tests.knygos.lt;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Locators;
import tests.BaseTest;

public class MyOrders extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.knygos.lt.MyOrders.open();
        utils.Common.acceptCookies(Locators.KnygosLt.Home.acceptCookiesLink);
    }

    @Test
    public void testGiftCertificatesPage() {
        pages.knygos.lt.MyOrders.setValue();

        pages.knygos.lt.MyOrders.addToCart();


    }


}

