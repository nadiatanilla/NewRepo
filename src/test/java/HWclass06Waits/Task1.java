package HWclass06Waits;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task1 extends CommonMethods {
    public static void main(String[] args) {
        openBrowserAndLaunchApplication("http://practice.syntaxtechs.net/dynamic-elements-loading.php","chrome");

        // click on the start button
        WebElement start= driver.findElement(By.xpath("//button[text()='Start']"));
        start.click();

        WebElement message=driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        // explicit wait
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBePresentInElement(message,"Welcome Syntax Technologies"));

        String text= message.getText();
        System.out.println(" The Text is "+text);



    }
}
