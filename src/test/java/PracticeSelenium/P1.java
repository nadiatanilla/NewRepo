package PracticeSelenium;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P1  {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/dynamic-elements-loading.php");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement start=driver.findElement(By.xpath("//button[text()='Start']"));
        start.click();

        WebElement message= driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBePresentInElement(message,"Welcome Syntax Technologies"));

        String text=message.getText();
        System.out.println(text);
    }
}
