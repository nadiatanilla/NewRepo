package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JSExecutorClick extends CommonMethods {
    public static void main(String[] args) {
        openBrowserAndLaunchApplication("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx","chrome");

        WebElement log=driver.findElement(By.xpath("//input[@value='Login']"));
        JavascriptExecutor java=(JavascriptExecutor) driver;
        java.executeScript("arguments[0].click();",log);
    }
}
