package pages;

import base.BasePage;
import org.openqa.selenium.By;
import utils.ConfigReader;

public class LoginPage extends BasePage {

    private By username = By.cssSelector("[data-test='username']");
    private By password = By.cssSelector("[data-test='password']");
    private By loginButton = By.cssSelector("[data-test='login-button']");

    public void open() {
        driver.get(ConfigReader.get("url"));
    }

    public void login() {
        type(username, ConfigReader.get("username"));
        type(password, ConfigReader.get("password"));
        click(loginButton);
    }

    public boolean isLoginSuccessful() {
        return driver.getCurrentUrl().contains("inventory");
    }
}