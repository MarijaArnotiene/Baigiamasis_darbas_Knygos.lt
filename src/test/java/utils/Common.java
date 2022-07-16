package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common {

    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static void clickElement(By locator) {
        getElement(locator).click();
    }

    public static void clickElementByAction(By locator) {
        WebElement element = getElement(locator);

        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(element);
        action.click();
        action.perform();
    }

    public static String getElementText(By locator) {
        return getElement(locator).getText();
    }

    public static void waitForElementToBeClickable(By locator) {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Constants.DURATION_TIMEOUT);
        webDriverWait.until(
                ExpectedConditions.elementToBeClickable(locator)
        );
    }

    public static void sendKeyToElement(By locator, String key) {
        getElement(locator).sendKeys(key);
    }
}
