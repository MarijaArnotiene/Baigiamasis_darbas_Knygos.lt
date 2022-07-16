package pages.knygos.lt;

import pages.Locators;

public class Home {

    public static void open() {
        utils.Common.openUrl("https://www.knygos.lt/");
    }

    public static void clickCart() {
        utils.Common.clickElementByAction(Locators.KnygosLt.Home.linkCart);
    }

    public static void clickMenuAllBooks() {
        utils.Common.waitForElementToBeClickable(Locators.KnygosLt.Home.linkMenuAllBooks);
        utils.Common.clickElement(Locators.KnygosLt.Home.linkMenuAllBooks);
    }

    public static void clickMenuPopularPsychology() {
        utils.Common.clickElementByAction(Locators.KnygosLt.Home.linkPopularPsychology);
    }

    public static void setSearchText(String searchText) {
        utils.Common.sendKeyToElement(Locators.KnygosLt.Home.inputSearch, searchText);
    }

    public static void clickSearchButton() {
        utils.Common.clickElement(Locators.KnygosLt.Home.buttonSearch);
    }

}


