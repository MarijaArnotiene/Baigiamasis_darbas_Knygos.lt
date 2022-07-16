package pages;

import org.openqa.selenium.By;

public class Locators {

    public static class KnygosLt {

        public static class Cart{
            public static By emptyCartMessage =
                    By.xpath("//div[@class='card-body p-5 text-center text-muted k-cart-empty']//div");
            public static By chooseItemButton = By.xpath("//a[@class='btn btn-outline-primary px-5']");
        }

        public static class Home {
            public static By linkCart = By.xpath("//div[@id='cart']//a");
        }
    }
}
