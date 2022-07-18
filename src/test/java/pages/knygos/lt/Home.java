package pages.knygos.lt;

import pages.Common;
import pages.Locators;

public class Home {

    public static void open() {
        Common.openUrl("https://www.knygos.lt/");
    }

    public static void clickCart() {
        Common.clickElementByAction(Locators.KnygosLt.Home.linkCart);
    }

    public static void clickMenuAllBooks() {
        Common.waitForElementToBeClickable(Locators.KnygosLt.Home.linkMenuAllBooks);
        Common.clickElement(Locators.KnygosLt.Home.linkMenuAllBooks);
    }

    public static void clickMenuPopularPsychology() {
        Common.clickElementByAction(Locators.KnygosLt.Home.linkPopularPsychology);
    }

    public static void setSearchText(String searchText) {
        Common.sendKeyToElement(Locators.KnygosLt.Home.inputSearch, searchText);
    }

    public static void clickSearchButton() {
        Common.clickElement(Locators.KnygosLt.Home.buttonSearch);
    }

    public static void clickMyOrders() {
        Common.clickElement(Locators.KnygosLt.Home.linkMyOrders);
    }
}


