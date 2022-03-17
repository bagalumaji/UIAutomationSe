package tests.basetest;

import config.ConfigReader;
import driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void setup() {
        Driver.createDriver(ConfigReader.getConfigReader().browser());
    }

    @AfterMethod
    public void tearDown() {
        Driver.quitDriver();
    }
}
