package pages.knygos.lt;

import pages.Common;
import pages.Locators;

public class Cart {
    public static void open() {
        Common.openUrl("https://www.knygos.lt/cart");
    }

    public static String readEmptyCartMessage() {
        return Common.getElementText(Locators.KnygosLt.Cart.emptyCartMessage);
    }

    public static void clickChooseItemButton() {
        Common.clickElementByAction(Locators.KnygosLt.Cart.chooseItemButton);
    }

    public static String readCartStepMessage(int stepNumber) {

        switch (stepNumber) {
            case 1:
                return Common.getElementText(Locators.KnygosLt.Cart.step1Label);
            case 2:
                return Common.getElementText(Locators.KnygosLt.Cart.step2Label);
            case 3:
                return Common.getElementText(Locators.KnygosLt.Cart.step3Label);
            case 4:
                return Common.getElementText(Locators.KnygosLt.Cart.step4Label);
            case 5:
                return Common.getElementText(Locators.KnygosLt.Cart.step5Label);
        }

        return null;
    }
}
