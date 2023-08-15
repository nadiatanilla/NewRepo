package class05;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class alertRevise extends CommonMethods {
    public static void main(String[] args) {
        String Url="https://the-internet.herokuapp.com/iframe";
        String browser="chrome";
        openBrowserAndLaunchApplication(Url,browser);

        driver.switchTo().frame(0);
        WebElement comment= driver.findElement(By.xpath("//body[@id='tinymce']"));
        comment.clear();
        comment.sendKeys("I am  a QA enginner");


    }
}
