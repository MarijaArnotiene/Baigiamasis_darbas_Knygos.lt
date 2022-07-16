package pages.knygos.lt;

import pages.Locators;

public class Home {

    public static void open() {
        utils.Common.openUrl("https://www.knygos.lt/");
    }

    public static void clickCart() {
        utils.Common.clickElementByAction(Locators.KnygosLt.Home.linkCart);
    }
}
