package class09;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RightAndDoubleClickAction extends CommonMethods {
    public static void main(String[] args) {
        openBrowserAndLaunchApplication("http://demo.guru99.com/test/simple_context_menu.html","chrome");

        WebElement rightClick=driver.findElement(By.xpath("//span[text()='right click me']"));

        Actions act= new Actions(driver);
        // perform right click
      //  right click is also=== context click
        act.contextClick(rightClick).perform();
        // find Element
       WebElement edit= driver.findElement(By.xpath("//span[text()='Edit']"));
        act.click(edit).perform();

        Alert alert=driver.switchTo().alert();
        alert.accept();

        WebElement doubleClick=driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me ')]"));
        act.doubleClick(doubleClick).perform();
    }
}
