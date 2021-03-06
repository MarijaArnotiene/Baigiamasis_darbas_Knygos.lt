package pages.knygos.lt;

import pages.Common;
import pages.Locators;

public class MyOrders {
    public static void open() {
        Common.openUrl("https://www.knygos.lt/lt/pirkejas/prisijungti/?next=/user/orders");
    }

    public static void writeEmail(String email) {
        Common.sendKeyToElement(Locators.KnygosLt.MyOrders.inputEmail, email);
    }

    public static void clickBuyWithoutRegistration() {
        Common.clickElement(Locators.KnygosLt.MyOrders.inputBuyWithoutRegistration);
    }

    public static String readErrorText() {
        return Common.getElementText(Locators.KnygosLt.MyOrders.errorText);
    }
}
