package pages;

import base.BasePage;
import helper.SelectHelper;
import logger.FrameworkLogger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignupPage extends BasePage {

    @FindBy(id = "id_gender1")
    private WebElement radioMr;

    public SignupPage() {
    }

    public SignupPage clickOnMrRadioButton() {
        click(radioMr, "clicked on Mr radio button");
        return this;
    }

    @FindBy(id = "password")
    private WebElement textBoxPassword;

    public SignupPage enterPassword(String password) {
        type(textBoxPassword, password, "entered password as : " + password);
        return this;
    }

    @FindBy(id = "days")
    private WebElement selectDays;

    public SignupPage selectDayByVisibleText(String day) {
        SelectHelper.selectByVisibleText(selectDays, day);
        FrameworkLogger.log("selected day by visible text : " + day);
        return this;
    }

    @FindBy(id = "months")
    private WebElement selectMonths;

    public SignupPage selectMonthByVisibleText(String month) {
        SelectHelper.selectByVisibleText(selectMonths, month);
        FrameworkLogger.log("selected month by visible text : " + month);
        return this;
    }

    @FindBy(id = "years")
    private WebElement selectYears;

    public SignupPage selectYearByVisibleText(String year) {
        SelectHelper.selectByVisibleText(selectYears, year);
        FrameworkLogger.log("selected year by visible text : " + year);
        return this;
    }

    @Override
    public boolean isPageLoaded() {
        return waitForElement(radioMr);
    }
}
