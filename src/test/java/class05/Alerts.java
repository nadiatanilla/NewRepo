package class05;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alerts extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement alert=driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alert.click();
        Thread.sleep(3000);
        // swith the foccus of the driver from the main page to the alert
        Alert conf=driver.switchTo().alert();
        conf.accept();

        //find the alert button2 and click on it
        WebElement alert2=driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alert2.click();
        Thread.sleep(3000);
       Alert config2= driver.switchTo().alert();
       config2.dismiss();
       // find the 3 alert and sendkeys

       WebElement  alert3= driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
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
