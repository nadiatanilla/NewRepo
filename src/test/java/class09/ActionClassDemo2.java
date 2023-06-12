package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo2 extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://jqueryui.com/droppable/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        //as element in iframe we need to switch
        driver.switchTo().frame(0);
        //find draggable webElement
        WebElement drag= driver.findElement(By.id("draggable"));
        // element you want to drop to
        WebElement drop= driver.findElement(By.id("droppable"));
        //action class
        Actions act=new Actions(driver);
        //choose suitable action
        act.dragAndDrop(drag,drop).perform();
    }
}