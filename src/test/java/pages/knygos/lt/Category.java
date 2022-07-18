package pages.knygos.lt;

import pages.Common;
import pages.Locators;

public class Category {
    public static String readPopularPsycologyHeader() {
        return Common.getElementText(Locators.KnygosLt.Category.PopularPsycologyHeader);
    }
}
