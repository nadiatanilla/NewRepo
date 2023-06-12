import Utils.CommonMethods;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class ScreenShotMethod extends CommonMethods {

    // create a variable hold the  screen Shot path
        public static final String SCREENSHOT_PATH = System.getProperty(("user.dir")) + "\\screenShot\\";
        public static void takeScreenShots (String fileName){

            TakesScreenshot ss = (TakesScreenshot) driver;
            //take screenshot as output File
            File screenShot = ss.getScreenshotAs(OutputType.FILE);
            //throw exception
            try {
                FileUtils.copyFile(screenShot, new File(SCREENSHOT_PATH + fileName ));
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
