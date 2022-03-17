package utils;

import org.openqa.selenium.By;

public final class DynamicXpathUtil {

    private DynamicXpathUtil(){}

    public static By getXpath(String xpath,String name){
        return By.xpath(String.format(xpath,name));
    }

    public static By getXpath(String xpath,String name1,String name2){
        return By.xpath(String.format(xpath,name1,name2));
    }
}
