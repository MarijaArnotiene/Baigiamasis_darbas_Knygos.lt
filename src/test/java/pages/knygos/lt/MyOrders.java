package pages.knygos.lt;

import pages.Locators;

public class MyOrders {

    public static void writeEmail(String email) {
        utils.Common.sendKeyToElement(Locators.KnygosLt.MyOrders.inputEmail, email);
    }

    public static void clickBuyWithoutRegistration() {
        utils.Common.clickElement(Locators.KnygosLt.MyOrders.inputBuyWithoutRegistration);
    }

    public static String readErrorText() {
        return utils.Common.getElementText(Locators.KnygosLt.MyOrders.errorText);
    }
}
