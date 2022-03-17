package reports;

import com.aventstack.extentreports.MediaEntityBuilder;

import static utils.ScreenshotUtil.getScreenshotAsBase64Image;

public final class ExtentLogger {
    public static void pass(String message){
        ExtentManger.getExtentTest().pass(message);
    }
    public static void fail(String message){
        ExtentManger.getExtentTest().fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(getScreenshotAsBase64Image()).build());
    }

    public static void info(String message){
        ExtentManger.getExtentTest().info(message);
    }

    public static void skip(String message){
        ExtentManger.getExtentTest().skip(message, MediaEntityBuilder.createScreenCaptureFromBase64String(getScreenshotAsBase64Image()).build());
    }
}
