package base;

import driver.DriverManager;
import factory.ExplicitWaitFactory;
import logger.FrameworkLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static factory.ExplicitWaitFactory.waitForElementToBeClickable;
import static factory.ExplicitWaitFactory.waitForVisibilityOfElement;
import static logger.FrameworkLogger.log;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    public abstract boolean isPageLoaded();

    protected void click(WebElement element, String loggingMessage) {
        waitForElementToBeClickable(element).click();
        log(loggingMessage);
    }

    protected void type(WebElement element, String message, String loggingMessage) {
        waitForVisibilityOfElement(element).sendKeys(message);
        log(loggingMessage);
    }

    protected boolean waitForElement(WebElement element) {
        FrameworkLogger.log("waiting for element");
        return ExplicitWaitFactory.waitForVisibilityOfElement(element).isDisplayed();
    }
    protected boolean isDisplayed(WebElement element,String message){
        log(message);
        return ExplicitWaitFactory.waitForVisibilityOfElement(element).isDisplayed();
    }
    protected boolean isDisplayed(By locator, String message){
        log(message);
        return ExplicitWaitFactory.waitForPresenceOfLocator(locator).isDisplayed();
    }
}
