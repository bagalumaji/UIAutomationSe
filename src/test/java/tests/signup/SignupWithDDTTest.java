package tests.signup;

import com.creditdatamw.zerocell.Reader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testdata.PersonTestData;
import tests.basetest.BaseTest;

import java.io.File;
import java.util.Iterator;
import java.util.List;

public class SignupWithDDTTest extends BaseTest {

    @Test(dataProvider = "getData", description = "Test Case 1 : Register User : DDT")
    public void testCase1RegisterUser(PersonTestData personTestData) {
        System.out.println(personTestData);
      /*  HomePage homePage = new HomePage();
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
        WaitForTaskToCompleteUtil.waitForSeconds(10);*/
    }

    @DataProvider
    public Iterator<PersonTestData> getData() {
        List<PersonTestData> personTestData = Reader
                .of(PersonTestData.class)
                .from(new File("src/test/resources/testdata/signup.xlsx"))
                .skipHeaderRow(true)
                .sheet("signup")
                .list();
        return personTestData.iterator();
    }
}
