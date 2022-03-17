package utils;

public final class WaitForTaskToCompleteUtil {

    private WaitForTaskToCompleteUtil(){}

    public static void waitForSecond(){
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void waitForSeconds(int second){
        try {
            Thread.sleep(1000*second);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
