package ClassReview2;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class R1 extends CommonMethods {
    public static void main(String[] args) {
        openBrowserAndLaunchApplication("https://the-internet.herokuapp.com/dynamic_controls","chrome");
        //find the check box and click on it
       WebElement checkBox=driver.findElement(By.xpath("//input[@type='checkbox']"));
       checkBox.click();


//        get the button and click on it
        WebElement removeButton = driver.findElement(By.xpath("//button[text()='Remove']"));
        removeButton.click();
        //        we have to verify that the text it's gone appears up
        WebElement text = driver.findElement(By.xpath("//button[text()='Add']/following-sibling::p"));
        System.out.println(text.getText());

//        get the button enable
        WebElement enableBtn = driver.findElement(By.xpath("//form[@id='input-example']/child::button"));
        enableBtn.click();
//explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        wait until
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id='input-example']/child::input")));
//   now send some text
        WebElement textBox = driver.findElement(By.xpath("//form[@id='input-example']/child::input"));
        System.out.println(textBox.isEnabled());
    }
}
