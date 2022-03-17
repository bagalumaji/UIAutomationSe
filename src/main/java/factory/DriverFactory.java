package factory;

import exception.BrowserNotSupportedException;
import org.openqa.selenium.WebDriver;

public class DriverFactory {

    public static WebDriver getDriver(String browserName) {
        WebDriver driver = null;
        if (browserName.equalsIgnoreCase("chrome")) {
           driver = new Chrome().initDriver();
        }else if(browserName.equalsIgnoreCase("firefox")) {
          driver = new FireFox().initDriver();
        }else if(browserName.equalsIgnoreCase("edge")) {
            driver = new Edge().initDriver();
        }else {
            throw  new BrowserNotSupportedException(browserName + " is not supported");
        }
        return driver;
    }
}
