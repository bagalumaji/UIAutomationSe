package reports;

import com.aventstack.extentreports.ExtentTest;

import java.util.Objects;

public final class ExtentManger {
    private ExtentManger(){}

    private static ThreadLocal<ExtentTest> extentTestThreadLocal = new ThreadLocal<>();

    static void setExtentTest(ExtentTest extentTest){
        if(Objects.nonNull(extentTest)){
            extentTestThreadLocal.set(extentTest);
        }
    }

    public static ExtentTest getExtentTest(){
        return extentTestThreadLocal.get();
    }

    static void unload(){
        extentTestThreadLocal.remove();
    }

}
