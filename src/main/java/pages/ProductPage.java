package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage extends BasePage {

    private By backpack = By.cssSelector("[data-test='add-to-cart-sauce-labs-backpack']");
    private By cart = By.className("shopping_cart_link");

    public void addBackpack() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(backpack));
        click(backpack);
    }

    public void openCart() {
        click(cart);
    }
}