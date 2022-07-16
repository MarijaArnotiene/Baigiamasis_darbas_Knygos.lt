package pages;

import org.openqa.selenium.By;

public class Locators {

    public static class KnygosLt {

        public static class Cart {

            public static By emptyCartMessage =
                    By.xpath("//div[@class='card-body p-5 text-center text-muted k-cart-empty']//div");
            public static By chooseItemButton = By.xpath("//a[@class='btn btn-outline-primary px-5']");
        }
        public static class Home {

            public static By linkCart = By.xpath("//div[@id='cart']//a");
            public static By linkMenuAllBooks = By.xpath("//a[@id='all-products']");
            public static By linkPopularPsychology =
                    By.xpath("//a[@class='ico-sm-right-after' and text()='Populiarioji psichologija']");
            public static By inputSearch = By.xpath("//input[@id='product-search']");

            public static By buttonSearch = By.xpath("//form[@id='main-search-form']//button");
            public static By acceptCookiesLink = By.xpath("//a[@class='cc-btn cc-allow']");

        }
        public static class Category {

            public static By PopularPsycologyHeader = By.xpath("//*[@class='mb-0']");
        }
        public static class Search{

            public static By searchResult = By.xpath("//div[@class='categorie-description']//strong[1]");
            public static By toCartButton =
                    By.xpath("(//button[@class='button buy btn btn-primary btn-buy w-100 mt-3'])[1]");
        }

        public static class GiftCertificates {

            public static By value10eur =
                    By.xpath("//input[@id='add_to_cart_single_custom_params_value_value_preset_0']");
            public static By addToCartLink = By.xpath("//a[@id='add-coupon-to-cart']");

        }
    }
}
