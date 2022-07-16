package pages.knygos.lt;

import pages.Locators;

public class Cart {
    public static String readEmptyCartMessage() {
        return utils.Common.getElementText(Locators.KnygosLt.Cart.emptyCartMessage);
    }

    public static void clickChooseItemButton() {
        utils.Common.clickElementByAction(Locators.KnygosLt.Cart.chooseItemButton);
    }
}
