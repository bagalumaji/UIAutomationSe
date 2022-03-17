package logger;

import reports.ExtentLogger;

public final class FrameworkLogger {
    private FrameworkLogger(){}
    public static void log(String loggingMessage){
        ExtentLogger.info(loggingMessage);
        System.out.println(loggingMessage);
    }

}
