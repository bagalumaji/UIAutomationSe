package helper;

import logger.FrameworkLogger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public final class SelectHelper {
    private SelectHelper(){}

    public static void selectByVisibleText(WebElement element,String visibleText){
        Select select = new Select(element);
        select.selectByVisibleText(visibleText);
    }
}
