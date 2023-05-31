package HWclass05;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task2 extends CommonMethods {
    public static void main(String[] args) {
        openBrowserAndLaunchApplication("https://chercher.tech/practice/frames","chrome");
        driver.switchTo().frame("frame1");

        driver.switchTo().frame("frame3");
        WebElement checkBox= driver.findElement(By.xpath("//input[@id='a']"));
        checkBox.click();
        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame2");

        WebElement animal= driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel=new Select(animal);
        sel.selectByVisibleText("Baby Cat");

        driver.switchTo().defaultContent();

       driver.switchTo().frame("frame1");
        WebElement text= driver.findElement(By.xpath("//input"));
        text.sendKeys("Syntax Technology");

        closeBrowser();
    }

}
