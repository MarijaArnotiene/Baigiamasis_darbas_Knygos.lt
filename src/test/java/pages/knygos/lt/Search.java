package pages.knygos.lt;

import pages.Locators;

public class Search {
    public static String readSearchResultMessage(){
        return utils.Common.getElementText(Locators.KnygosLt.Search.searchResult);
    }

    public static void clickToCartButton() {
        utils.Common.clickElement(Locators.KnygosLt.Search.toCartButton);
    }
}
