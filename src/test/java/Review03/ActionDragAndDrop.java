package Review03;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionDragAndDrop extends CommonMethods {
    public static void main(String[] args) {
        openBrowserAndLaunchApplication("https://jqueryui.com/droppable/","chrome");
        driver.switchTo().frame(0);
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
        Actions action=new Actions(driver);
        action.clickAndHold(draggable).moveToElement(droppable).release().build().perform();
        takeScreenShots("DropandDrag");
    }
}
