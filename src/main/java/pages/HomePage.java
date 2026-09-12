package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private By searchBox = By.name("q");

    public void open() {
        driver.get("https://www.google.com");
    }

    public void search(String text) {
        type(searchBox, text);
    }
}