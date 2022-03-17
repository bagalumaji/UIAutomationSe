package tests.signup;

import com.github.javafaker.Faker;
import config.ConfigReader;
import constants.FrameworkConstants;
import helper.AssertionHelper;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SignupPage;
import tests.basetest.BaseTest;
import utils.FakerUtil;
import utils.WaitForTaskToCompleteUtil;

import static config.ConfigReader.getConfigReader;
import static helper.AssertionHelper.assertTrue;
import static utils.FakerUtil.getEmail;
import static utils.FakerUtil.getUserName;

public class SignupTests extends BaseTest {

    @Test(description = "Test Case 1 : Register User")
    public void testCase1RegisterUser() {
        HomePage homePage = new HomePage();
        assertTrue(homePage.isPageLoaded());
        boolean newUserSignupText = homePage
                .clickOnSignupLoginButton()
                .checkForVisibleText(FrameworkConstants.getInstance().getNewUserSignup());
        assertTrue(newUserSignupText);

        LoginPage loginPage = new LoginPage();

        SignupPage signupPage = loginPage.enterName(getUserName()).enterNewUserEmail(getEmail()).clickOnSignupButton();

        assertTrue(signupPage.isPageLoaded());
        signupPage
                .clickOnMrRadioButton()
                .enterPassword(FakerUtil.getPassword())
                .selectDayByVisibleText(getConfigReader().day())
                .selectMonthByVisibleText(getConfigReader().month())
                .selectYearByVisibleText(getConfigReader().year());
        WaitForTaskToCompleteUtil.waitForSeconds(10);

    }

}
