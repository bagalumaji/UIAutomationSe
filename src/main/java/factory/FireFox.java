package factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public final class FireFox implements IBrowser {

    @Override
    public WebDriver initDriver() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver(getFireFoxOption());
    }

    private FirefoxOptions getFireFoxOption(){
        FirefoxOptions options = new FirefoxOptions();
        return options;
    }
}
