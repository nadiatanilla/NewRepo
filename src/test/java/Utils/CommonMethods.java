package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.time.Duration;

public class CommonMethods {
    public static WebDriver driver;

    public static void openBrowserAndLaunchApplication(String url, String browser) {
        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
        }
        driver.manage().window().maximize();
        // driver=new ChromeDriver();
        driver.get(url);
        //  driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
    public static void selectByValue(String byValue,WebElement element){
        Select sel=new Select(element);
        sel.selectByValue(byValue);
    }
    public static void selectByVisibleText(String visibleText,WebElement element){
        Select sel=new Select(element);
        sel.selectByVisibleText(visibleText);
    }
    public static void selectByIndex(int index,WebElement element){
        Select sel=new Select(element);
        sel.selectByIndex(index);
    }
    // method for take screenShot
    public static final String SCREENSHOT_PATH=System.getProperty(("user.dir"))+"\\screenShot";
    public static void takeScreenShots(String fileName) {

        TakesScreenshot ss = (TakesScreenshot) driver;
        //take screen shot as output File
        File screenShot = ss.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenShot, new File(SCREENSHOT_PATH + fileName + ".png"));
        }catch(Exception exception){
            exception.printStackTrace();
        }
    }
    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
    public static void sendText(String text, WebElement element){
        element.clear();
        element.sendKeys(text);
    }
}