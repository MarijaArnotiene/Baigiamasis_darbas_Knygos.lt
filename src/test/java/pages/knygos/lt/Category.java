package pages.knygos.lt;

import pages.Common;
import pages.Locators;

public class Category {
    public static void open() {
        Common.openUrl("https://www.knygos.lt/lt/knygos/zanras/zaislai-ir-zaidimai-vaikams/");
    }
    public static String readPopularPsycologyHeader() {
        return Common.getElementText(Locators.KnygosLt.Category.PopularPsycologyHeader);
    }
}
