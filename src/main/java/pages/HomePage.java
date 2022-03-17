package pages;

import base.BasePage;
import logger.FrameworkLogger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//div[@id='slider-carousel']")
    private WebElement slider;

    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    private WebElement btnSignupLogin;

    public LoginPage clickOnSignupLoginButton(){
       click(btnSignupLogin,"clicked on Signup / Login link");
       return new LoginPage();
    }

    @Override
    public boolean isPageLoaded(){
        boolean elementStatus = waitForElement(slider);
        FrameworkLogger.log("Status of element : "+elementStatus);
        return elementStatus;
    }
}
