package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class CartPage extends BasePage {

    private By backpack = By.className("inventory_item_name");

    public boolean isBackpackPresent() {
        return find(backpack).isDisplayed();
    }
}