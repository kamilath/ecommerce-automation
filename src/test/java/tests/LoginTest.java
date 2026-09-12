package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void validLogin() {
        LoginPage loginPage = new LoginPage();

        loginPage.open();
        loginPage.login();

        Assert.assertTrue(loginPage.isLoginSuccessful());
    }
}