package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JSExecutorDemo2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
openBrowserAndLaunchApplication("http://amzon.com","chrome");

// perform scroll down operation using java script
        JavascriptExecutor js=(JavascriptExecutor) driver;
        //scroll down
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
        //scroll up

        js.executeScript("window.scrollBy(0,-500)");

        WebElement all= driver.findElement(By.id("searchDropdownBox"));

        js.executeScript("arguments[0].click();",all);
    }
}
