package HWclass05;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class task1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement alert3= driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alert3.click();
        Thread.sleep(3000);
        Alert config3=driver.switchTo().alert();
        //  Thread.sleep(3000);
        config3.sendKeys("Hello world");

        config3.accept();
        Thread.sleep(3000);

        closeBrowser();

    }

}
