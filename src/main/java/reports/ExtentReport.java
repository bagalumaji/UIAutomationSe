package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.util.Objects;

public final class ExtentReport {
    private ExtentReport() {
    }

    private static ExtentReports extentReports;

    public static void initReport() {
        if(Objects.isNull(extentReports)) {
            extentReports = new ExtentReports();
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter("index.html");
            sparkReporter.config().setTheme(Theme.STANDARD);
            sparkReporter.config().setReportName("UI Framework");
            sparkReporter.config().setDocumentTitle("Yash Testing Academy....");
            extentReports.attachReporter(sparkReporter);
        }
    }

    public static void createExtentTest(String testcase) {
        ExtentManger.setExtentTest(extentReports.createTest(testcase));
    }

    public static void flushReport(){
        if(Objects.nonNull(extentReports)) {
            extentReports.flush();
            ExtentManger.unload();
        }
    }
}
