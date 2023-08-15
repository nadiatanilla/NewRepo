package PracticeSelenium;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class alerts extends CommonMethods {
    public static void main(String[] args) {
        openBrowserAndLaunchApplication("http://practice.syntaxtechs.net/bootstrap-alert-messages-demo.php", "chrome");

     //   WebElement alert1 = driver.findElement(By.id("autoclosable-btn-success"));
     //   alert1.click();
        WebElement alert2 = driver.findElement(By.id("normal-btn-success"));
        alert2.click();
        WebElement alert=driver.findElement(By.xpath("//div[@class='alert alert-success alert-normal-success']"));
      driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();


    }}