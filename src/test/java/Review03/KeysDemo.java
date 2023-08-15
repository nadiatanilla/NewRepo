package Review03;

import Utils.CommonMethods;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class KeysDemo extends CommonMethods {
    public static void main(String[] args) throws InterruptedException, IOException {
        openBrowserAndLaunchApplication("https://the-internet.herokuapp.com/key_presses","chrome");
        WebElement key= driver.findElement(By.id("target"));
        key.sendKeys(Keys.ENTER);
        key= driver.findElement(By.id("target"));
        Thread.sleep(2000);

        key.sendKeys(Keys.TAB);
        key= driver.findElement(By.id("target"));
        Thread.sleep(2000);
        key.sendKeys(Keys.ARROW_DOWN);
// steps to take scrreeen shots
        TakesScreenshot ss=(TakesScreenshot) driver;
        //take screen shot as output File
        File screenShot=ss.getScreenshotAs(OutputType.FILE);
        String path=System.getProperty("user.dir");
        FileUtils.copyFile(screenShot,new File(path+"/screenShot/abc.png"));

    }
}
