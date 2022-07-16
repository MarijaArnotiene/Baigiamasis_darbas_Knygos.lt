package pages.knygos.lt;

import pages.Locators;

public class Category {
    public static String readPopularPsycologyHeader() {
        return utils.Common.getElementText(Locators.KnygosLt.Category.PopularPsycologyHeader);
    }
}
