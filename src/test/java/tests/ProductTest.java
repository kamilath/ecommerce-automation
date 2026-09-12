package tests;

import base.BaseTest;
import listeners.RetryAnalyzer;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductPage;
import pages.CartPage;
import org.testng.Assert;

public class ProductTest extends BaseTest {

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void addProductToCart() {
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();
        CartPage cartPage = new CartPage();

        loginPage.open();
        loginPage.login();

        productPage.addBackpack();
        productPage.openCart();

        Assert.assertTrue(cartPage.isBackpackPresent());
    }
}