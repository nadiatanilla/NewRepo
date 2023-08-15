package class09;

import Utils.CommonMethods;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class ScreenShot extends CommonMethods {
    public static void main(String[] args)  {
        String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);


        WebElement log=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        JavascriptExecutor java=(JavascriptExecutor) driver;
        java.executeScript("arguments[0].click();",log);

        //take screen shot

        TakesScreenshot ss=(TakesScreenshot) driver;
        //take screen shot as output File
        try{
        File screenShot=ss.getScreenshotAs(OutputType.FILE);
        // save it in your computer
        FileUtils.copyFile(screenShot,new File("C:\\Users\\usa20\\IdeaProjects\\syntaxSeleniumBatch16\\screenshot\\testSyntax1.png"));
    }catch(IOException io){
    io.printStackTrace();
    }
}
}