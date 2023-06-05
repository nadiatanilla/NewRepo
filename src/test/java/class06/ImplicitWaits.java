package class06;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class ImplicitWaits extends CommonMethods {
    public static void main(String[] args) {
        String url="https:www.facebook.com/";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        // for the implicit waits we can use it for all the code .it is global so did it just after open the browser
        //declaring the implicit wait in the start as it is a global wait ,we want it to be implemented on all webElements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement createAccount=driver.findElement(By.xpath("//a[text()='Create new account'] "));
        createAccount.click();
        WebElement firstName= driver.findElement(By.xpath("//input[@name='firstname']"));
      //  firstName.sendKeys("Abracadabra");
        sendText("Abracadabra",firstName);// we can use this sendText helper method
    }
}
