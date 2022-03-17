package pages;

import base.BasePage;
import constants.FrameworkXpathConstants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.DynamicXpathUtil;

public class UsersHomePage extends BasePage {

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    private WebElement btnLogout;

    @Override
    public boolean isPageLoaded() {
        return waitForElement(btnLogout);
    }

    public boolean isUserNameVisible(String userName){
       return isDisplayed(DynamicXpathUtil.getXpath(FrameworkXpathConstants.XPATH_USER_NAME,userName)," waiting for element : "+userName);
    }

}
