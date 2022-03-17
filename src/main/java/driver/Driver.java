package driver;

import factory.DriverFactory;
import org.aeonbits.owner.ConfigFactory;
import propertyreader.FrameworkConfig;

import java.time.Duration;
import java.util.Objects;

public class Driver {
    private static FrameworkConfig config = ConfigFactory.create(FrameworkConfig.class);
    public static void createDriver(String browserName) {
        if (Objects.isNull(DriverManager.getDriver())) {
            DriverManager.setDriver(DriverFactory.getDriver(browserName));
            DriverManager.getDriver().manage().window().maximize();
            DriverManager.getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(config.pageLoadTimeout()));
            DriverManager.getDriver().get(config.url());
        }
    }

    public static void quitDriver() {
        if (Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }

}
