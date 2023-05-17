package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElement {
    public static void main(String[] args) throws InterruptedException {
        // instance
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
// maximize the window alwaz
        driver.manage().window().maximize();
        Thread.sleep(5000);
        //
        driver.findElement(By.id("email")).sendKeys("nadia.chakouch21@gmail.com");

        driver.findElement(By.name("pass")).sendKeys("fghjkkkjjj");
        Thread.sleep(2000);
        String currentUrl=driver.getCurrentUrl();
        System.out.println(currentUrl);
        String title=driver.getTitle();
        System.out.println(title);
        driver.quit();
    }
}
