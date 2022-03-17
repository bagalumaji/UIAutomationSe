package factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Edge implements IBrowser{
    @Override
    public WebDriver initDriver() {
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }
    private EdgeOptions getEdgeOptions(){
        EdgeOptions options = new EdgeOptions();
        return options;
    }
}
