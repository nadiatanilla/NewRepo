package class09;

import Utils.CommonMethods;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class ScreenShotRevise extends CommonMethods {
    public static void main(String[] args) {
        String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement log=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",log);

        TakesScreenshot ss=(TakesScreenshot)driver;
        File file=ss.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file,new File("C:\\Users\\usa20\\IdeaProjects\\syntaxSeleniumBatch16\\screenshot\\anotherScreenShot.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
