package pages;

import base.BasePage;
import constants.FrameworkConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static constants.FrameworkXpathConstants.XPATH_USER_NAME;
import static factory.ExplicitWaitFactory.waitForPresenceOfLocator;
import static utils.DynamicXpathUtil.getXpath;

public class LoginPage extends BasePage {

    @FindBy(name = "email")
    private WebElement userEmail;

    @FindBy(name = "password")
    private WebElement userPassword;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    private WebElement btnLogin;

    @FindBy(xpath = "//h2[normalize-space()='Login to your account']")
    private WebElement headerLoginToYourAccount;

    @FindBy(name = "name")
    private WebElement textBoxName;

    @FindBy(xpath = "//button[text()='Signup']/preceding-sibling::input[@name='email']")
    private WebElement textBoxNewUserEmail;

    @FindBy(xpath = "//button[text()='Signup']")
    private WebElement btnSignup;

    public SignupPage clickOnSignupButton(){
        click(btnSignup,"clicked on signup button");
        return new SignupPage();
    }


    public LoginPage enterNewUserEmail(String newUserEmail) {
        type(textBoxNewUserEmail, newUserEmail, "entered new user email as : " + newUserEmail);
        return this;
    }

    public LoginPage enterName(String name) {
        type(textBoxName, name, "entered name as : " + name);
        return this;
    }

    public LoginPage enterUserEmail(String email) {
        type(userEmail, email, "entered email as : " + email);
        return this;
    }

    public LoginPage enterUserPassword(String password) {
        type(userPassword, password, "entered password as : " + password);
        return this;
    }

    public UsersHomePage clickOnLoginButton() {
        click(btnLogin, "clicked on login button");
        return new UsersHomePage();
    }

    public boolean checkForVisibleText(String visibleText) {
        return isDisplayed(waitForPresenceOfLocator(getXpath(XPATH_USER_NAME, visibleText)), visibleText);
    }

    public boolean isPageLoaded() {
        return checkForVisibleText(FrameworkConstants.getInstance().getLoginToYourAccount());//waitForElement(waitForPresenceOfLocator(getXpath(XPATH_USER_NAME,FrameworkConstants.getInstance().getLoginToYourAccount())));
    }

    private WebDriver driver;


}
