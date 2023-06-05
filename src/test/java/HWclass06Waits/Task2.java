package HWclass06Waits;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Task2 extends CommonMethods {
    public static void main(String[] args) {

        String url="http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement user= driver.findElement(By.xpath("//button[text()='Get New User']"));
        user.click();
        WebElement name= driver.findElement(By.xpath("//p[contains(text(),'First Name ')]"));
        System.out.println(name.getText());
        WebElement lastName= driver.findElement(By.xpath("//p[contains(text(),'Last Name ')]"));
        System.out.println(lastName.getText());
        closeBrowser();




    }
}
