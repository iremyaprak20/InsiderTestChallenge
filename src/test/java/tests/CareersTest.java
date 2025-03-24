package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CareersPage;
import pages.HomePage;
import utils.BaseTest;

public class CareersTest extends BaseTest {

    @Test
    public void testCase1_CheckHomePageOpened(){
        HomePage homePage = new HomePage(driver);

        Assert.assertTrue(homePage.isHomePageOpened(), "Home page is not opened!");
    }

    @Test
    public void testCase2_CheckCareersPageAndSections() {
        HomePage homePage = new HomePage(driver);
        CareersPage careersPage = new CareersPage(driver);

        // Step 1: Navigate to Careers page
        homePage.navigateToCareers();

        // Step 2: Verify Careers page sections are displayed
        Assert.assertTrue(careersPage.areCareerSectionsDisplayed(),
                "Career page sections (Locations, Teams, Life at Insider) are not displayed!");
    }



}
