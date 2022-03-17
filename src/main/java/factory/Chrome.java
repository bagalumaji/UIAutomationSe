package factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public final class Chrome implements IBrowser {

    public WebDriver initDriver(){
        WebDriverManager.chromedriver().setup();
       return new ChromeDriver(getChromeOptions());
    }

    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        return options;
    }

}
