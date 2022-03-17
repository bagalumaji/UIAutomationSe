package factory;

import config.ConfigReader;
import driver.DriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import propertyreader.FrameworkConfig;

import java.time.Duration;

public final class ExplicitWaitFactory {
    private ExplicitWaitFactory(){}
    public static WebElement waitForVisibilityOfElement(WebElement element){
        return getWebDriverWait().until(ExpectedConditions.visibilityOf(element));
    }

    public static WebElement waitForElementToBeClickable(WebElement element){
        return getWebDriverWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    public static WebElement waitForElementToBeClickable(By locator){
        return getWebDriverWait().until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static WebElement waitForPresenceOfLocator(By locator){
      //  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        return getWebDriverWait().until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    private static WebDriverWait getWebDriverWait(){
        return new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(ConfigReader.getConfigReader().explicitTimeout()));
    }

}
