package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ActionClassDemo1 extends CommonMethods {
    public static void main(String[] args) {
        String url="http://amazon.com/";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
// find element that you want to hover yor cursor to
       WebElement hello=driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
        //action class
        Actions action=new Actions(driver);
        //perform the desired action
        action.moveToElement(hello);
    }
}
