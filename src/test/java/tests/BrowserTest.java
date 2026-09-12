package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class BrowserTest extends BaseTest {

    @Test
    public void searchTest() {
        HomePage homePage = new HomePage();

        homePage.open();
        homePage.search("Selenium Java");
    }
}