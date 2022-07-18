package tests.knygos.lt;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Common;
import pages.Locators;
import tests.BaseTest;

public class Category extends BaseTest {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.knygos.lt.Home.open();
        Common.acceptCookies(Locators.KnygosLt.Home.acceptCookiesLink);
    }

    @Test
    public void testAllBooksPage() {
        pages.knygos.lt.Home.clickMenuAllBooks();

        pages.knygos.lt.Home.clickMenuPopularPsychology();

        String expectedMessage = "Populiarioji psichologija";
        String actualMessage = pages.knygos.lt.Category.readPopularPsycologyHeader();

        Assert.assertEquals(actualMessage, expectedMessage);

    }
}
