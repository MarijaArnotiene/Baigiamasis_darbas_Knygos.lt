package pages.knygos.lt;

import pages.Locators;

public class MyOrders {
    public static void open() {
        utils.Common.openUrl("https://www.knygos.lt/lt/dovanu-kuponai/knygos-lt-dovanu-kuponas-atsispausdink-pats/");
    }

    public static void setValue() {
        utils.Common.clickElementByAction(Locators.KnygosLt.GiftCertificates.value10eur);
    }

    public static void addToCart() {
        utils.Common.clickElementByAction(Locators.KnygosLt.GiftCertificates.addToCartLink);
    }
}
