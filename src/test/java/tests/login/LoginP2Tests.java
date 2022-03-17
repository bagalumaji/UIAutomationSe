package tests.login;

import helper.AssertionHelper;
import org.testng.annotations.Test;
import pages.HomePage;
import tests.basetest.BaseTest;

import java.lang.reflect.Method;

public class LoginP2Tests extends BaseTest {

    @Test
    public void demoTest(Method method) {
        HomePage homePage = new HomePage();
        AssertionHelper.assertTrue(true);
        //homePage.clickOnSignupLoginButton();
    }

}
