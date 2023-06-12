package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class KeysClass extends CommonMethods {
    public static void main(String[] args) {
        openBrowserAndLaunchApplication("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx","chrome");

        //locate the text box user name
        WebElement user=driver.findElement(By.id("ctl00_MainContent_username"));
        user.sendKeys("Tester", Keys.TAB);
        // locate the text box password
        WebElement pass= driver.findElement(By.id("ctl00_MainContent_password"));
        pass.sendKeys("test",Keys.ENTER);
    }
}
