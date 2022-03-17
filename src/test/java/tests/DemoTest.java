package tests;

import com.creditdatamw.zerocell.Reader;
import helper.AssertionHelper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import testdata.PersonTestData;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.List;

public class DemoTest extends Base{


    //  @Test(description = "Test Case 2 Login User With Correct Email & Password")
    public void tc2LoginUserWithCorrectEmailAndPassword() throws InterruptedException, AWTException {
        String filePath = "E:\\interview programs\\UIFrameWork\\src\\test\\resources\\testdata\\test.pdf";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebElement r;
        driver.manage().window().maximize();
        //  driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
        driver.navigate().to("https://www.naukri.com/registration/createAccount?othersrcp=22636");
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();
        Thread.sleep(5000);
        driver.navigate().refresh();
      /*  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Thread.sleep(10000);
        driver.findElement(By.xpath("//input[@id='resumeUpload']")).sendKeys(filePath);
        Thread.sleep(3000);
      //  driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
        Thread.sleep(3000);*/


        Robot robot = new Robot();


        //  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(filePath),null);

       /*  robot.keyPress(KeyEvent.VK_CONTROL);
         robot.keyPress(KeyEvent.VK_V);
         robot.keyRelease(KeyEvent.VK_V);
         robot.keyRelease(KeyEvent.VK_CONTROL);
         Thread.sleep(3000);
         robot.keyPress(KeyEvent.VK_ENTER);
         robot.keyRelease(KeyEvent.VK_ENTER);*/


    }

    @Test
    public void f() {
        System.out.println("f test method");
    }

}
