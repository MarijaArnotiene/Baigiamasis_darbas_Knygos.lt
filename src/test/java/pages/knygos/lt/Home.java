package pages.knygos.lt;

import pages.Common;
import pages.Locators;

public class Home {

    public static void open() {
        Common.openUrl("https://www.knygos.lt/");
    }

    public static void setSearchText(String searchText) {
        Common.sendKeyToElement(Locators.KnygosLt.Home.inputSearch, searchText);
    }

    public static void clickSearchButton() {
        Common.clickElement(Locators.KnygosLt.Home.buttonSearch);
    }

}


