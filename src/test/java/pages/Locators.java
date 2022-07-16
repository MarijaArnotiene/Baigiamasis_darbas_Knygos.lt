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
            public static By toCartButton =
                    By.xpath("//button[@id='add_to_cart_single_add_to_cart_3854921']");
        }

        public static class Category {
            public static By PopularPsycologyHeader = By.xpath("//*[@class='mb-0']");
        }

        public static class Search{
            public static By searchResult = By.xpath("//div[@class='categorie-description']//strong[1]");
        }
    }
}
