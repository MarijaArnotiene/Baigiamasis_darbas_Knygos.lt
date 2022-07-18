package pages.knygos.lt;

import pages.Common;
import pages.Locators;

public class Search {
    public static String readSearchResultMessage(){
        return Common.getElementText(Locators.KnygosLt.Search.searchResult);
    }

    public static void clickToCartButton() {
        Common.clickElement(Locators.KnygosLt.Search.toCartButton);
    }
}
