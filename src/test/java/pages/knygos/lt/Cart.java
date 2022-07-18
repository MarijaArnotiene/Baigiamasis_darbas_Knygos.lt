package pages.knygos.lt;

import pages.Common;
import pages.Locators;

public class Cart {
    public static String readEmptyCartMessage() {
        return Common.getElementText(Locators.KnygosLt.Cart.emptyCartMessage);
    }

    public static void clickChooseItemButton() {
        Common.clickElementByAction(Locators.KnygosLt.Cart.chooseItemButton);
    }
}
