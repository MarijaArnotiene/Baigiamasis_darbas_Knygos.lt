package pages;

import org.openqa.selenium.By;

public class Locators {

    public static class KnygosLt {
        public static class MyOrders {
            public static By inputEmail = By.xpath("//input[@id='pay-without-registration-email']");
            public static By inputBuyWithoutRegistration =
                    By.xpath("//input[@class='btn btn-outline-primary btn-block disable-on-submit']");
            public static By errorText = By.xpath("//div[@id='pay-without-registration-err']//div");
        }

        public static class Cart {
            public static By emptyCartMessage =
                    By.xpath("//div[@class='card-body p-5 text-center text-muted k-cart-empty']//div");
            public static By chooseItemButton = By.xpath("//a[@class='btn btn-outline-primary px-5']");
            public static By step1Label = By.xpath("//div[@class='cart-states']//li[1]//span");
            public static By step2Label = By.xpath("//div[@class='cart-states']//li[2]//span");
            public static By step3Label = By.xpath("//div[@class='cart-states']//li[3]//span");
            public static By step4Label = By.xpath("//div[@class='cart-states']//li[4]//span");
            public static By step5Label = By.xpath("//div[@class='cart-states']//li[5]//span");
        }

        public static class Home {
            public static By linkMenuAllBooks = By.xpath("//a[@id='all-products']");
            public static By linkPopularPsychology =
                    By.xpath("//a[@class='ico-sm-right-after' and text()='Populiarioji psichologija']");
            public static By inputSearch = By.xpath("//input[@id='product-search']");

            public static By buttonSearch = By.xpath("//form[@id='main-search-form']//button");
        }

        public static class Category {
            public static By PopularPsycologyHeader = By.xpath("//*[@class='mb-0']");
        }

        public static class Search {
            public static By searchResult = By.xpath("//div[@class='categorie-description']//strong[1]");
            public static By toCartButton =
                    By.xpath("(//button[@class='button buy btn btn-primary btn-buy w-100 mt-3'])[1]");
            public static By addToCartHeaderMessage =
                    By.xpath("//div[@id='post-add-to-cart-modal']//div[@class='modal-header border-bottom-0']");
        }
    }
}
