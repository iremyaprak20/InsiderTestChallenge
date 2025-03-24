package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.BaseTest;

public class CareersTest extends BaseTest {

    @Test
    public void testCase1_CheckHomePageOpened(){
        HomePage homePage = new HomePage(driver);

        Assert.assertTrue(homePage.isHomePageOpened(), "Home page is not opened!");
    }
}
