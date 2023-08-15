package PracticeSelenium;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DropAndDrop extends CommonMethods {
    public static void main(String[] args) {
        String url="http://practice.syntaxtechs.net/drag-and-drop-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement drag1=driver.findElement(By.xpath("//span[text()='Draggable 1']"));
        WebElement drop=driver.findElement((By.id("mydropzone")));
        Actions act=new Actions(driver);
        act.clickAndHold(drag1).moveToElement(drop).release().build().perform();
      //  WebElement list=driver.findElement(By.xpath("//span[text()='Draggable 1']"));
     //   WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
      //  wait.until(ExpectedConditions.textToBePresentInElement(list,"Draggable 1"));
        WebElement list=driver.findElement(By.id("droppedlist"));
        act.clickAndHold(drop).moveToElement(list).release().build().perform();

    }

}
