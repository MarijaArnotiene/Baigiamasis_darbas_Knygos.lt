package tests.knygos.lt;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Cart extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.knygos.lt.Cart.open();
    }

    @Test
    public void testEmptyCart() {
        String expectedMessage = "Jūsų prekių krepšelis tuščias.";
        String actualMessage = pages.knygos.lt.Cart.readEmptyCartMessage();
        Assert.assertEquals(actualMessage, expectedMessage);

        expectedMessage = "Krepšelis";
        actualMessage = pages.knygos.lt.Cart.readCartStepMessage(1);
        Assert.assertEquals(actualMessage, expectedMessage);

        expectedMessage = "Prisijungti / Registruotis";
        actualMessage = pages.knygos.lt.Cart.readCartStepMessage(2);
        Assert.assertEquals(actualMessage, expectedMessage);

        expectedMessage = "Pristatymo informacija";
        actualMessage = pages.knygos.lt.Cart.readCartStepMessage(3);
        Assert.assertEquals(actualMessage, expectedMessage);

        expectedMessage = "Mokėjimo būdas";
        actualMessage = pages.knygos.lt.Cart.readCartStepMessage(4);
        Assert.assertEquals(actualMessage, expectedMessage);

        expectedMessage = "Peržiūra ir patvirtinimas";
        actualMessage = pages.knygos.lt.Cart.readCartStepMessage(5);
        Assert.assertEquals(actualMessage, expectedMessage);

        pages.knygos.lt.Cart.clickChooseItemButton();

    }


    @AfterMethod
    public void testsComplete() {
        System.out.println("All tests for Cart are complete.");
    }

}
