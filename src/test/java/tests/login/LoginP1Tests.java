package tests.login;

import helper.AssertionHelper;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.UsersHomePage;
import tests.basetest.BaseTest;

import static config.ConfigReader.getConfigReader;

public class LoginP1Tests extends BaseTest {

    @Test(description = "Test Case 2 Login User With Correct Email & Password")
    public void tc2LoginUserWithCorrectEmailAndPassword() {
        HomePage homePage = new HomePage();
        AssertionHelper.assertTrue(homePage.isPageLoaded());

        UsersHomePage usersHomePage = homePage
                .clickOnSignupLoginButton()
                .enterUserEmail(getConfigReader().userId())
                .enterUserPassword(getConfigReader().password())
                .clickOnLoginButton();
        AssertionHelper.assertTrue(usersHomePage.isPageLoaded());

        AssertionHelper.assertTrue(usersHomePage.isUserNameVisible(getConfigReader().userName()));
    }
}

