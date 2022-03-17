package helper;

import org.testng.Assert;

public final class AssertionHelper {
    private AssertionHelper(){}

    public static void assertTrue(boolean value){
        Assert.assertTrue(value);
    }

    public static void assertEqual(String actualValue,String expectedValue){
        Assert.assertEquals(actualValue,expectedValue);
    }
}
